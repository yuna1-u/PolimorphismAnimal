public class Turtle extends Animal{
    public Turtle() {
    }

    public Turtle(String name) {
        super(name);
    }

    public void swim(){
        System.out.println("The turtle is swimming");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
