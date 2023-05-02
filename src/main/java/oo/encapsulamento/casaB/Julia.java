/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

/**
 *
 * @author Laboratório
 */
public class Julia {
   
    void testaAcessos() {
        // segredo
        //facoDentroDeCasa 
        //formaDeFalar
        //TodosSabem 

         Ana sogra = new Ana();
         
       // System.out.println(sogra.segredo);// segredo é algo privado, não é possível acessar.
        //System.out.println(sogra.facoDentroDeCasa);
        //System.out.println(sogra.formaDeFalar); //necessario acessar sem a mae
        System.out.println(sogra.TodosSabem);
    }
}
