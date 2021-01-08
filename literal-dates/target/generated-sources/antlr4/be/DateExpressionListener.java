// Generated from be\DateExpression.g4 by ANTLR 4.3
package be;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DateExpressionParser}.
 */
public interface DateExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DateExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull DateExpressionParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateExpressionParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull DateExpressionParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link DateExpressionParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(@NotNull DateExpressionParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateExpressionParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(@NotNull DateExpressionParser.EvalContext ctx);

	/**
	 * Enter a parse tree produced by {@link DateExpressionParser#assignExp}.
	 * @param ctx the parse tree
	 */
	void enterAssignExp(@NotNull DateExpressionParser.AssignExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateExpressionParser#assignExp}.
	 * @param ctx the parse tree
	 */
	void exitAssignExp(@NotNull DateExpressionParser.AssignExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link DateExpressionParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void enterAssignOp(@NotNull DateExpressionParser.AssignOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateExpressionParser#assignOp}.
	 * @param ctx the parse tree
	 */
	void exitAssignOp(@NotNull DateExpressionParser.AssignOpContext ctx);

	/**
	 * Enter a parse tree produced by {@link DateExpressionParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(@NotNull DateExpressionParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateExpressionParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(@NotNull DateExpressionParser.MonthContext ctx);

	/**
	 * Enter a parse tree produced by {@link DateExpressionParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompileUnit(@NotNull DateExpressionParser.CompileUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateExpressionParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompileUnit(@NotNull DateExpressionParser.CompileUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link DateExpressionParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull DateExpressionParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateExpressionParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull DateExpressionParser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link DateExpressionParser#dateExp}.
	 * @param ctx the parse tree
	 */
	void enterDateExp(@NotNull DateExpressionParser.DateExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateExpressionParser#dateExp}.
	 * @param ctx the parse tree
	 */
	void exitDateExp(@NotNull DateExpressionParser.DateExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link DateExpressionParser#timeExp}.
	 * @param ctx the parse tree
	 */
	void enterTimeExp(@NotNull DateExpressionParser.TimeExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateExpressionParser#timeExp}.
	 * @param ctx the parse tree
	 */
	void exitTimeExp(@NotNull DateExpressionParser.TimeExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link DateExpressionParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull DateExpressionParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DateExpressionParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull DateExpressionParser.LiteralContext ctx);
}