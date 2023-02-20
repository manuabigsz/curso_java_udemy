/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes_e_metodos.Desafio;

/**
 *
 * @author manu
 */
public class Pessoa {

    String nome;
    Double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.peso;
        }
    }
    
    String apresentar(){
    return "Olá eu sou o " + nome + " e tenho " + peso + " KGs.";
    
    }
}
