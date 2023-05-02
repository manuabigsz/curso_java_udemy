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
public class Pedro extends Ana{
   
    void testaAcessos() {
        // segredo
        //facoDentroDeCasa 
        //formaDeFalar
        //TodosSabem 

         Ana mae = new Ana();
         
       // System.out.println(mae.segredo);// segredo é algo privado, não é possível acessar.
        //System.out.println(mae.facoDentroDeCasa);
        System.out.println(formaDeFalar); //necessario acessar sem a mae
        System.out.println(TodosSabem);
    }
}
