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
public class Cliente {
    final String nome;
    final List<Compra> listaCompra = new ArrayList<>();
    
    Cliente(String nome){
        this.nome=nome;
    }
    
    double obterValorTotal(){
    double total = 0;
    for(Compra c: listaCompra){
        total += c.obterVT();
    }
    
    return total;
    }
}
