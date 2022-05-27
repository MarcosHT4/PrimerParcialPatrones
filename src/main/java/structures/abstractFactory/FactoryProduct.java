package abstractFactory.structure;

public class FactoryProduct {

    public static IProduct make(String typeProduct) {

        IProduct product;

        switch(typeProduct.toLowerCase()) {

            case "product1":
                product = new ConcreteProduct1();
                // logica...
                break;

            case "product2":
                product = new ConcreteProduct2();
                //logica...
                break;

            default:
                product = new ConcreteProduct3();
                //logica...
                break;


        }




        return product;


    }

}
