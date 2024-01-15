import com.mti.detran.Carro;
import com.mti.detran.Proprietario;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Proprietario tiago = new Proprietario("Tiago", "12345678911");
        Proprietario stela = new Proprietario("Stela", "12345678912");
        Proprietario laiz = new Proprietario("Laiz", "12345678913");
        Proprietario leticia = new Proprietario("Letícia", "12345678914");
        Proprietario larissa = new Proprietario("Larissa", "12345678915");

        Carro bmw = new Carro("bmw-12345", "X3");
        Carro honda = new Carro("hon-12345", "HRV");
        Carro ford = new Carro("for-12345", "KA");
        Carro gm = new Carro("gmo-12345", "Opala");
        Carro porsche = new Carro("por-12345", "911");

        Map<Carro, Proprietario> proprietarios = new HashMap<>();

        proprietarios.put(bmw, tiago);
        proprietarios.put(honda, stela);
        proprietarios.put(ford, laiz);
        proprietarios.put(gm, leticia);
        proprietarios.put(porsche, larissa);

//        System.out.println(proprietarios);

        for (Carro carro : proprietarios.keySet()) {
            Proprietario proprietario = proprietarios.get(carro);
            System.out.printf("%nCarro%s do(a) %s%n",carro.getModelo(), proprietario.getNome());
        }

        proprietarios.remove(gm);

        for (Map.Entry<Carro, Proprietario> entry : proprietarios.entrySet()) {
            System.out.println(entry);
        }
    }
}