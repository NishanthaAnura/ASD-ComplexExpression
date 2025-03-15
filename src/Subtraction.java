public class Subtraction extends Expression{

    private Expression expr1;
    private Expression expr2;

    public Subtraction(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public int evaluate() {
        return expr1.evaluate() - expr2.evaluate();
    }

    @Override
    public String toString() {
        return "(" +expr1.toString()+" - "+expr2.toString()+")";
    }
}
