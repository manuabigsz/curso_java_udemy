/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author manu
 */
public class ConjuntoComportado {
    public static void main(String[] args) {
       // Set<String> lista = new HashSet/*<String>*/();
       SortedSet<String> lista = new TreeSet/*<String>*/();//ordenado
        lista.add("Teste");
        lista.add("Ana");
        lista.add("sda");
        
        System.out.println(lista);
        
        for(String canditado: lista){
         System.out.println(canditado);
        }
        
        Set<Integer> nums = new HashSet/*<String>*/();
        nums.add(8);
        nums.add(4);
        nums.add(5);
        nums.add(8);
        
        for(int n: nums){
         System.out.println(n);
        }
    }
}
