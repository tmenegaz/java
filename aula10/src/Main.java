import com.mti.agencia.CadastroHotel;
import com.mti.agencia.Hotel;

import java.util.Iterator;

public class Main {

  public static void main(String[] args) {
    Hotel hotelOton = new Hotel("Othon", "Salvador", 180d);
    Hotel hotelIbis = new Hotel("Ibis", "SP", 120d);
    Hotel hotelReal = new Hotel("Real", "RJ", 340d);
    Hotel hotelVila = new Hotel("Vila", "CE", 340d);

    CadastroHotel cadastroHotel = new CadastroHotel();
    cadastroHotel.adicionar(hotelOton);
    cadastroHotel.adicionar(hotelIbis);
    cadastroHotel.adicionar(hotelReal);
    cadastroHotel.adicionar(new Hotel("Bela Praia", "Ilheus", 340d));
    cadastroHotel.adicionar(new Hotel("Fazenda Aurora", "Passo Fundo", 98d));

    Iterator<Hotel> hotelItr = cadastroHotel.obterTodos().iterator();
    while (hotelItr.hasNext()) {
      System.out.println(hotelItr.next());
    }

    System.out.println(cadastroHotel.obterTodos().size());

//    cadastroHotel.remover(hotelReal);
//    cadastroHotel.removerPorCidade("Ilheus");
    cadastroHotel.removerPorNome("Othon");

    cadastroHotel.ordenarPorPreco();

    for (Hotel hotel: cadastroHotel.obterTodos()) {
      System.out.println(hotel);
    }

    System.out.println(cadastroHotel.obterTodos().size());

  }

}
