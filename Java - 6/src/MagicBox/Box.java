package MagicBox;

import java.util.Arrays;

public class Box<T> {
    private Object[] box = new Object[0];

    public void add(T item) {
        if ((box.length == 0)) {
            Object[] result = new Object[box.length + 1];
            for (int i = 0; i < box.length; i++) {
                result[i] = box[i];
            }
            result[box.length] = item;
            box = result;
            item = null;
        } else {
            if ((item instanceof Orange) & (box[0] instanceof Orange) | (item instanceof Apple) & (box[0] instanceof Apple)) {
                Object[] result = new Object[box.length + 1];
                for (int i = 0; i < box.length; i++) {
                    result[i] = box[i];
                }
                result[box.length] = item;
                box = result;
                item = null;
            } else {
                System.out.println("Не совместимые фрукты.");
            }
        }
    }

    public void print() {
        System.out.println(Arrays.toString(box));
    }

    public double getWeight() {
        double temp = 0;
        if (box.length == 0) {
            temp = 0;
        } else {
            if (box[0] instanceof Orange) {
                temp = (box.length * 1.5);
            } else {
                if (box[0] instanceof Apple) {
                    temp = (box.length * 1);
                }
            }

        }
        return temp;
    }

    public boolean compare(Box underBox) {

        return (this.getWeight() == underBox.getWeight());
    }

    public Object getFruit(int i) {
        return box[i];
    }

    public int getLength() {
        return box.length;
    }

    private void clear() {

        for (int i = 0; i < box.length; i++) {
            box[i] = null;
        }
    }
}