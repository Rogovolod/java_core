package lambda;

import java.util.function.Function;

public class MRFunction {

    public static void main(String[] args) {
        Function<Double, Double> f = MRFunction.apply();
        System.out.println(f.apply(4.0)); //2
        System.out.println(f.apply(9.0));//3

    }

    public static Function<Double, Double> apply() {
        return Math::sqrt;
    }
}
