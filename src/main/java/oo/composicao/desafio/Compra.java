/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manu
 */
public class Compra {
    final List<Item> listaItens = new ArrayList<Item>();
    
    void addItem(Produto p, int quantidade){
        this.listaItens.add(new Item(quantidade,p));
    }
    
    void addItem(String nome, double preco, int qtd){
        var produto = new Produto(preco,nome);
        this.listaItens.add(new Item(qtd,produto));
    }
    
    double obterVT(){
    double total = 0;
    for(Item item: listaItens){
        total += item.quantidade*item.produto.preco;
    }
    return total;
    }
}
