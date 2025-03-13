public class MyInt extends Expression{

    private int value;

    public MyInt(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return this.value;
    }

    @Override
    public String toString() {
        return "MyInt{" +
                "value=" + value +
                '}';
    }
}
