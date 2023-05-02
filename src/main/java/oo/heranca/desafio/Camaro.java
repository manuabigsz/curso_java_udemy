/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.heranca.desafio;

/**
 *
 * @author 20212PF.CC0010
 */
public class Camaro extends carro{

    public Camaro(){
    super(220);
    }
    
    @Override//efeito de validação, está de fato sobreescrevendo um metodo.
    public void acelerar() {
       velAtual += 10;
    }
    
}
