public class Addition implements Operation {

    @Override
    public int calculate(int a, int b) {
        return Math.addExact(a, b);
    }
}
