/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao.desafio;

/**
 *
 * @author manu
 */
public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente ("Maria");
        
        Compra com1 = new Compra();
        com1.addItem("Caneta", 9.67,100);
        com1.addItem(new Produto(1894.42,"Notebook"),2);
    
        c1.listaCompra.add(com1);
    
        System.out.println(c1.obterValorTotal());
    
    }
}
