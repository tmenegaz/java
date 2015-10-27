/*
 * Aula sobre modificadores não referentes a acesso para 
métodos e variáveis.
Obs.: não existem modificador de acesso para variáveis locais. O
único modificador que pode ser utilizado é o final.
 */
package pai;

/**
 *
 * @author tmenegaz
 */
public class SuperClasse {
    /* usar a palavra reservada final para impedir a
    substituição do método em uma subclasse.    
    */
    public final void mostra(){
        System.out.println("Alguma coisa");
    }  

    /*determinar um método com lista de argumentos variáveis
    para tipos de dados primitivos ou de referência.
    è possível mistrura argumentos variáveis com argumentos não
    variáveis. Os argumentos variáveis são arrays com tamanho
    determinado a partir da quantidade de argumentos enviados
    ao método.    
    */
    public void fazCoisa(String nome, int... x){
        
        System.out.print(nome);
        for (int i  = 0; i < x.length; i++){
        System.out.print(x[i]);}
        System.out.println("");
    }
    
}
























