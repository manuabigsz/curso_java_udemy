/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

/**
 *
 * @author manu
 */
public class Item {
    String nome;
    int quantidade;
    double preco;
    Compra compra;
    
    Item(String nome, int quantidade, double preco){
    this.nome = nome;
    this.quantidade= quantidade;
    this.preco=preco;
    }
}
