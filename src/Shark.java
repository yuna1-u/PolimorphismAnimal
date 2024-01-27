public class Shark extends Animal {
    public Shark() {
    }

    public Shark(String name) {
        super(name);
    }

    public void attack() {
        System.out.println("The shark attaks");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
