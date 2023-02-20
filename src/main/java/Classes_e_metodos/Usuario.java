/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes_e_metodos;

/**
 *
 * @author manu
 */
public class Usuario {

    String nome;
    String email;

    public boolean equals(Object obj) {
        if(obj instanceof Usuario){
        Usuario outro = (Usuario) obj;
        boolean nomeIgual = outro.nome.equals(this.nome);
        boolean emailIgual = outro.email.equals(this.email);
        
        return nomeIgual && emailIgual; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }else{
        return false;
        }
    
    }

}
