import java.util.Scanner;

public class StringCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите арифмитическое выражение:");
        String input = scanner.nextLine();


        try {
            Calculator calculator = new Calculator();
            String result = calculator.calculate(input);
            if (result.length() > 40){
                result = result.substring(0, 40) + "...";
            }
            System.out.println("\"" + result + "\"");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
