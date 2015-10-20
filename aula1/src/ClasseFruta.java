/* Classe para criar um objeto fruta.
Os modificadores de acesso são:
    public, protected, private e default
As classes possuem dois tipos de modificadores de acesso, a saber:
    public e default

Modificadores que não são referentes a acesso:
    strict, final, abstract

para compilar:
javac ClasseFruta.java -d ../classe/fruteira/
***************************
para executar:
não é possível pois não tem o método main
*/
/** Quando utiliza-se o modificador public da classe
o nome do arquivo deverá ser igual ao nome da classe.
A classe é acessada no mesmo pacote e, se em pacote diferente,
usa-se a diretiva import
*/

package fruteira;
public class ClasseFruta {
/* dentro das classes existem 2 membros:
    variáveis e métodos
*/
    public String nomeFruta1 = "maça";
    public String nomeFruta2 = "manga", nomeFruta3 = "banana";
/* modificador de acesso: public;
tipo de dados: String para um objeto de referência;
nome da variável de referência: nomeFruta<n>;
valores das variáveis coerentes com o tipo de dado apresentado.
*/
}   
