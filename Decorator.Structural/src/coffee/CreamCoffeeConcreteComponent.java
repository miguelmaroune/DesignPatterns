package coffee;

public class CreamCoffeeConcreteComponent extends  CoffeeBaseDecorator{
    Coffee coffee;

    public CreamCoffeeConcreteComponent(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Then add the cream !!!! ";
    }

}
