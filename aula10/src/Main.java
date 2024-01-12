import com.mti.agencia.CadastroHotel;
import com.mti.agencia.Hotel;

public class Main {

  public static void main(String[] args) {
    Hotel hotelOton = new Hotel("Oton", "Salvador", 180d);
    Hotel hotelIbis = new Hotel("Ibis", "SP", 120d);
    Hotel hotelReal = new Hotel("Real", "RJ", 340d);

    CadastroHotel cadastroHotel = new CadastroHotel();
    cadastroHotel.adicionar(hotelOton);
    cadastroHotel.adicionar(hotelIbis);
    cadastroHotel.adicionar(hotelReal);
    cadastroHotel.adicionar(new Hotel("Bela Praia", "Ilheus", 320d));
    cadastroHotel.adicionar(new Hotel("Fazenda Aurora", "Passo Fundo", 98d));

    for (Hotel hotel: cadastroHotel.obterTodos()) {
        System.out.println(hotel);        
    }

    System.out.println(cadastroHotel.obterTodos().indexOf(hotelIbis));
  }
}
