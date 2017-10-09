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

    public int getPizzaNameId(){
        if ("Margarita".equals(this.getPizzaName())) return 1;
                else if ("Hawaii".equals(this.getPizzaName())) return 2;
                        else if ("Diablo".equals(this.getPizzaName())) return 3;
                                else return 4;
    }
    public static void updatePriceOfPizza(Pizza pizza) {
        if (pizza!= null && "Big".equals(pizza.getPizzaSize())){
            pizza.price *= 2;
        }
    }

    public static void calculatePriceOfPizza(Pizza pizza){
        if (pizza!= null) {
            switch (pizza.getPizzaNameId()){

                case 1:
                    pizza.setCalories(pizza.getCalories() + 200);
                    pizza.setPrice(pizza.getPrice() + 1.50);
                    break;
                case 2:
                    pizza.setCalories(pizza.getCalories() + 400);
                    pizza.setPrice(pizza.getPrice() + 2.75);
                    break;
                case 3:
                    pizza.setCalories(pizza.getCalories() + 100);
                    pizza.setPrice(pizza.getPrice() + 5.50);
                    break;
                case 4:
                    pizza.setCalories(pizza.getCalories() + 700);
                    pizza.setPrice(pizza.getPrice() + 10.50);
                    break;
            }
        }
    }
    // constructors

    public Pizza() {
        this.pizzaName="Pizza of the day";
        this.pizzaSize= "Small";
        this.setCalories(300);
        this.setPrice(2.50);
    }

    public Pizza(String pizzaName) {
        this();
        this.pizzaName = pizzaName;
    }

    @Override
    public String toString() {
        return "You ordered 1 " + pizzaSize + '\'' +
                " pizza '" + pizzaName + '\'' +
                "', that has " + calories +
                "calories and price " + price;
    }
}

public class App {
    public static void main(String[] args) {


        Pizza myPizza = null;
        pizzaSelectionByUser(myPizza);
        System.out.println(myPizza);

    }

    private static void pizzaSelectionByUser(Pizza pizza) {

// Greeting

        System.out.println("Welcome to Trattoria!\n");
        System.out.println("Please enter the desired name of pizza:");
        System.out.println("1- Margarita");
        System.out.println("2- Hawaii");
        System.out.println("3- Diablo");
        System.out.println("4- 4 Cheases");


        // TBD Захист від дураків :)

        int idSelectedPizza;
        Scanner choise = new Scanner(System.in);
        idSelectedPizza = choise.nextInt();

        while (idSelectedPizza > 4 || idSelectedPizza < 1) {
            System.out.println("Please enter 1 to 4!");
            idSelectedPizza = choise.nextInt();
        }
        //Pizza selection

        switch (idSelectedPizza){
            case 1:
                pizza=new Pizza("Margarita");
                break;
            case 2:
                pizza=new Pizza("Hawaii");
                break;
            case 3:
                pizza=new Pizza("Diablo");
                break;
            case 4:
                pizza=new Pizza("4 Cheases");
                break;
            default:
                pizza=new Pizza();
                break;
        }
    }
}
