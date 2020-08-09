package geekbrains.hw_1_7_;

public class Cat {
    private String name;


    public Cat(String name) { this.name = name; }

    public String getName() {
        return name;
    }

    public void eat(lesson7.Plate plate) {
        System.out.println(name + " eat");
        plate.decreaseFood(10);
    }

    public void fear(Dog dog) {
        System.out.println(name +" fear "+ dog.getName());
    }
}
