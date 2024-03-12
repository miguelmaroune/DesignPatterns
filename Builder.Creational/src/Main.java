import builder.PhoneBuilder;
import builder.PizzaBuilder;
import model.HawaiianPizzaBuilder;
import model.Phone;
import model.Pizza;
import model.Waiter;

public class Main {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println("Pizza ordered: " + pizza);
        PhoneBuilder phoneBuilder = new PhoneBuilder();
        Phone phone = phoneBuilder
                                  .setCamera(1)
                                  .setProcessor("Android")
                                  .setScreenSize(770)
                                  .buildPhone();
        System.out.println("phone built : "+ phone);
    }

}