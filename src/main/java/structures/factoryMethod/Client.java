package factoryMethod.structure;

public class Client {

    public static void main(String[] args) {

        //Si necesito un objeto concreto, por ejemplo ConcreteProduct1, lo hacemos con el creador...

        ConcreteProduct1 prod1 = new ConcreteCreatorP1().factoryMethodProduct();



    }

}
