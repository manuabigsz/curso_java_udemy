/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author manu
 */
public class Matriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos alunos?  ");
        int qdAlu = entrada.nextInt();

        System.out.print("Quants notas por aluno  ");
        int qdNot = entrada.nextInt();

        double[][] notasDaTurma = new double[qdAlu][qdNot];
        double total = 0;
        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; i < notasDaTurma.length; j++) {
                System.out.printf("Informe a nota %d do aluno %d: ", i, j);
                notasDaTurma[i][j] = entrada.nextDouble();
                total += notasDaTurma[i][j];
            }

            double media = total / (qdAlu * qdNot);

            System.out.println("Média da turma: " + media);
        }

        entrada.close();
    }
}
