import coffee.Coffee;
import coffee.CreamCoffeeConcreteComponent;
import coffee.SimpleCoffee;
import coffee.SugarCoffeeConcreteComponent;

public class Main {

    public static void main(String[] args) {
        INotifier notifyAll = new FacebookDecorator(new WhatsAppDecorator(new Notifier("Geekific")));
        notifyAll.send("Like and Subscribe!!!");

        System.out.println("==========================================");

        INotifier notifyFbMail = new FacebookDecorator(new Notifier("Geekific"));
        notifyFbMail.send("Like and Subscribe!!!");

        System.out.println("============================================");
        Coffee sugarAndCreamCoffee = new SugarCoffeeConcreteComponent(new CreamCoffeeConcreteComponent(new SimpleCoffee()));
        System.out.println("suggar Coffee cost is : "+ sugarAndCreamCoffee.getCost());
        System.out.println(sugarAndCreamCoffee.getDescription());
    }

}