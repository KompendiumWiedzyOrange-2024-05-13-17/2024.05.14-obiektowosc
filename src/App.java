import java.util.Random;

public class App {
    public static void main(String[] args) {
        Client client = new Client();
        Random losowacz = new Random();
        int[] tab = new int[10];
        Client client2 = new Client();
        client.name = "Janusz";
        client.surname = "Kowalski";
        client.age = 30;
        client.pesel = 123123123L;

        Address a1 = new Address();
        a1.street = "Ogrodowa";
        a1.city = "Krakow";
        a1.no = 50;
        a1.postCode = "12-123";

        client.address = a1;

        /*************************************/

        Client c1 = new Client();
        Client c2 = c1;

        c1.name = "Janusz";

        System.out.println(c1.name);
        System.out.println(c2.name);

        c2.name = "Wiesiek";

        System.out.println(c1.name);
        System.out.println(c2.name);


        Client c3 = new Client();
        c3.name = c2.name;
        c3.surname = c2.surname;
        c3.age = c2.age;
        c3.pesel = c2.pesel;
    }
}
