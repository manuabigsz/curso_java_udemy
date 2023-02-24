/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

/**
 *
 * @author manu
 */
public class CompraTeste {

    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "Joao";
        c1.itens.add(new Item("Caneta", 20, 7.45));
        c1.addItem("Borracha", 3, 3.45);
        c1.itens.add(new Item("Caderno", 4, 12.45));

        System.out.println(c1.itens.size());
        System.out.println(c1.getvalorTotal());

        c1.itens.get(0).compra.itens.get(1).compra.getvalorTotal();
        System.out.println("O total é " + c1.getvalorTotal());

    }

}
