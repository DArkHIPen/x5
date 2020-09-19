package Zoo;

public class Veterinar {
    public void treatAnimal(Animal animal) {
        System.out.println(animal.getType() + " питается кормом: \"" + animal.getFood()
                + "\", расположение: " + animal.getLocation());
    }
}
