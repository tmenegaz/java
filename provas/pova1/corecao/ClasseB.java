package br.com.contradominio;
import br.com.dominio.ClasseA;
// javac -cp ../corecao/ ClasseB.java -d ../corecao/
public class ClasseB{
    public static void main (String[] args){
        ClasseA ca = new ClasseA();
        System.out.println(ca.classeA);
    }
}
// java -cp ../corecao/ br.com.contradominio.ClasseB