/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author MAXI
 */
public class hashmapejemplo {
    public static void main(String[] args) {
      Map<String, Integer> numMapping = new HashMap<>();

        // Agregar pares clave-valor a un HashMap
       
        numMapping.put("Uno", 1);
        numMapping.put("Dos", 2);
        numMapping.put("Tres", 3);
        numMapping.put("Cuatro", 4);
        numMapping.put("Cinco", 5);

        System.out.println(numMapping);
        
        System.out.println("\n=== Iterar ===");
        Set<Map.Entry<String, Integer>> numMappingEntries = numMapping.entrySet();
        Iterator<Map.Entry<String, Integer>> numMappingIterator = numMappingEntries.iterator();
        while (numMappingIterator.hasNext()) {
            Map.Entry<String, Integer> entry = numMappingIterator.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());   
        }
        String numero = "Tres";
        Integer simbolo = numMapping.remove(numero);

        System.out.println("numero (" + numero + " => " + simbolo + ")");
        System.out.println("Nuevo mapeo : " + numMapping);
        
        
    }
    
}
