public class App {
    public static void main(String[] args) 
     {
        String email = "tmenegaz@email.com";

        boolean valido = email.matches("[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}");
        System.out.println(valido);
    }
}
