package Zoo;

public class Cat extends Animal {
    private String type = "Кошка";
    private boolean heart;

    public Cat(String food, String location) {
        super(food, location);
    }

    public Cat(String food, String location, boolean heart) {
        super(food, location);
        this.heart = heart;
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
