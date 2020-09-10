public class Cat extends Animal {
    String type = "Кошка";
    String heart;

    Cat(){}

    Cat(int food, String location){
        super(food, location);
    }

    public void makeNoise (){
        System.out.println("Кошка спит");
    }
}
