/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author MAXI
 */
public class Coleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         List<String> animales = new ArrayList<>();

        // Agregar nuevos elementos a la ArrayList
        animales.add("Leon");
        animales.add("Tigre");
        animales.add("Camello");
        animales.add("Caballo");
        animales.add("Cebra");
        animales.add("Bufalo");

        System.out.println(animales);

        // Agregar un elemento en un índice particular en una ArrayList
        animales.add(2, "Elefante");
        animales.add(5, "Aguila");

        System.out.println(animales);
        
        //Eliminar el elemento en el índice `3`
        animales.remove(3);
        System.out.println("After remove(3): " + animales);
        
        //eliminar toda la lista
        /*animales.clear();
        System.out.println("After clear(): " + animales);*/
        
        //Iterando lista 
        System.out.println("\n=== Recorriendo lista con un iterador ===");
        Iterator<String> animalesIterator = animales.iterator();
        while (animalesIterator.hasNext()) {
            String animal = animalesIterator.next();
            System.out.println(animal);
        } 
         // lista ordenada    
        System.out.println("Lista desordenada: " + animales);
        animales.sort(Comparator.naturalOrder());

        System.out.println("Lista ordenada : " + animales);
    }
    
    
}
