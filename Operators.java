import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class Operators {

    private static final Map<String, BinaryOperator<Integer>> operators = new HashMap<>();

    static {
        operators.put("+", (first, second) -> {
            return first + second;
        });
        operators.put("-", (first, second) -> {
            return first - second;
        });
        operators.put("*", (first, second) -> {
            return first * second;
        });
        operators.put("/", (first, second) -> {
            return first / second;
        });
    }

    public static BinaryOperator<Integer> get(String op) {
        return operators.get(op);
    }

    private Operators() {
    }
}