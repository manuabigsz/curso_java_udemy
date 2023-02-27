/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao.desafio;

/**
 *
 * @author manu
 */
public class Item {
   final Integer quantidade;
   final Produto produto;
    
    Item(Integer quantidade, Produto produto ){
        this.quantidade=quantidade;
        this.produto = produto;
    }
}
