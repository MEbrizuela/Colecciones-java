/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author MAXI
 */
public class linkedlistejemplo {
     public static void main(String[] args) {
        // Crear una LinkedList
        LinkedList<String> nombres = new LinkedList<>();

        //Agregar nuevos elementos al final de LinkedList usando el método add
         nombres.add("Fede");
         nombres.add("Cristian");
         nombres.add("Pablo");
         nombres.add("Hugo");
         nombres.add("Abel");
         nombres.add("Fabian");
         

        System.out.println("Initial LinkedList : " + nombres);
        
        nombres.add(3, "Loana");
        System.out.println("Luego agrega(pos->3, \"Loana\") : " + nombres);
        
         //eliminar ultimo elemento de la lista
        String element = nombres.removeLast();  
        System.out.println("Removio el ultimo elemento Fabian " + element + " => " + nombres);
        
        System.out.println("\n=== Iterar lista ===");
        Iterator<String> nombresIterator = nombres.iterator();
        while (nombresIterator.hasNext()) {
            String nom = nombresIterator.next();
            System.out.println(nom);
        }
        // lista ordenada    
        System.out.println("Lista desordenada: " + nombres);
        nombres.sort(Comparator.naturalOrder());

        System.out.println("Lista ordenada : " + nombres);
        
     }
     
}
