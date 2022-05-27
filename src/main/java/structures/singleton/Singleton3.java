package structures.singleton;

import java.util.Date;

public class Singleton3 {


    private static Singleton3 instance;



    private Singleton3() {
        System.out.println("Creando mi singleton");


    }


    private synchronized static void multiThreadControl() {

        if(instance == null) {

            instance = new Singleton3();

        }



    }



    public static Singleton3 getInstance() {

        if(instance == null) {

            multiThreadControl();

        }

        return instance;

    }

    public void time() {

        System.out.println("Time " + new Date());

    }

    public void resetSingleton() {

        instance = null;

    }



}
