import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class BigD {
  public static void main(String[] args) {
    BigDecimal a = new BigDecimal("10");
    BigDecimal b = new BigDecimal("3");

    String dif = a.subtract(b).toString();
    System.out.println(dif);

    divide(a, b);
  }

  static void divide(BigDecimal a, BigDecimal b) {
    Locale.setDefault(new Locale("pt", "BR"));

    
    BigDecimal cociente = a.divide(b, 2, RoundingMode.HALF_EVEN);
    NumberFormat nf = new DecimalFormat("\u00A4 #,###,###.###");
    System.out.println(nf.format(cociente));

  }
}