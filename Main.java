package CherryPopJava;

import java.util.Scanner;

 public  class Main {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Please Enter value of 'A'");
            int a = input.nextInt();

            System.out.println("Please enter value of 'B'");
            int b = input.nextInt();

            double sum = a + b;
            double mul = a * b;
            double div = (double) a / b;
            double sub = a - b;

            System.out.println("Please Enter the Operation- sum/div/mul/sub");
            String ops = input.next();

            if (ops.equalsIgnoreCase("sum")) {
                System.out.println("Result:\t" + sum);
            }
            if (ops.equalsIgnoreCase("div")) {
                System.out.println("Result:\t" + div);
            }
            if (ops.equalsIgnoreCase("mul")) {
                System.out.println("Result:\t" + mul);
            }
            if (ops.equalsIgnoreCase("sub")) {
                System.out.println("Result:\t" + sub);
            }
            System.out.println("Please Enter E to Exit; Any other key to continue");
            String loop = input.next();


            if (loop.equalsIgnoreCase("E")) {
                break;
            }

        }


        }
}

