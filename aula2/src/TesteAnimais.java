/* testar se as classe cachorro e gato retornam suas
características por meio do método main(principal) que acessa 
a classe ObjetoAnimais.

para compilar
javac -cp ../classe/ *  TesteAnimais.java -d ../classe/

para executar
java -cp ../classe/ TesteAnimais 
*/
public class TesteAnimais{
	public static void main(String[] args){
		ObjetoAnimais obj = new ObjetoAnimais();
		
		System.out.println("O cachorro faz "+ obj.latido);
		System.out.println("O cachorro tem "+ 
		obj.patasCachorro + " patas");
		System.out.println("O cachorro come "+ obj.alimentoCachorro);
		 
		 System.out.println("O gato faz "+ obj.miado);
		System.out.println("O gato tem "+ 
		obj.patasGato + " patas");
		System.out.println("O gato come "+ obj.alimentoGato);
	}
}
