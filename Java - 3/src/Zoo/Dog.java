package Zoo;

public class Dog extends Animal {
    private String type = "Собака";
    private boolean brain;

    public Dog(String food, String location) {
        super(food, location);
    }

    public Dog(String food, String location, boolean brain) {
        super(food, location);
        this.brain = brain;
    }

    @Override
    public void makeNoise() {
        System.out.println(this.type + " спит");
    }

    @Override
    public void eat() {
        System.out.println(type + " кушает " + getFood());
    }

    @Override
    public String getType() {
        return this.type;
    }

}
