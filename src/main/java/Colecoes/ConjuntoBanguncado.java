/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecoes;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author manu
 */
public class ConjuntoBanguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2); // converte para uma classe double -> Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('e');
        
        System.out.println("Tamanho:  " + conjunto.size());
        conjunto.add("Teste");
        conjunto.add('e');
          System.out.println("Tamanho:  " + conjunto.size());
          
          System.out.println( conjunto.remove("teste"));
          System.out.println( conjunto.remove("Teste"));
          System.out.println( conjunto.remove('e'));
          
          System.out.println("Tamanho:  " + conjunto.size());
          
           System.out.println(conjunto.contains('x'));
           
           Set nums = new HashSet();
           nums.add(1);
           nums.add(2);
           
           System.out.println(nums);
           System.out.println(conjunto);
           
           conjunto.addAll(nums);
            System.out.println(conjunto);
            conjunto.retainAll(nums);
             System.out.println(conjunto);
             
             conjunto.clear();
              System.out.println(conjunto);
    }
}
