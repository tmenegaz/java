package atividade;
/*
O fluxo proposto não é possível, pois a classe Sub1 é final.
Quando uma classe é declarada como final não é possível extende-la,
apenas instancia-la.
para compilar a atividade
javac Super.java -d ../classe/
javac -cp ../classe/ Sub1.java -d ../classe/
javac -cp ../classe/ Sub1a.java -d ../classe/

para executar a atividade
java -cp ../classe/ atividade.Sub1a
*/
abstract class Super{
    public abstract String voar();
    public String raio(){
        String cor = "vermelho";
        return cor;
    }
}
