import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal[] animals = new Animal[]{new Shark("rara"), new Turtle("tata"), new Eagle("wawa")};

        System.out.println(Arrays.toString(animals));
        System.out.println("----------------------------------");
        animal.method(new Shark("Lala"));
        System.out.println("----------------------------------");
        animal.method(new Turtle("Kaka"));
        System.out.println("----------------------------------");
        animal.method(new Eagle("gaga"));



    }
}