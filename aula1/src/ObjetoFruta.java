/* Uma classe não é um objeto. Ela informa a MVJ como criar
um objeto desse tipo específico.
O objeto será criado a partir da palavra reservada "new"
referenciando uma variável que recebe a atribuição da classe.
Esse objeto terá o seu próprio estado e terá acesso ao 
comportamento(método) definido pela sua classe.

para compilar:
javac -cp ../classe/fruteira/  ObjetoFruta.java -d ../classe/fruteira/
***************************
para executar:
não é possível pois não tem o método main
*/
import fruteira.ClasseFruta;
public class ObjetoFruta {
/* declaração de uma variável de referência do tipo ClasseFruta,
denominada fruta.
*/
    ClasseFruta fruta = new ClasseFruta();
/*A partir do new, cria-se o objeto para a variávels
de referência fruta.
*/
    public String saladaFruta = fruta.nomeFruta1 + ", " +
                                fruta.nomeFruta2 + " e " +
                                fruta.nomeFruta3;
}





















