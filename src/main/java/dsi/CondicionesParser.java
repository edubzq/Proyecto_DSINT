package dsi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CondicionesParser {

public List<Condicion> parseConditions(String filePath) {
        List<Condicion> condiciones = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            Pattern favorPattern = Pattern.compile("(\\w+) tiene el (\\w+) de (\\w+)");
            Pattern objetoPattern = Pattern.compile("^(.+?) (no )?tiene (.+)$");
            Pattern accionPattern = Pattern.compile("(\\w+) (\\w+) (\\w+)");
            
            while ((line = br.readLine()) != null) {
                Matcher matcherFavor = favorPattern.matcher(line);
                Matcher matcherObjeto = objetoPattern.matcher(line);
                Matcher matcherAccion = accionPattern.matcher(line);
                
                if (matcherFavor.find()) {
                    condiciones.add(new Condicion(matcherFavor.group(1), matcherFavor.group(2), matcherFavor.group(3)));
                }
                else if (matcherObjeto.find()) {
                String aux = matcherObjeto.group(2) != null ? "no tiene" : "tiene";
                condiciones.add(new Condicion(formatearString(matcherObjeto.group(3)), aux, formatearString(matcherObjeto.group(1))));

                } else if (matcherAccion.find()) {
                	condiciones.add(new Condicion(matcherAccion.group(3), matcherAccion.group(2), matcherAccion.group(1)));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return condiciones;

    }

public List<Meta> parseMetas (String filePath) {
	List<Meta> metas = new ArrayList<>();
	try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;
        Pattern preguntaPattern = Pattern.compile(
            "¿Puede\\s+(\\w+)\\s+(\\w+)(?:\\s+a)?\\s+(.*?)\\?"
        );

        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.startsWith("¿Puede")) {
                Matcher matcherPregunta = preguntaPattern.matcher(line);
                if (matcherPregunta.matches()) {
                    String sujeto = matcherPregunta.group(1).trim();
                    String accion = matcherPregunta.group(2).trim();
                    String objeto = matcherPregunta.group(3).trim();
                    
                    metas.add(new Meta(
                        formatearString(sujeto),
                        accion.toLowerCase(),
                        formatearString(objeto))); 
                    	
                    
                } else {
                    System.out.println("No se pudo parsear la meta: " + line);
                }
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return metas;
}



/* Funcion auxiliar para formatear Strings
 
	Entrada: Caso de Hades
	Salida: CascoHades
	
	En cadenas como "Las Ninfas" deja unicamente "
*/
public static String formatearString(String input) {
    StringBuilder resultado = new StringBuilder();
    String[] palabras = input.split("\\s+");

    List<String> palabrasIgnoradas = Arrays.asList("Las", "El", "La", "Los", "De", "Del", "Al", "A");

    for (String palabra : palabras) {
        if (!palabrasIgnoradas.contains(palabra) && Character.isUpperCase(palabra.charAt(0))) {
            resultado.append(palabra);
        }
    }
    
    String resultadoAux = resultado.toString();
    switch (resultadoAux) {
    case "CapacidadVuelo":
    	resultadoAux = "Volar";
    	break;
    default:
    	break;
    }
    return resultadoAux;
}

}