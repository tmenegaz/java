/* Os arquivos com o método main(principal) são usados para 
testar os objetos das demais classes e tambem para
iniciar aplicações desktop.
para compilar:
javac -cp ../classe/fruteira/  TesteObjeto.java -d ../classe/fruteira/
***************************
para executar:
java -cp ../classe/fruteira/ TesteObjeto
*/
public class TesteObjeto {
    public static void main (String[] args){
    // referência a classe ObjetoFruta
        ObjetoFruta teste;
   /* criação de um objeto fruta
   (instância da classe ObjetoFruta)
   */
        teste = new ObjetoFruta();
        System.out.println("O valor da variável saladaFruta é " +
                            teste.saladaFruta);
    }
}



















