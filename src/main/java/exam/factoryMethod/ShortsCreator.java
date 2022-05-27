package exam.factoryMethod;

public class ShortsCreator extends ElementoCreator{


    @Override
    public Shorts creator() {

        Shorts shorts = new Shorts();

        shorts.setTamanio("XS");
        shorts.setColor("Gris");
        shorts.setGarantia("Nunca");

        return  shorts;

    }
}
