public class Dog extends Animal {

    String type = "Собака";
    String brain;

    Dog(){}

    Dog(int food, String location){
        super(food, location);
    }

    public void makeNoise (){
        System.out.println(type +  " спит");
    }
    public void eat(){
        System.out.println(type + " покушала");
    }

}
