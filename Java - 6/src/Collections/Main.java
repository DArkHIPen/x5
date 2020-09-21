package Collections;

public class Main {

    public static void main(String[] args) {
        ArraysCollection<String> myArrayCollection = new ArraysCollection();

        myArrayCollection.add("Каждый");
        myArrayCollection.add("Охотник");
        myArrayCollection.add("Желает");
        myArrayCollection.add("Знать");
        myArrayCollection.print();
        System.out.println(myArrayCollection.get(2));
        System.out.println(myArrayCollection.size());
        myArrayCollection.clear();
        myArrayCollection.print();

        ListCollections<String> link = new ListCollections<>();
        link.add("Где");
        link.add("Сидит");
        link.add("Фазан");
        link.print();
        System.out.println(link.size());
        link.remove(2);
        link.remove("111");
        link.print();
        System.out.println(link.get(1));
        link.clear();
        link.print();

    }
}
