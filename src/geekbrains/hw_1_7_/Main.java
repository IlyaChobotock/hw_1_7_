package geekbrains.hw_1_7_;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik", 15, false);
        cats[1] = new Cat("Pushok", 19, false);
        cats[2] = new Cat("Muska", 16, false);
        cats[3] = new Cat("Duska", 21, false);
        cats[4] = new Cat("Kukuska", 13, false);

        Plate plate = new Plate(36);

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        System.out.println(plate);

    }
}