public class Main {
    public static void main(String[] args) {

        Expression add = new Addition(new MyInt(5), new MyInt(6));
        Expression sub = new Subtraction(new MyInt(2), new MyInt(1));

        Expression result = new Multiplication(new Addition(new MyInt(5), new MyInt(6)), new Subtraction(new MyInt(2), new Multiplication(new MyInt(3), new MyInt(3))));

        System.out.println(result.evaluate());
        System.out.println(result);
    }
}