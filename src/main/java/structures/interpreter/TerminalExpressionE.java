package structures.interpreter;

public class TerminalExpressionE extends AbstractExpression{



    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("E")) {

            context.output = context.output+"5";
            context.input = context.input.substring(1);

        }


    }
}
