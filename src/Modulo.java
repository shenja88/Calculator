public class Modulo implements Operation {

    @Override
    public int calculate(int a, int b) {
        return Math.floorMod(a, b);
    }
}
