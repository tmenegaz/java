/* Classe que herda as características da classe pai.
Neste caso CertEstudo é filha de CertJava.
A abrangência do assunto para a certificação Java
deverá ser requisito básico nos estudos.
para compilar
javac -cp ../classe/ CertEstudo.java -d ../classe/
*/
package exame.certificacao;
import certificacoes.CertJava;
public class  CertEstudo extends CertJava {
	public String saida = super.assunto;
}
