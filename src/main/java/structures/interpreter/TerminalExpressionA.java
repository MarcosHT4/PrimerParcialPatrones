package interpreter.structure;

public class TerminalExpressionA extends AbstractExpression{

    /*

    Como dato de entrada, van a enviar un contexto = A B C D E
    Si en el mensaje, encontramos la letra A, remplazamos por el numero 1 en el mensaje original

        dato entrada luego de esto = B C D E
        dato salida luego de esto = 1



     */

    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("A")) {

            context.output = context.output+"1"; //Nuestra salida pasa de ser "", a ser "1"
            context.input = context.input.substring(1); //Nuestra entrada pasa de ser "A B C D E" a ser "B C D E"

        }


    }
}
