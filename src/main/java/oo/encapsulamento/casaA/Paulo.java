/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.encapsulamento.casaA;

/**
 *
 * @author Laboratório
 */
public class Paulo {

    Ana esposa = new Ana();

    void testaAcessos() {
        // segredo
        //facoDentroDeCasa 
        //formaDeFalar
        //TodosSabem 

        //System.out.println(esposa.segredo); segredo é algo privado, não é possível acessar.
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.TodosSabem);
    }
}
