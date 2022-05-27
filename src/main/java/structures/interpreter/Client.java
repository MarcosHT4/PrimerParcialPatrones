package structures.interpreter;

public class Client {

    public static void main(String[] args) {

        String msg = " A B C D E";

        NonTerminalExpressionParser parser = new NonTerminalExpressionParser(msg);

        System.out.println("Mensaje interpretado: " + parser.evaluateMsg());

    }

}
