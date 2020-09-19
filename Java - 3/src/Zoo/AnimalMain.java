package Zoo;

public class AnimalMain {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]{
                new Dog("Сухой корм", "Химки"),
                new Dog("Ветчина", "Хамовники", true),
                new Cat("Сухой корм", "Сокольники"),
                new Cat("Мясо", "Санкт-Петербург", false),
                new Horse("Сено", "Бутово"),
                new Horse("Комбикорм", "Иваново", false)
        };

        Veterinar IlyaViktorovich = new Veterinar();
        for (Animal animal : animals) {
            IlyaViktorovich.treatAnimal(animal);
        }

    }
}
