/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.heranca.teste;

import oo.heranca.desafio.Camaro;
import oo.heranca.desafio.Fusca;
import oo.heranca.desafio.carro;

/**
 *
 * @author 20212PF.CC0010
 */
public class CarroTeste {

    public static void main(String[] args) {
        carro c = new Fusca();

        c.acelerar();
        System.out.println(c);
        c.acelerar();
        System.out.println(c);
        c.acelerar();
        c.frear();
        System.out.println(c);
        
        Camaro c2 = new Camaro();
        
        c2.acelerar();
        System.out.println(c);
        c2.acelerar();
        System.out.println(c2);
        c2.acelerar();
        c2.frear();
        System.out.println(c2);
    }
}
