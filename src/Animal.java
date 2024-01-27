import java.util.Arrays;

public class Animal {

    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void method() {

    }

    public void method(Animal animal) {
        if (animal instanceof Shark) {
            Shark[] sharks = new Shark[1];
            sharks[0] = (Shark) animal;
            System.out.println(Arrays.toString(sharks));
            new Shark().attack();
        } else if (animal instanceof Turtle) {
            Turtle[] turtles = new Turtle[1];
            turtles[0] = (Turtle) animal;
            System.out.println(Arrays.toString(turtles));
            new Turtle().swim();
        } else if (animal instanceof Eagle) {
            Eagle[] eagles = new Eagle[1];
            eagles[0] = (Eagle) animal;
            System.out.println(Arrays.toString(eagles));
            new Eagle().fly();
        }
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }


}

