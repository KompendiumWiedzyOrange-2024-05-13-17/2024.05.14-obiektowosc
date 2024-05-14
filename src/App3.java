public class App3 {
    public static void main(String[] args) {
        Client client = new Client();
        client.name = "Janusz";
        client.surname = "Kowalski";
        client.age = 40;
        client.pesel = 1234124L;

        Client client2 = new Client("Janusz", "Kowalski", 40, 1234124L);
        System.out.println(client2.name);
        System.out.println(client2.surname);
        System.out.println(client2.age);
        System.out.println(client2.pesel);
    }
}
