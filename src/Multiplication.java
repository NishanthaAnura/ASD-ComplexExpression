public class Multiplication extends Expression{

    private Expression expr1;
    private Expression expr2;

    public Multiplication(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public int evaluate() {
        return expr1.evaluate() * expr2.evaluate();
    }

    @Override
    public String toString() {
        return "Multiplication{" +
                "expr1=" + expr1 +
                ", expr2=" + expr2 +
                '}';
    }
}
