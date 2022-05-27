package structures.builder;

public class Director {

    private Builder builder;

    public Product getProductFromBuilder() {

        return builder.product;

    }

    public void setBuilder(Builder builder) { //Por aqui, mandamos un ConcreteBuilder

        this.builder = builder;

    }

    public void buildProduct() { //Esto nos sirve para construir el objeto completo.

        builder.createProduct();

        builder.buildAttribute1();
        builder.buildAttribute2();
        builder.buildAttribute3();
        builder.buildAttribute4();
        builder.buildAttribute5();

    }

}
