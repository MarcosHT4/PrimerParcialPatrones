package interpreter.structure;

public class TerminalExpressionD extends AbstractExpression{


    @Override
    public void interpreter(Context context) {

        if(context.input.startsWith("D")) {

            context.output = context.output+"4";
            context.input = context.input.substring(1);

        }


    }
}
