public class Calk {
    String raw;

    Number firstOperand;
    Number secondOperand;
    String operation;

    String result;

    public Calk(String str) {
        this.raw = str;
    }

    public Calk parse() throws Exception {

        String[] split = raw.split("\\s+");
        if (split.length != 3) {
            throw new Exception("Нельзя вводит более двух операндов");
        }

        firstOperand = new Number(split[0]);
        secondOperand = new Number(split[2]);
        if (firstOperand.isRome != secondOperand.isRome) {
            throw new Exception("операнды должны быть одного типа");
        }
        if (firstOperand.value < 1 || firstOperand.value > 10 || secondOperand.value < 1 || secondOperand.value > 10) {
            throw new Exception("Ввод цифр должен быть от 1 до 10");
        }

        operation = split[1];
        if (Operators.get(split[1]) == null) {
            throw new Exception("неподдерживаемая операция");
        }

        return this;
    }

    public Calk evaluate() throws Exception {
        result = firstOperand.apply(operation, secondOperand).toNumberString();
        return this;
    }

    @Override
    public String toString() {
        return result;
    }
}
