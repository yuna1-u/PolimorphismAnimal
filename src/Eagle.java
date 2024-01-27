public class Eagle extends Animal{
    public Eagle() {
    }

    public Eagle(String name) {
        super(name);
    }

    public void fly(){
        System.out.println("The eagle is flying");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
