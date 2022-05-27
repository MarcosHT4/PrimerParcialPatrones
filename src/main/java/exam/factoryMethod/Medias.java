package exam.factoryMethod;

public class Medias implements IElemento {

    private String tamanio;
    private String color;
    private String garantia;

    public Medias() {}

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }


    @Override
    public void showInfo() {

        System.out.println("Medias: ");
        System.out.println("Tamanio: " + getTamanio());
        System.out.println("Color: " + getColor());
        System.out.println("Garantia " + getGarantia());
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

    }
}
