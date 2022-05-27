package interpreter.structure;

public class TerminalExpressionC extends AbstractExpression{



    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("C")) {

            context.output = context.output+"3";
            context.input = context.input.substring(1);

        }


    }
}
