// Generated from D:/大三上/编译技术/c0-compiler/src/main/resources\C0.g4 by ANTLR 4.9
package c0.analyser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link C0Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface C0Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link C0Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(C0Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(C0Parser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(C0Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(C0Parser.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(C0Parser.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator(C0Parser.Binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#operator_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_expr(C0Parser.Operator_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#negate_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate_expr(C0Parser.Negate_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#assign_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_expr(C0Parser.Assign_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#as_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_expr(C0Parser.As_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#call_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_param_list(C0Parser.Call_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#call_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_expr(C0Parser.Call_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#literal_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_expr(C0Parser.Literal_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#ident_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent_expr(C0Parser.Ident_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#group_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_expr(C0Parser.Group_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#l_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_expr(C0Parser.L_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#ty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTy(C0Parser.TyContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(C0Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(C0Parser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#let_decl_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet_decl_stmt(C0Parser.Let_decl_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#const_decl_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_decl_stmt(C0Parser.Const_decl_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#decl_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_stmt(C0Parser.Decl_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(C0Parser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(C0Parser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(C0Parser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(C0Parser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(C0Parser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#block_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_stmt(C0Parser.Block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#empty_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_stmt(C0Parser.Empty_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#function_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_param(C0Parser.Function_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#function_param_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_param_list(C0Parser.Function_param_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link C0Parser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(C0Parser.FunctionContext ctx);
}