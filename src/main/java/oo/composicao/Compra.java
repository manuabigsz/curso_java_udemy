/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

import java.util.ArrayList;

/**
 *
 * @author manu
 */
public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void addItem(String nome, int quantidade, double preco) {
       this.addItem(new Item(nome, quantidade, preco));
    }
    
    void addItem(Item item) {
        itens.add(item);
        item.compra = this;
    }

    
    double getvalorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.preco;
        }
        return total;
    }

}
