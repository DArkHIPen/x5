package Zoo;

public class Animal {

    private String food;
    private String location;
    private String type;

    public Animal(String food, String location){
        this.food = food;
        this.location = location;
    }
    public String getFood() {
        return food;
    }
    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }
    public  void makeNoise(){
        System.out.println(type + " спит.");
    }
    public void eat(){
        System.out.println(type + " кушает " + getFood());
    }

    public void sleep(){
        food += 1;
        System.out.println("Животное проснулось.");

    }

}
