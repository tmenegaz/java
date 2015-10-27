/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fora;

import pessoa.Pessoa;

/**
 *
 * @author tmenegaz
 */
public class TesteForaPacote extends Pessoa {
    
    void acessoProtec(){
        super.setSobrenome("Menegaz");
    }
    
//    public static void main(String[] args){
//        TesteForaPacote fora  = new TesteForaPacote();
//        fora.acessoProtec();
//        fora.setNome();        
//        System.out.println(" " + fora.getSobrenome());
//        System.out.println("Idade = " + fora.getIdadeP());
        /* não épossívelacessar o método getIdade(), pois o mesmo é
        default.
        */
        /* não é possível acessar membros de classe private 
        frora da classe que foram craidos.
        */
//    }   
}
