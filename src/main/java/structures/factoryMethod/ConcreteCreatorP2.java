package factoryMethod.structure;

public class ConcreteCreatorP2 extends Creator {

    //Logica....

    @Override

    public ConcreteProduct2 factoryMethodProduct() { //Se encarga de la creacion del segundo objeto

        System.out.println("Empezando la creacion de P2...");

        //La idea, es que, si el objeto es dificil de crear, nosotros podemos crear toda
        //esa logica aqui

        ConcreteProduct2 product = new ConcreteProduct2();

        //Logica de creacion de ConcreteProduct2...

        return product;

    }



}
