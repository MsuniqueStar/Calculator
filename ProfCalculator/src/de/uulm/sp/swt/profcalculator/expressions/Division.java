package de.uulm.sp.swt.profcalculator.expressions;

public class Division extends Expression {
	
	public Expression left;
	public Expression right;

	public Division (Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	public String toString(Expression parent) {
		return left.toString(this) + " / " + right.toString(this);
	}

	public int evaluate() {
		return left.evaluate() / right.evaluate();
	}

}
