public class AnimalMain {
    public static void main(String[] args) {


        Animal[] animals = new Animal[]{new Dog(7, "Химки"),
                new Cat(6, "Сокольники"), new Horse(19,"Бутово")};

        for (Animal animal : animals) {
            Veterinar.treatAnimal(animal);

        }



    }
}
