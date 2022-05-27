package exam.factoryMethod;

public class PelotaFutbolCreator extends ElementoCreator{


    @Override
    public PelotaFutbol creator() {

        PelotaFutbol pelotaFutbol = new PelotaFutbol();

        pelotaFutbol.setTamanio("XL");
        pelotaFutbol.setColor("Roja");
        pelotaFutbol.setGarantia("Siempre");

        return  pelotaFutbol;

    }
}
