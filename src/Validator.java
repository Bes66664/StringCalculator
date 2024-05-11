class Validator {

    public static void validateInput(String operand1, String operand2, String operator) {

        if (!operand1.contains("\"")){
            throw new IllegalArgumentException("Первый операнд не является строкой");
        }

        try {
            double value = Double.parseDouble(operand2);
            if ((value < 1 || value > 10) || value % 1 != 0) {
                throw new IllegalArgumentException("Второй операнд должен быть целым числом в диапазоне от 1 до 10.");
            }
            if (operator.equals(" / ")) {
                throw new IllegalArgumentException("Нельзя делить строку на строку");
            }
        } catch (NumberFormatException e) {
            // Второй операнд не является числом, выводим информационное сообщение
            //System.err.println("Второй операнд не является числом, но это не ошибка.");
        }
        operand1 = operand1.replace("\"","");
        operand2 = operand2.replace("\"","");
        if (operand1.length() > 10) {
            throw new IllegalArgumentException("Длина не может быть больше 10 символов");
        }
        if (operand2.length() > 10) {
            throw new IllegalArgumentException("Длина не может быть больше 10 символов");
        }
    }
}