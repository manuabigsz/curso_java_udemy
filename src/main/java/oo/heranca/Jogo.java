/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.heranca;

/**
 *
 * @author manu
 */
public class Jogo {

    public static void main(String[] args) {
        /*Jogador j1 = new Jogador();
        j1.x=20;
        j1.y=6;
        j1.andar(Direcao.LESTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.LESTE);
        j1.andar(Direcao.NORTE);
        
        System.out.println("X: " + j1.x);
        System.out.println("Y: " + j1.y);*/

        Jogador j1 = new Jogador(10,10);
        

        Jogador j2 = new Jogador(10,11);
        
        System.out.println(j1.vida);
        System.out.println(j2.vida);

        j1.atacar(j2);
        
        System.out.println(j1.vida);
        System.out.println(j2.vida);
        
        Heroi h = new Heroi(10,10);
       
        
        
        Monstro m = new Monstro();
        m.x = 10;
        m.y = 11;
        
         System.out.println("Vida heroi: " + h.vida);
          System.out.println("Vida monstro: " + m.vida);
          h.atacar(m);
          m.atacar(h);
          System.out.println("Vida heroi: " + h.vida);
          System.out.println("Vida monstro: " + m.vida);
    }
}
