import java.util.Random;

public class App2 {
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println(client.sum(4,8));
        client.name = "Wiesiek";
        client.powiedzImie();

        Client client2 = new Client();
        client2.name = "Karol";
        client2.powiedzImie();

        client2.sum(3.3, 6.6);

        System.out.println(5);
        System.out.println("ahsgd");
        System.out.println(client);

        client2.sum(true, true);
        client2.sum(123L, 123L);
        Random losowacz = new Random();
        losowacz.nextInt(0, 100);

        double d = client2.sum(3,7);

    }
}
