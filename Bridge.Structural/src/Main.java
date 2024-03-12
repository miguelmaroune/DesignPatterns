import abstractions.AmericanRestaurant;
import abstractions.ItalianRestaurant;
import abstractions.Restaurant;
import implementations.PepperoniPizza;
import implementations.VeggiePizza;

public class Main {

    public static void main(String[] args) {
        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("==========================================");

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();


    }

}