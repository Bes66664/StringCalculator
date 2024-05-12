class Validator {

    public static void validateInput(String operand1, String operand2, String operator) {

        if (operand1.length() > 10) {
            throw new IllegalArgumentException("Длина первого операнда не может быть больше 10 символов");
        }

        if (operand2.length() > 10) {
            throw new IllegalArgumentException("Длина второго операнда не может быть больше 10 символов");
        }

        try {
            if (!operand2.contains("\"")){
                int value = Integer.parseInt(operand2);
                if (value < 1 || value > 10) {
                    throw new IllegalArgumentException("Второй операнд должен быть целым числом в диапазоне от 1 до 10.");
                }
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Второй операнд должен быть целым числом в диапазоне от 1 до 10.");
        }

        if (operator.equals(" / ")) {
            throw new IllegalArgumentException("Нельзя делить строку на строку");
        }
    }
}
