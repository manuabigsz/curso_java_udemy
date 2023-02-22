/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author manu
 */
public class Pilha {

    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O pqueno principe");
        livros.push("Dom Quixote");
        livros.push("O Hobbit");

        for(String livro: livros){
        System.out.println(livros);
        }
        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.remove());
        System.out.println(livros.pop());
        //livros.size();
        //livros.clear();
        //livros.contains();
        //livros.isEmpty();
    }
}
