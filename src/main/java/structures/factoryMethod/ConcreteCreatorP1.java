package structures.factoryMethod;

public class ConcreteCreatorP1 extends Creator {



    @Override

    public ConcreteProduct1 factoryMethodProduct() {

        System.out.println("Empezando la creacion de P1...");

        ConcreteProduct1 product = new ConcreteProduct1();

        return product;

    }



}
