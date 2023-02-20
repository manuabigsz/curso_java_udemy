/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes_e_metodos;

/**
 *
 * @author manu
 */
public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "nome";
        u1.nome ="noemdsad!diasja.com";
        
        Usuario u2 = new Usuario();
        u2.nome = "nome";
        u2.nome ="noemdsad!diasja.com";
        
        System.out.println(u1.equals(u2)); // é igual a x
        System.out.println(u2.equals(u1));
        
        
    }
}
