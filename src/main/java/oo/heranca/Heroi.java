/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.heranca;

/**
 *
 * @author manu
 */
public class Heroi extends Jogador{
   boolean atacar(Jogador oponente){
      boolean ataque1 = super.atacar(oponente);
      boolean ataque2 = super.atacar(oponente);
      return ataque1 || ataque2;
   }
}
