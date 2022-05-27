package structures.singleton;

import java.util.Date;

public class Singleton1 {

    private static Singleton1 instance;


    private Singleton1() {
        System.out.println("Creando mi singleton");


    }


    public static Singleton1 getInstance() {

        if(instance == null) {

            instance = new Singleton1();

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
