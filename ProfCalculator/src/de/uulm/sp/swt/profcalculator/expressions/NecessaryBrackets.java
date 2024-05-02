package de.uulm.sp.swt.profcalculator.expressions;

public class NecessaryBrackets extends Expression {

    private Expression expression;

    public NecessaryBrackets(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString(Expression parent) {
        String childString = expression.toString(parent);
        // Check if the parent is an instance of Multiplication or Division
        if ((parent instanceof Multiplication || parent instanceof Division) && 
            (expression instanceof Addition || expression instanceof Subtraction)) {
            childString = "(" + childString + ")";
        }
        return childString;
    }

    @Override
    public int evaluate() {
        return expression.evaluate();
    }

}
