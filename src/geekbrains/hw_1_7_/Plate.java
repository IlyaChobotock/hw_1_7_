package geekbrains.hw_1_7_;

import java.util.Scanner;

public class Plate {
    private double food;

    public Plate(double food) {
        this.food = food;
    }

    public boolean catFull (double amount) {
        return food >= amount;
    }

    public void decreaseFood(double amount) {
        if (food >= amount) {
            food -= amount;
            System.out.println("is full");
        } else if (food > 0 && food < amount) {
            double fullness = (food / amount);
            food -= food;
            System.out.println("isn't fully fed ");
            System.out.printf("Fullness is %.2f from 1\n", fullness);
            System.out.println("\nAdd food? Insert 1 for add or another key for exit: ");
            Scanner sc = new Scanner(System.in);
            int userVar = sc.nextInt();
            if (userVar == 1) {
                System.out.println("Add food: ");
                Scanner sc1 = new Scanner(System.in);
                int plusFood = sc1.nextInt();
                food += plusFood;
            }
        } else {
            System.out.println("is hungry. Plate is empty");
            System.out.println("\nAdd food? Insert 1 for add or another key for exit: ");
            Scanner sc = new Scanner(System.in);
            int userVar = sc.nextInt();
            if (userVar == 1) {
                System.out.println("Add food: ");
                Scanner sc1 = new Scanner(System.in);
                int plusFood = sc1.nextInt();
                food += plusFood;
            }

        }
    }

    @Override
    public String toString() {
        return "\nPlate {" + "food left = " + food + "}";
    }

}
