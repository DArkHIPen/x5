public class Animal {

    int food;
    String location;

    Animal(){}

    Animal(int food, String location){
        this.food = food;
        this.location = location;
    }

    public  void makeNoise(){
        System.out.println("Животное спит.");
    }
    public void eat(int eat){
        food -= eat;
        System.out.println("Вес стал " + food);
    }

    public void sleep(){
        food += 1;
        System.out.println("Животное проснулось.");

    }

}
