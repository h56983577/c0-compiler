package c0.analyser;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class C0ListenerParser {

    private List<String> statics = new ArrayList<>();

    public void parse(ParseTree parseTree) {
        ProgramListener programListener = new ProgramListener();
        new ParseTreeWalker().walk(programListener, parseTree);
    }

    class ProgramListener extends C0BaseListener {
        @Override
        public void enterProgram(C0Parser.ProgramContext ctx) {
            ItemListener itemListener = new ItemListener();
            ctx.item().forEach(itemContext -> {
                itemContext.enterRule(itemListener);
            });
        }

        @Override
        public void exitProgram(C0Parser.ProgramContext ctx) {
            super.exitProgram(ctx);
        }
    }

    class ItemListener extends C0BaseListener {
        @Override
        public void enterItem(C0Parser.ItemContext ctx) {
            FunctionListener functionListener = new FunctionListener();
            ctx.function().enterRule(functionListener);
        }

        @Override
        public void exitItem(C0Parser.ItemContext ctx) {
            super.exitItem(ctx);
        }
    }

    class FunctionListener extends C0BaseListener {
        @Override
        public void enterFunction(C0Parser.FunctionContext ctx) {
            String func = ctx.IDENT().getSymbol().getText();
            statics.add(func);
            ctx.function_param_list();
        }

        @Override
        public void exitFunction(C0Parser.FunctionContext ctx) {
            super.exitFunction(ctx);
        }
    }
}
