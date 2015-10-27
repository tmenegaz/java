/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variaveis.primitivas;

/**
 *
 * @author tmenegaz
 */
public class QuatroOperacoes {
    /* variáveis primitivas podem ser declaradas como:
    variáveis de classe static;
    variáveis de instância;
    parâmetros de método;
    variáveis locais.
    Com a exceção dos parâmetros e das variáveis locais, as
    variáveis podem ter os 4 tipos de modificadores de acesso.
    */
    /* variáveis de instância com diferentes tipod de acesso e
    tipos não referentes a acesso. podem ser ou não iniciadas
    com uma valor.
    Poderia ser também public ou protected ou private */
    byte a = 2; // defaul
    public static short b = 34; // public e static
    public static final int X = 2, Y = 3; //constante
    protected long z = 123456789; 
    private float t = 4.5f;
    double w = 3.4;
    static char c = 'C';
    final boolean v = true, f = false;
    
    public void metodParametro(final int x){
        // parâmetros nunca são iniciados.
        System.out.print("Método com parâmetro final");
    }
    
    public void metodVariavelLocal(){
        //variáveis locais sempre deverão ser iniciadas
        int a = 0;
        final char d = 'd';
        System.out.print("Método com variáveis locais");
    }
    
    
    
}
