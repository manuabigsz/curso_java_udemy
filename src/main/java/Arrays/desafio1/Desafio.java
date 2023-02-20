/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays.desafio1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author manu
 */
public class Desafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantas notas deseja ler? ");
        int i = entrada.nextInt();
        
        double [] notas = new double[i];
        System.out.println(i);
        
        for(int j = 0; j < notas.length;j++){
        System.out.print("Informe a nota " + j + ": ");
        notas[j] = entrada.nextInt();
        }
        
        System.out.println(Arrays.toString(notas));
        
        double total=0;
        for(double nota: notas){
        total+=nota;
        }
        double media = total / notas.length;
        
          System.out.println("Média das notas: "+media);
        entrada.close();
    }
}
