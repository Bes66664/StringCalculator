class Arithmetic {

    public static String add(String operand1, String operand2) {
        return operand1 + operand2;
    }

    public static String subtract(String operand1, String operand2) {
        return operand1.replace(operand2, " ");
    }

    public static String multiply(String operand1, String operand2) {
        if (!isNumeric(operand2)) {
            throw new IllegalArgumentException("Второй операнд должен быть числом для умножения.");
        }
        int multiplier = Integer.parseInt(operand2);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < multiplier; i++) {
            result.append(operand1);
        }
        return result.toString();
    }

    public static String divide(String operand1, String operand2) {
        if (!isNumeric(operand2) || Integer.parseInt(operand2) == 0) {
            throw new IllegalArgumentException("Второй операнд должен быть ненулевым числом для деления.");
        }
        int divisor = Integer.parseInt(operand2);
        int quotient = operand1.length() / divisor;
        return operand1.substring(0, quotient);
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}

