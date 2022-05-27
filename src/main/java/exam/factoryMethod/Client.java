package exam.factoryMethod;

public class Client {

    public static void main(String[] args) {

        PelotaFutbol pelotaFutbol = new PelotaFutbolCreator().creator();
        Camiseta camiseta = new CamisetaCreator().creator();
        Shorts shorts = new ShortsCreator().creator();
        Medias medias = new MediasCreator().creator();
        Tenis tenis = new TenisCreator().creator();

        pelotaFutbol.showInfo();
        camiseta.showInfo();
        shorts.showInfo();
        medias.showInfo();
        tenis.showInfo();






    }

}
