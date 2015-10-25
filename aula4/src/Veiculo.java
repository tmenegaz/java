package fabrica;
abstract class Veiculo {
/* variáveis globais
private é um modificador de acesse
que permite que a variável ou métod
 seja visto apenas dentro da classe.
 double é um tipo de dado primitivo
 para números de ponto flutuante.
 */
    private double custo;
    private String modelo, ano;
    
    public abstract void vaiRapido();
    public abstract void transportaCarga();
    public void tempoParada(){
        return;
    }    
}
