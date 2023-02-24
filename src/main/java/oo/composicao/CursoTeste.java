/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo.composicao;

/**
 *
 * @author manu
 */
public class CursoTeste {
    public static void main(String[] args) {
         Aluno a1 = new Aluno("Joao");
    Aluno a2 = new Aluno("Ana");
    Aluno a3 = new Aluno("Clara");

    Curso c1 = new Curso("Java Completo");
    Curso c2 = new Curso("Wb 2023");
    Curso c3 = new Curso("React Native");
    
    c1.addAluno(a1);
    c1.addAluno(a2);
    
    c2.addAluno(a1);
    c2.addAluno(a3);
    
    c3.addAluno(a1);
    c3.addAluno(a2);
    c3.addAluno(a3);
    
    for(Aluno aluno: c1.alunos){
    System.out.println("Curso 1: " + c1.nome);
    System.out.println("Nome do aluno: " + aluno.nome);
    }
    
    System.out.println(a1.cursos.get(0).alunos);
    
    
    Curso cursoEncontrado = a1.getCursoPorNome("Java Completo");
    
    if(cursoEncontrado != null){
    System.out.println(cursoEncontrado.alunos);
    }
    
    
    }
   
   

}
