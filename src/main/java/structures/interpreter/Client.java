package builder.structure;

public class Client {

    public static void main(String[] args) {

        Director director = new Director();

        ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();

        director.setBuilder(concreteBuilder1);
        director.buildProduct();

        Product product = director.getProductFromBuilder();
        product.showInfo();



    }

}
