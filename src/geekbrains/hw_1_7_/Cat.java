package geekbrains.hw_1_7_;

public class Cat {
    private String name;
    private double appetite;
    private boolean full = false;

    public Cat(String name, double appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }

    public void eat(Plate plate) {
        System.out.println("\n" + name);
        System.out.println(plate.catFull(appetite));
        plate.decreaseFood(appetite);
    }

}
