package prototype.structure;

public class Client {

    public static void main(String[] args) {

        ConcretePrototype1 obj1 = new ConcretePrototype1();

        obj1.setAttribute1("Valor1");
        obj1.setAttribute2("Valor2");
        obj1.setAttribute3("Valor3");
        obj1.setAttribute4("Valor4");
        obj1.setAttribute5("Valor5");
        obj1.setAttribute6("Valor6");
        obj1.setAttribute7("Fecha de caducidad: 9/9/2022");

        System.out.println("obj1 " + obj1.getAttribute1());
        System.out.println("obj1 " + obj1.getAttribute2());
        System.out.println("obj1 " + obj1.getAttribute3());
        System.out.println("obj1 " + obj1.getAttribute4());
        System.out.println("obj1 " + obj1.getAttribute5());
        System.out.println("obj1 " + obj1.getAttribute6());
        System.out.println("obj1 " + obj1.getAttribute7());

        //Ahora si, para poder clonar el objeto1:

        ConcretePrototype1 obj2 = (ConcretePrototype1) obj1.clone(); //Ahora no estamos apuntando a un segmento de memoria, lo estamos clonando

        obj2.setAttribute7("Fecha de caducidad: 4/4/2024");

        System.out.println("obj2 " + obj2.getAttribute1());
        System.out.println("obj2 " + obj2.getAttribute2());
        System.out.println("obj2 " + obj2.getAttribute3());
        System.out.println("obj2 " + obj2.getAttribute4());
        System.out.println("obj2 " + obj2.getAttribute5());
        System.out.println("obj2 " + obj2.getAttribute6());
        System.out.println("obj2 " + obj2.getAttribute7());


    }

    //Como podemos ver, el cambiar el atributo en obj2, no cambio en absoluto el atributo del obj1; por lo tanto,
    //la clonacion ha sido exitosa

}