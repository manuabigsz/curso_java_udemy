/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecoes;

import java.util.ArrayList;

/**
 *
 * @author manu
 */
public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
        
        Usuario u1 = new Usuario ("Ana");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        
        lista.remove(1);
        lista.remove("Carlos");
        
        
        System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
        for(Usuario u: lista){
        System.out.println(u.nome);
        }
        
        
    }
}
