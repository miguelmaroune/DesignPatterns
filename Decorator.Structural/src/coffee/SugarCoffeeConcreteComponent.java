package coffee;

public class SugarCoffeeConcreteComponent extends CoffeeBaseDecorator{

    public SugarCoffeeConcreteComponent(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "  Then Add some sugar!";
    }

}
