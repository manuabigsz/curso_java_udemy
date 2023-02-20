/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes_e_metodos.Desafio;

/**
 *
 * @author manu
 */
public class Jantar {

    public static void main(String[] args) {
        Comida c1 = new Comida("Arroz", 0.223);
        Comida c2 = new Comida("Feijão", 0.300);

        Pessoa p = new Pessoa("Joao", 80.3);
        p.comer(c1);

        System.out.println(p.apresentar());
        p.comer(c2);

        System.out.println(p.apresentar());
        p.comer(c1);
        System.out.println(p.apresentar());

    }

}
