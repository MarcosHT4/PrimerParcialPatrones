package exam.factoryMethod;

public class MediasCreator extends ElementoCreator{


    @Override
    public Medias creator() {

        Medias medias = new Medias();

        medias.setTamanio("XXL");
        medias.setColor("Azules");
        medias.setGarantia("Siempre");

        return medias;

    }
}
