package exam.singleton;

import java.util.Date;

public class Client {

    public static void main(String[] args) {

        JefeRecursosHumanos jefeRecursosHumanos  = new JefeRecursosHumanos();

        jefeRecursosHumanos.setCi("65776LP");
        jefeRecursosHumanos.setNombre("Pablo");

        Tesis tema1 = new Tesis();
        Tesis tema2 = new Tesis();
        Tesis tema3 = new Tesis();
        Tesis tema4 = new Tesis();

        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();
        Estudiante estudiante4 = new Estudiante();

        estudiante1.setCi("4365456LP");
        estudiante2.setCi("3453454SCZ");
        estudiante3.setCi("4567457CBBA");
        estudiante4.setCi("98234LP");
        estudiante1.setNombre("Juan");
        estudiante2.setNombre("Jose");
        estudiante3.setNombre("Dalas");
        estudiante4.setNombre("Javi");



        tema1.setTitulo("Ing Sistemas");
        tema1.setMencion("Informatica");
        tema1.setDatosEstudiante(estudiante1);

        tema2.setTitulo("Ing Medioambiental");
        tema2.setMencion("Agronomia");
        tema2.setDatosEstudiante(estudiante2);


        tema3.setTitulo("Ing Petrolera");
        tema3.setMencion("Petrolero");
        tema3.setDatosEstudiante(estudiante3);

        tema4.setTitulo("Ing Animal");
        tema4.setMencion("Ganadero");
        tema4.setDatosEstudiante(estudiante4);


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                jefeRecursosHumanos.registrarTesis(tema1, new Date());

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                jefeRecursosHumanos.registrarTesis(tema2, new Date());

            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {

                jefeRecursosHumanos.registrarTesis(tema3, new Date());

            }
        });


        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {

                jefeRecursosHumanos.registrarTesis(tema4, new Date());

            }
        });

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {

                jefeRecursosHumanos.registrarTesis(tema1, new Date());

            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        jefeRecursosHumanos.mostrarDatosRegistro();






    }

}
