package structures.factoryMethod;

public class ConcreteCreatorP2 extends Creator {


    @Override

    public ConcreteProduct2 factoryMethodProduct() {

        System.out.println("Empezando la creacion de P2...");

        ConcreteProduct2 product = new ConcreteProduct2();

        return product;

    }



}
