package structures.abstractFactory;

public class Client {

    public static void main(String[] args) {

        IProduct p = FactoryProduct.make("product1");

        p.method1();
        p.method2();




    }



}
