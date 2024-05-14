public class Client {
    String name;
    String surname;
    int age = 50;
    long pesel = 123123123123L;
    Address address = new Address();

    Client() {
    }

    Client(String name, String surname, int age, long pesel) {
        this(name, surname, age);
        this.pesel = pesel;
    }

    Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    Client(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }

    int sum(int a, int b) {
        /*krok1();
        krok2();*/
        return a+b;
    }

    double sum(double a, double b) {
        /*krok1();
        krok2();*/
        return a+b;
    }

    long sum(long a, long b) {
        return a+b;
    }

    boolean sum(boolean a, boolean b) {
        if(a) {
           return false;
        } else if(!b) {
            return true;
        }
        return false;
    }

    void powiedzImie() {
        System.out.println("Moje imie to:");
        System.out.println(this.name);
    }

    void krok1() {
        //robimy krok 1 - 10 linijek
    }

    void krok2() {
        //robimy krok 2 - 10 linijek
    }
}
