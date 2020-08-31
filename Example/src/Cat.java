public class Cat {

    private int age = 1; //возраст

    private String name; //имя

    private double weight; // вес



    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random(); // дандомный вес
        System.out.println("We have a new cat (=^ . ^=)\n");

    }
    public void setName(String name) // даем имя
    {
        this.name = name;
        System.out.println("Cat's name is " + name + "\n");
    }


    public void meow() {
            weight = weight - 1;
            System.out.println(name + " said: \"Meow\"\n"); // при методе meow тратится один пункт веса
    }


}
