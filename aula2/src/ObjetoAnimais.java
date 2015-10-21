/* classe para reunir os objetos criados a partir
da classe cachorro e da classe gato.

para compilar:
javac -cp ../classe/ * ObjetoAnimais.java  -d ../classe/
*/
import dormitorio.CorrecaoDeverCasa;
import canil.Cachorro;
import gatil.Gato;
public class ObjetoAnimais{
	Cachorro cachorro = new Cachorro();
	Gato gato = new Gato();
	CorrecaoDeverCasa animais = new CorrecaoDeverCasa();
	
	public String latido = cachorro.somCachorro;
	public int patasCachorro = animais.quantPatas;
	public String alimentoCachorro = animais.alimento;
	
	public String miado = gato.somGato;
	public int patasGato = animais.quantPatas;
	public String alimentoGato = animais.alimento;
}
