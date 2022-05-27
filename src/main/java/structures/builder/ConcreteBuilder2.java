package structures.builder;

public class ConcreteBuilder2 extends Builder {

    @Override
    public void buildAttribute1() {

        product.setAtrribute1("B2 attribute1");

    }

    @Override
    public void buildAttribute2() {

        product.setAttribute2("B2 attribute2");

    }

    @Override
    public void buildAttribute3() {

        product.setAttribute3("B2 attribute3");

    }

    @Override
    public void buildAttribute4() {

        product.setAttribute4("B2 attribute4");

    }

    @Override
    public void buildAttribute5() {

        product.setAttribute5("B2 attribute5");

    }

}
