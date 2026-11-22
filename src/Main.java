//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

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
            System.out.println("add(+) | subtract(-) | multiply(*) | divide(/) | count for me(count)");

            String usrMathOp = scanner.nextLine();

            if (usrMathOp.equalsIgnoreCase("add") || usrMathOp.equals("+")) {
                System.out.println("Enter first number: ");
                float firstNum = Float.valueOf(scanner.nextLine());
                System.out.println("Enter second number: ");
                float secondNum = Float.valueOf(scanner.nextLine());

                float sum = firstNum + secondNum;

                System.out.println(firstNum + " + " + secondNum + " = " + sum);
            } else if (usrMathOp.toLowerCase().equals("subtract") || usrMathOp.equals("-")) {
                System.out.println("Enter Minuend: ");
                float minuend = Float.valueOf(scanner.nextLine());
                System.out.println("Enter Subtrahend: ");
                float subtrahend = Float.valueOf(scanner.nextLine());

                float difference = minuend - subtrahend;

                System.out.println(minuend + " - " + subtrahend + " = " + difference);
            } else if (usrMathOp.toLowerCase().equals("multiply") || usrMathOp.equals("*")) {
                System.out.println("Enter first number: ");
                float firstNum = Float.valueOf(scanner.nextLine());
                System.out.println("Enter second number: ");
                float secondNum = Float.valueOf(scanner.nextLine());

                float product = firstNum * secondNum;

                System.out.println(firstNum + " x " + secondNum + " = " + product);
            } else if (usrMathOp.toLowerCase().equals("divide") || usrMathOp.equals("/")) {
                System.out.println("Enter dividend: ");
                float dividend = Float.valueOf(scanner.nextLine());
                System.out.println("Enter divisor: ");
                float divisor = Float.valueOf(scanner.nextLine());

                float quotient = dividend / divisor;

                System.out.println(dividend + " / " + divisor + " = " + quotient);
            } else if (usrMathOp.toLowerCase().equals("count for me") || usrMathOp.equals("count")) {
                System.out.println("Enter number to count to: ");
                int count = Integer.valueOf(scanner.nextLine());
                System.out.println("Counting to " + count + ": ");

                for (int i = 0; i < count + 1; i++) {
                    System.out.println(i);
                }
            }
        } else {
            break;
        }
    }
}
