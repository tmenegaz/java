import com.mti.agencia.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotelOton = new Hotel("Oton", "Salvador", 180.00);
        System.out.println(hotelOton.getPrecoDiaria());
    }
}