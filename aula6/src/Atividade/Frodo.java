package Atividade;

import Atividade.corecao.Hobbit;

/* Corrigir o código abaixo a fim de ter uma classe pai Hobbit
e contextualizar a variável é o método para que rodem
dentro do método principal.
Classes e membros de classe são públicas.
public class Frodo Hobbit{
    meuOuro = 7
    contaOuro(meuOuro, 6);
    
    public static void main(String args){}
}
*/

public class Frodo extends Hobbit{
    
    private int contaOuro1(int x,int y){
    return super.contaOuro(x, y);
}    
    public static void main(String[] args){
        Frodo frodo = new Frodo();
        int meuOuro = 7;
        System.out.println(frodo.contaOuro1(meuOuro, 6));
    }
}
