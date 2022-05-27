package structures.singleton;

public class ClientSingleton3 {

    public static void main(String[] args) {

        Thread user1 = new Thread(new Runnable() {
            @Override
            public void run() {

                Singleton3 s1 = Singleton3.getInstance();
                s1.time();
                System.out.println("singleton1: " + s1);

            }
        });

        Thread user2 = new Thread(new Runnable() {
            @Override
            public void run() {

                Singleton3 s2 = Singleton3.getInstance();
                s2.time();
                System.out.println("singleton2: " + s2);

            }
        });

        Thread user3 = new Thread(new Runnable() {
            @Override
            public void run() {

                Singleton3 s3 = Singleton3.getInstance();
                s3.time();
                System.out.println("singleton3: " + s3);

            }
        });

        user1.start();
        user2.start();
        user3.start();



    }

}
