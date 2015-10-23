package interfaces;
public class Bola implements Rolavel {

    public double grauRolagem(){
        double novoGrau = (RADIANO - 32.26);
        return novoGrau;       
    }
}
