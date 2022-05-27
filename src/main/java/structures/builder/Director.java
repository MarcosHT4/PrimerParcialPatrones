package structures.builder;

public class Director {

    private Builder builder;

    public Product getProductFromBuilder() {

        return builder.product;

    }

    public void setBuilder(Builder builder) {

        this.builder = builder;

    }

    public void buildProduct() {

        builder.createProduct();

        builder.buildAttribute1();
        builder.buildAttribute2();
        builder.buildAttribute3();
        builder.buildAttribute4();
        builder.buildAttribute5();

    }

}
