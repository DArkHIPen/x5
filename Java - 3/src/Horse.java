public class Horse extends Animal {
    String type = "Лошадь";
    String horseshoe;

    Horse(){
    }

    Horse(int food, String location){
        super(food, location);
    }

    public void makeNoise (){
        System.out.println("Лошадь спит");
    }
}
