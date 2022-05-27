package factoryMethod.structure;

public class ConcreteCreatorP1 extends Creator {

    //Logica....

    @Override

    public ConcreteProduct1 factoryMethodProduct() { //Se encarga de la creacion del primer objeto

        System.out.println("Empezando la creacion de P1...");

        //La idea, es que, si el objeto es dificil de crear, nosotros podemos crear toda
        //esa logica aqui

        ConcreteProduct1 product = new ConcreteProduct1();

        //Logica de creacion de ConcreteProduct1...

        return product;

    }



}
