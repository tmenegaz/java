/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filha;
import pai.SuperClasse;


public class SubClasse extends SuperClasse {
    /*
    O método mostra não pode ser substituido na subclasse, pois
    possui o modificador final em sua assinatura.
    */
//    private void mostra(){
//        System.out.println("Alguma outra coisa");
//    }
    
    public static void main(String[] args){
        SuperClasse sc = new SuperClasse();
        sc.mostra();
        sc.fazCoisa("numeros: ", 4, 3, 2, 1, 0);
    }
}





