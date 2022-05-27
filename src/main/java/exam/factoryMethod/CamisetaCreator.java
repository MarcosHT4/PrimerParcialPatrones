package exam.factoryMethod;

public class CamisetaCreator extends ElementoCreator{


    @Override
    public Camiseta creator() {

        Camiseta camiseta = new Camiseta();

        camiseta.setTamanio("L");
        camiseta.setColor("Verde");
        camiseta.setGarantia("Siempre");

        return  camiseta;

    }
}
