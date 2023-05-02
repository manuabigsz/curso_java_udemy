/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.heranca;

/**
 *
 * @author manu
 */
public class Jogador {

    int vida=100;
    int x;
    int y;

    
    Jogador(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);
        
        if(deltaX == 0 && deltaY == 1){
            oponente.vida-=10;
            return true;
        }else if(deltaX == 1 && deltaY==0){
             oponente.vida-=10;
            return true;
        }else{
            return false;
        }
        
        
        
    }
    
    
    boolean andar(Direcao direcao) {

        switch(direcao){
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                x++;
                break;
            case OESTE:
                x--;
                break; 
        }
        /*if (direcao == Direcao.NORTE) {
            y++;
        }*/
        return true;
    }
}
