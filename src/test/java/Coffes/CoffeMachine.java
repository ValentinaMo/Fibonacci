package Coffes;

import java.io.PrintStream;
import java.util.Scanner;

public class CoffeMachine {
    Scanner input = new Scanner(System.in);

    public void SelectingCoffee(String type, String size, int num_coffees){
        switch (type){
            case "Cappuccino":
                System.out.println("---------------------- Cappuccino coffee in process ----------------------");
                CoffeeBuilder cappuccino = new CoffeeBuilder(type, size, num_coffees);
                CoffeeIngredients cappuccinoIngredients = cappuccino.coffeeCups(2)
                        .ouncesWater(4)
                        .ouncesMilk(1)
                        .build();
                receipt(cappuccinoIngredients);
                break;
            case "Latte":
                System.out.println("---------------------- Latte coffee in process ----------------------");
                CoffeeBuilder late = new CoffeeBuilder(type, size, num_coffees);
                CoffeeIngredients lateIngredients = late.coffeeCups(3)
                        .ouncesMilk(2)
                        .build();
                receipt(lateIngredients);
                break;
            case "Carajillo":
                System.out.println("---------------------- Carajillo coffee in process ----------------------");
                CoffeeBuilder carajillo = new CoffeeBuilder(type, size, num_coffees);
                CoffeeIngredients carajilloIngredients = carajillo.coffeeCups((float) 0.5)
                        .oucesLicor(3)
                        .iceCubes(5)
                        .ouncesWater((float) 0.5)
                        .build();
                receipt(carajilloIngredients);
                break;
            default:
                System.out.println("Please enter a correct coffee name");
                //We can create any type of coffee just building the ingredients
        }
    }

    private void receipt(CoffeeIngredients coffee){
        System.out.println("You ordered " + coffee.getNumberOfCoffees() + " " + coffee.getSize() + " " + coffee.getType() +
                "s. \n");
        //Here we can print any of the coffee ingredients. Example:
        System.out.println("The coffe has " + coffee.getCoffeeCups() + " numbers of cups");
    }


}
