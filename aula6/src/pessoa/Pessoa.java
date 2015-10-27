/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author tmenegaz
 */
public class Pessoa {
    
    /* variável comacesso público de tipo primitivo char
    chamada caractere com valor a
    */
    public char caractere = 'a';
    
    /* variável com acesso protected de tipo primitivo int
    chamada idade com valor a
    */
    protected int idade = 40;
    
    /* variável de acesso default com referência ao objeto
    array do tipo primitivo char chamada nome com tamanho igual a 5
    */
    char[] nome = new char[5];
    
    // método com acesso default
    int getIdade(){
        return this.idade;
    }
    
     // método com acesso public
    public int getIdadeP(){
        return this.idade;
    }
    
    // método com acesso  private
    private char getCaractere(){
        return this.caractere;
    }
    
    
     /* variável com acesso private de tipo String
    chamada sobrenome com valor padrão
    */

    /* metodo com acesso  público chamado setNome que
    retorna um char e não tem parâmetro.
    */
    public char setNome(){
        nome[0] = 'T';
        nome[1] = 'i';
        nome[2] = getCaractere(); 
        nome[3] = 'g';
        nome[4] = 'o';
        for (int i = 0; i < nome.length; i++){
            System.out.print(nome[i]);
        }
        return ' ';
    }
//    public static void main(String[] args){
//        Pessoa pessoa = new Pessoa();
//        pessoa.setNome();
//        System.out.println("Caractere é " + pessoa.caractere);
//    }
    
     private String sobrenome;
    
    // método com acesso  protected
    protected void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;        
    }
    
    public String getSobrenome(){return this.sobrenome;}
    
}


















