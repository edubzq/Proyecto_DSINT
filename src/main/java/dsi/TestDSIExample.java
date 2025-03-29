package dsi;


import java.util.LinkedList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class TestDSIExample {

	public static void main(String[] args) {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-rules-dsi");
		
		CondicionesParser parser = new CondicionesParser();
		String ruta = "src/main/resources/ficheros/Fase3.E8.txt";
		List<Condicion> condiciones = parser.parseConditions(ruta);
		List<Meta> metas = parser.parseMetas(ruta);
		LinkedList<String> diario = new LinkedList<String>();
		kSession.setGlobal("conditions", condiciones);
		kSession.setGlobal("objetivos", metas);
		kSession.setGlobal("diario", diario);
		
		
		kSession.getAgenda().getAgendaGroup("Iniciar").setFocus();
		kSession.fireAllRules();
	}

}

