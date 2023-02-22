/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecoes;

import java.util.HashSet;

/**
 *
 * @author manu
 */
public class Hash {

    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<Usuario>();
        usuarios.add(new Usuario("Pedro"));
        usuarios.add(new Usuario("Gui"));
        usuarios.add(new Usuario("Ana"));

        boolean resultado = usuarios.contains(new Usuario("Gui"));
        System.out.println(resultado);
        
        
    }
}
