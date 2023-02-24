/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

/**
 *
 * @author manu
 */
public class Motor {

    Carro carro;
    boolean ligado = false;
    double fatorInjecao = 1;

    
    Motor(Carro carro){
this.carro = carro;    
    }
    int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }
}
