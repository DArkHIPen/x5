package Zoo;

public class Horse extends Animal {

    private String type = "Лошадь";
    private boolean horseshoe;

    public Horse(String food, String location) {
        super(food, location);
    }

    public Horse(String food, String location, boolean horseshoe) {
        super(food, location);
        this.horseshoe = horseshoe;
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
