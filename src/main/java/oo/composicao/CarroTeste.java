/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

/**
 *
 * @author manu
 */
public class CarroTeste {

    public static void main(String[] args) {
        Carro c1 = new Carro();

        System.out.println(c1.estaLigado());

        c1.ligar();
        System.out.println(c1.estaLigado());

        System.out.println(c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        //faltou encapsulamento.
        //c1.motor.fatorInjecao = -30;
        
        //relação bidirecional
        System.out.println(c1.motor.carro.motor.carro.motor.giros());
        
        System.out.println(c1.motor.giros());
    }

}
