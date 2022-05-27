package exam.singleton;

public class Tesis {

    private String titulo;
    private String mencion;
    private Estudiante datosEstudiante;

    public Tesis() {}


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMencion() {
        return mencion;
    }

    public void setMencion(String mencion) {
        this.mencion = mencion;
    }

    public Estudiante getDatosEstudiante() {
        return datosEstudiante;
    }

    public void setDatosEstudiante(Estudiante datosEstudiante) {
        this.datosEstudiante = datosEstudiante;
    }
}
