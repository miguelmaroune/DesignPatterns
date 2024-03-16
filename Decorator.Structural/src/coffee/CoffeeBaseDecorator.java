package coffee;

public class CoffeeBaseDecorator implements Coffee{

    Coffee coffee;

    public CoffeeBaseDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

}
