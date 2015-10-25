package pacotex;
public abstract class Abstrata implements Interface1 {
    public String nome = "Tiago";
    
    public double soma(){
        return 2 + 2;
    }
    
    public double mult(){
        return 4 * soma();
    }
    
    public abstract double sub();
}
