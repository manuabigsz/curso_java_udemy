/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author manu
 */
public class Exercicio {

    public static void main(String[] args) {
        double[] notasAlunosA = new double[4];
        notasAlunosA[0]= 10;
        notasAlunosA[1] = 8;
        notasAlunosA[2] = 6;
        notasAlunosA[3] = 6;

        System.out.println(Arrays.toString(notasAlunosA));
    
        double total = 0;
        for(int i = 0; i<3;i++){
        total += notasAlunosA[i];
               
        }
    
        System.out.println(total/3);
    }
}
