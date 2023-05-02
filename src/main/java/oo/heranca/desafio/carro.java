/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.heranca.desafio;

/**
 *
 * @author 20212PF.CC0010
 */
public class carro {
    int velAtual;
   
    void acelerar(){
        velAtual+=5;
    }
    
    void frear(){
        if(velAtual >=5){
        velAtual -= 5;}else{
        velAtual=0;
        }
    }
    
    public String toString(){
        return "Velocidade atual é: " +  velAtual + " km.";
    }
}
