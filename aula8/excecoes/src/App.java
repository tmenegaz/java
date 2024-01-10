import com.mti.banco.ContaCorrente;
import com.mti.banco.ValorException;

public class App {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("123");
        
        cc.ativar();
        try {
            cc.depositar(200);
        } catch (ValorException e) {
            System.out.println("Erro: " + e.getMessage() + e.getCause());
            e.printStackTrace();
        }

        try {
            cc.sacar(10);
        } catch (ValorException e) {
            System.out.println("Erro: " + e.getMessage() + e.getCause());
            e.printStackTrace();
        }

        ContaCorrente cn = new ContaCorrente("456");

        cn.ativar();
        try {
            cc.tranferir(cn, 100);
        } catch (ValorException e) {
            System.out.println("Erro: " + e.getMessage() + e.getCause());
            e.printStackTrace();
        }
        try {
            cn.sacar(10);
        } catch (ValorException e) {
            System.out.println("Erro: " + e.getMessage() + e.getCause());
            e.printStackTrace();
        }

        System.out.println("CC -> " + cc.getSaldo());
        System.out.println("CN -> " + cn.getSaldo());
    }
}
