package pacotey;
import pacotex.Abstrata;
class Concreta extends Abstrata{
    // da interface
    public double div(){
        return mult() / soma();        
    }
    
    // da abstrata
    public double sub(){
        return div() - soma();
    }
    
    // da abstrata
    public void saida(){
        System.out.println(super.nome + ", " + INFO);
        System.out.println("soma = " + super.soma());
        System.out.println("subtração = " + sub());
        System.out.println("multiplicação = " + super.mult());
        System.out.println("divisão = " + div());
    }
}