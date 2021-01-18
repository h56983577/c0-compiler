// Generated from D:/大三上/编译技术/c0-compiler/src/main/resources\C0.g4 by ANTLR 4.9
package c0.analyser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link C0Parser}.
 */
public interface C0Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link C0Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(C0Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(C0Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(C0Parser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(C0Parser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(C0Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(C0Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(C0Parser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(C0Parser.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterExpr2(C0Parser.Expr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitExpr2(C0Parser.Expr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(C0Parser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(C0Parser.Binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#operator_expr}.
	 * @param ctx the parse tree
	 */
	void enterOperator_expr(C0Parser.Operator_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#operator_expr}.
	 * @param ctx the parse tree
	 */
	void exitOperator_expr(C0Parser.Operator_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#negate_expr}.
	 * @param ctx the parse tree
	 */
	void enterNegate_expr(C0Parser.Negate_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#negate_expr}.
	 * @param ctx the parse tree
	 */
	void exitNegate_expr(C0Parser.Negate_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(C0Parser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(C0Parser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#as_expr}.
	 * @param ctx the parse tree
	 */
	void enterAs_expr(C0Parser.As_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#as_expr}.
	 * @param ctx the parse tree
	 */
	void exitAs_expr(C0Parser.As_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#call_param_list}.
	 * @param ctx the parse tree
	 */
	void enterCall_param_list(C0Parser.Call_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#call_param_list}.
	 * @param ctx the parse tree
	 */
	void exitCall_param_list(C0Parser.Call_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#call_expr}.
	 * @param ctx the parse tree
	 */
	void enterCall_expr(C0Parser.Call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#call_expr}.
	 * @param ctx the parse tree
	 */
	void exitCall_expr(C0Parser.Call_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#literal_expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_expr(C0Parser.Literal_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#literal_expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_expr(C0Parser.Literal_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#ident_expr}.
	 * @param ctx the parse tree
	 */
	void enterIdent_expr(C0Parser.Ident_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#ident_expr}.
	 * @param ctx the parse tree
	 */
	void exitIdent_expr(C0Parser.Ident_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#group_expr}.
	 * @param ctx the parse tree
	 */
	void enterGroup_expr(C0Parser.Group_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#group_expr}.
	 * @param ctx the parse tree
	 */
	void exitGroup_expr(C0Parser.Group_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#l_expr}.
	 * @param ctx the parse tree
	 */
	void enterL_expr(C0Parser.L_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#l_expr}.
	 * @param ctx the parse tree
	 */
	void exitL_expr(C0Parser.L_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#ty}.
	 * @param ctx the parse tree
	 */
	void enterTy(C0Parser.TyContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#ty}.
	 * @param ctx the parse tree
	 */
	void exitTy(C0Parser.TyContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(C0Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(C0Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(C0Parser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(C0Parser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#let_decl_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLet_decl_stmt(C0Parser.Let_decl_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#let_decl_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLet_decl_stmt(C0Parser.Let_decl_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#const_decl_stmt}.
	 * @param ctx the parse tree
	 */
	void enterConst_decl_stmt(C0Parser.Const_decl_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#const_decl_stmt}.
	 * @param ctx the parse tree
	 */
	void exitConst_decl_stmt(C0Parser.Const_decl_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#decl_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDecl_stmt(C0Parser.Decl_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#decl_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDecl_stmt(C0Parser.Decl_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(C0Parser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(C0Parser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(C0Parser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(C0Parser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(C0Parser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(C0Parser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(C0Parser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(C0Parser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(C0Parser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(C0Parser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#block_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBlock_stmt(C0Parser.Block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#block_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBlock_stmt(C0Parser.Block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#empty_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_stmt(C0Parser.Empty_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#empty_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_stmt(C0Parser.Empty_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#function_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_param(C0Parser.Function_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#function_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_param(C0Parser.Function_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#function_param_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_param_list(C0Parser.Function_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#function_param_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_param_list(C0Parser.Function_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link C0Parser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(C0Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C0Parser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(C0Parser.FunctionContext ctx);
}