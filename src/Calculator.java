class Calculator {

    public String calculate(String input) {

        String[] parts = input.split("\"");
        String operator = input.replaceAll("[^\\+\\-*/]", "").trim();
        String operand1 = parts[1];
        String operand2;
        if (parts.length == 4){
            operand2 = parts[3];
        }else{
            String[] s = parts[2].split(" ");
            operand2 = s[2];
        }

        // Validator.validateInput(operand1, operand2, operator);

        if (operator.length() > 1){
            operator = operator.substring(0,1);
        }
        switch (operator) {
            case "+":
                return Arithmetic.add(operand1, operand2);
            case "-":
                return Arithmetic.subtract(operand1, operand2);
            case "*":
                return Arithmetic.multiply(operand1, operand2);
            case "/":
                return Arithmetic.divide(operand1, operand2);
            default:
                throw new IllegalArgumentException("Неверный оператор: " + operator);
        }
    }
}
