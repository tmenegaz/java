/* para compilar
 * javac -cp ../classe/ TesteEstudo.java -d ../classe/
 * ********************
 * para executar
 * java -cp ../classe/ TesteEstudo
 * */
import exame.certificacao.CertEstudo;

public class TesteEstudo {
	public static void main (String[] args) {
		 CertEstudo es = new CertEstudo();
		System.out.println(es.saida);
	}	
}
