package mentorship_sample;

import java.util.Scanner;

/**
 * Hello world!
 */

class Pizza {
    private String pizzaSize;
    private String pizzaName;
    private int calories;
    private double price;


    public String getPizzaName() {

        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {

        this.pizzaName = pizzaName;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void multPrice() {
        if (this.getPizzaSize().equals("Big")){
            this.price *= 2;
        }
    }
    public static void updatePriceOfPizza(Pizza pizza) {
        if (pizza!= null && "Big".equals(pizza.getPizzaSize())){
            pizza.price *= 2;
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaSize='" + pizzaSize + '\'' +
                ", pizzaName='" + pizzaName + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}

public class App {
    public static void main(String[] args) {


        Pizza myBuggyPizza = null;
        myMainMethod(myBuggyPizza);

    }

    private static void myMainMethod(Pizza myBuggyPizza) {
        System.out.println("Welcome to Trattoria!\n");

        // Setting pizza size
        System.out.println("Please enter the desired size of pizza:");
        System.out.println("1- Big");
        System.out.println("2- Small");

        int inpSize, inpName;
        Scanner choise = new Scanner(System.in);
        // TBD Захист від дураків :)

        inpSize = choise.nextInt();

        while (inpSize != 1 && inpSize != 2) {
            System.out.println("Please enter 1 or 2!");
            inpSize = choise.nextInt();
        }
        Pizza pizza = new Pizza();
        Pizza.updatePriceOfPizza(myBuggyPizza);
        System.out.println(pizza);
        switch (inpSize) {
            case 1:
                pizza.setPizzaSize("Big");
                pizza.setCalories(500);
                pizza.setPrice(3.50);
                System.out.println("You selected a big pizza");
                break;
            case 2:
                pizza.setPizzaSize("Small");
                pizza.setCalories(300);
                pizza.setPrice(2.50);
                System.out.println("You selected a small pizza");
                break;
        }

        Pizza pizza1 = new Pizza();
        pizza1.setPrice(123);
        Pizza.updatePriceOfPizza(pizza1);
        System.out.println("Price of the day for pizza1:"+pizza1.getPrice());

        pizza.multPrice();
        System.out.println("Price of the day "+pizza.getPrice());

        // Setting pizza name
        System.out.println("Please enter the desired name of pizza:");
        System.out.println("1- Margarita");
        System.out.println("2- Hawaii");
        System.out.println("3- Diablo");
        System.out.println("4- 4 Cheases");


        // TBD Захист від дураків :)
        inpName = choise.nextInt();

        while (inpName > 4 || inpName < 1) {
            System.out.println("Please enter 1 to 4!");
            inpName = choise.nextInt();
        }

        switch (inpName) {
            case 1:
                pizza.setPizzaName("Margarita");
                pizza.setCalories(pizza.getCalories() + 200);
                pizza.setPrice(pizza.getPrice() + 1.50);
                System.out.println("You selected Margarita pizza");
                break;
            case 2:
                pizza.setPizzaName("Hawaii");
                pizza.setCalories(pizza.getCalories() + 400);
                pizza.setPrice(pizza.getPrice() + 2.75);
                System.out.println("You selected Hawaii pizza");
                break;
            case 3:
                pizza.setPizzaName("Diablo");
                pizza.setCalories(pizza.getCalories() + 100);
                pizza.setPrice(pizza.getPrice() + 5.50);
                System.out.println("You selected Diablo pizza");
                break;
            case 4:
                pizza.setPizzaName("4 Cheases");
                pizza.setCalories(pizza.getCalories() + 700);
                pizza.setPrice(pizza.getPrice() + 10.50);
                System.out.println("You selected 4 Cheases pizza");
                break;
        }

        System.out.println("You ordered " + pizza.getPizzaSize() + " " + pizza.getPizzaName() + " pizza for " + pizza.getPrice() + " $");
        System.out.println("This pizza has " + pizza.getCalories() + " calories");
    }
}
