import com.mti.agencia.CadastroPacoteViagem;
import com.mti.agencia.PacoteViagem;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CadastroPacoteViagem cadastro = new CadastroPacoteViagem();
        cadastro.adicionar("Istambul e Capadócia (20 noites)", 18_000);
        cadastro.adicionar("Neve em Bariloche (10 noites)", 11_000);
        cadastro.adicionar("Disney (7 noites)", 10_000);
        cadastro.adicionar("Natal Luz em Gramado (5 noites)", 8_500);
        // cadastro.adicionar("Natal Luz em Gramado (5 noites)", 8_500);

        cadastro.removerPorDescricao("Disney (7 noites)");

       cadastro.ordenar();
    //    cadastro.ordenarPorPrecoDecrescente();

       PacoteViagem pacoteEncontrado = cadastro.buscarPorDescricao("Istambul e Capadócia (20 noites)");
       System.out.println("\nEncontrou: " + pacoteEncontrado + "\n");

        imprimirPacotes(cadastro.obterTodos());
    }

    private static void imprimirPacotes(List<PacoteViagem> pacotes) {
        for (PacoteViagem pacoteViagem : pacotes) {
            System.out.printf("descrição: %s%npreço: %.2f%n", pacoteViagem.getDescricao(), pacoteViagem.getPrecoPorPessoa());
        }
    }
}