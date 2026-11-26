//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.ArrayList;

void main() {
    Scanner scanner = new Scanner(System.in);
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    System.out.println("Hello and welcome to the best calculator!");

    while (true) {
        System.out.println("Do you want to continue? Y/N");
        String continueUsing = scanner.nextLine();

        if (continueUsing.equals("Y") || continueUsing.equals("y")) {
            System.out.println("What do you want to do?");
            System.out.println("add(+) | subtract(-) | multiply(*) | divide(/) | count for me(count) | history(h)");

            String usrMathOp = scanner.nextLine();

            if (usrMathOp.equalsIgnoreCase("add") || usrMathOp.equals("+")) {
                addNums(scanner);
            } else if (usrMathOp.toLowerCase().equals("subtract") || usrMathOp.equals("-")) {
                subtractNums(scanner);
            } else if (usrMathOp.toLowerCase().equals("multiply") || usrMathOp.equals("*")) {
                multiplyNums(scanner);
            } else if (usrMathOp.toLowerCase().equals("divide") || usrMathOp.equals("/")) {
               divideNums(scanner);
            } else if (usrMathOp.toLowerCase().equals("count for me") || usrMathOp.equals("count")) {
                count(scanner);
            }else if (usrMathOp.toLowerCase().equals("history") || usrMathOp.equals("h")) {
                viewHistory();
            }
        } else {
            break;
        }
    }
}

private ArrayList<String> calculations = new ArrayList<>();

void addNums(Scanner scanner) {
    System.out.println("Enter first number: ");
    float firstNum = Float.valueOf(scanner.nextLine());
    System.out.println("Enter second number: ");
    float secondNum = Float.valueOf(scanner.nextLine());

    float sum = sum(firstNum, secondNum);

    System.out.println(firstNum + " + " + secondNum + " = " + sum);
    saveHistory(firstNum + " + " + secondNum + " = " + sum);
}

float sum(float firstNum, float secondNum) {
    return firstNum + secondNum;
}

void  multiplyNums(Scanner scanner) {
    System.out.println("Enter first number: ");
    float firstNum = Float.valueOf(scanner.nextLine());
    System.out.println("Enter second number: ");
    float secondNum = Float.valueOf(scanner.nextLine());

    float product = firstNum * secondNum;

    System.out.println(firstNum + " x " + secondNum + " = " + product);
    saveHistory(firstNum + " x " + secondNum + " = " + product);
}

void divideNums(Scanner scanner) {
    System.out.println("Enter dividend: ");
    float dividend = Float.valueOf(scanner.nextLine());
    System.out.println("Enter divisor: ");
    float divisor = Float.valueOf(scanner.nextLine());

    float quotient = dividend / divisor;

    System.out.println(dividend + " / " + divisor + " = " + quotient);
    saveHistory(dividend + " / " + divisor + " = " + quotient);
}

void subtractNums(Scanner scanner) {
    System.out.println("Enter Minuend: ");
    float minuend = Float.valueOf(scanner.nextLine());
    System.out.println("Enter Subtrahend: ");
    float subtrahend = Float.valueOf(scanner.nextLine());

    float difference = minuend - subtrahend;

    System.out.println(minuend + " - " + subtrahend + " = " + difference);
    saveHistory(minuend + " - " + subtrahend + " = " + difference);
}

void count(Scanner scanner) {
    System.out.println("Enter number to count to: ");
    int count = Integer.valueOf(scanner.nextLine());
    System.out.println("Counting to " + count + ": ");

    for (int i = 0; i < count + 1; i++) {
        System.out.println(i);
    }
    saveHistory("Count: " + count);
}

void saveHistory(String calculation) {
    calculations.add(calculation);
}

void viewHistory() {
    System.out.println("History:");
    for (String calc:calculations) {
        System.out.println(calc);
    }
}