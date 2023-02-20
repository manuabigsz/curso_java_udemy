/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author manu
 */
public class ForEach {
    public static void main(String[] args) {
        double [] notas = {9.6,9.5,6,5.7};
        for (int i=0; i<notas.length;i++){
        System.out.println(notas[i]);
        }
        
        for(double nota:notas){
            System.out.println(nota + " ");
        }
    }
}
