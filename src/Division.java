public class Division implements Operation {

    @Override
    public int calculate(int a, int b) {
        return Math.floorDiv(a, b);
    }
}
