import br.com.mti.interfaces.Calculadora;
import br.com.mti.modelo.CalculadoraImpl;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Double> n = new ArrayList<>();
        n.add(2d);
        n.add(3d);

        Calculadora soma = new CalculadoraImpl();
        soma.operacao(n, '+');
        soma.resultado();


        Calculadora subtracao = new CalculadoraImpl();
        n.set(1, n.get(1) * (-1d));
        subtracao.operacao(n, '-');
        subtracao.resultado();

        Calculadora multiplicacao = new CalculadoraImpl();
        n.set(1, n.get(1) * (-1d));
        multiplicacao.operacao(n, '*');
        multiplicacao.resultado();

        Calculadora divisao = new CalculadoraImpl();
        divisao.operacao(n, '/');
        divisao.resultado();

    }
}
