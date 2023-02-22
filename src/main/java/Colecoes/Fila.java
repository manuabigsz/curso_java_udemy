/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author manu
 */
public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        
        //Offer e add -> add elementos. Diferença é o comportamento
        // quando a fila está cheia!
        
        fila.add("Ana");
        fila.offer("Bia"); 
        fila.add("Gui");
        fila.offer("Carlos"); 
        fila.add("Joao");
        fila.offer("Daniel"); 
        
        //peek e element - obtem proximo elemento da fila sem remover.
        //Diferença de comportamento ocorrre quando a fila está
        // vazia
        System.out.println(fila.peek());//null se estiver vazia
        System.out.println(fila.element());//lança uma exceção
        System.out.println(fila.peek());
        
        //fila.size();
        //fila.clear();
        //fila.isEmpty();
        
        //pool e remove -> obtem proximo elemento da fila e remove
       //Diferença de comportamento ocorrre quando a fila está
        // vazia
        System.out.println(fila.poll());
        System.out.println(fila.remove());//lança exceção quando está vazia
        
        //fila.contains(..);
        //
       
    }
}
