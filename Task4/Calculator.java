package Task4;

public class Calculator {
    @FunctionalInterface
    interface Operation{
        double calc(double x, double y);
    }

    public static void main(String[] args) {
        Operation sum = (x, y) -> x + y;
        Operation sub = (x, y) -> x - y;
        Operation mul = (x, y) -> x * y;
        Operation div = (x, y) -> x / y;

        double resSum = sum.calc(10,20);
        double resSub = sub.calc(10,20);
        double resMul = mul.calc(10,20);
        double resDiv = div.calc(10,20);

        System.out.println("Sum: " + resSum +
                            "\nSub: " + resSub +
                                "\nMul: " + resMul +
                                    "\nDiv: " + resDiv);
    }
}

