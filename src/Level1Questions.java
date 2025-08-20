

import java.util.Scanner;

public class Level1Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\n======== MENU ========");
            System.out.println("1. Check divisibility by 5");
            System.out.println("2. Is first the smallest of three?");
            System.out.println("3. Which number is largest of three?");
            System.out.println("4. Natural number and sum");
            System.out.println("5. Voting eligibility");
            System.out.println("6. Positive, negative or zero");
            System.out.println("7. Spring Season check");
            System.out.println("8. Countdown using while loop");
            System.out.println("9. Countdown using for loop");
            System.out.println("10. Sum until 0 (while loop)");
            System.out.println("11. Sum until 0 or negative (while+break)");
            System.out.println("12. Sum of n natural numbers while loop and formula");
            System.out.println("13. Sum of n natural numbers for loop and formula");
            System.out.println("14. Factorial using while loop");
            System.out.println("15. Factorial using for loop");
            System.out.println("16. Odd and even (1 to n)");
            System.out.println("17. Employee bonus");
            System.out.println("18. Multiplication table (6-9)");
            System.out.println("19. Exit");
            System.out.print("Enter your choice (1-19): ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: prog1(sc); break;
                case 2: prog2(sc); break;
                case 3: prog3(sc); break;
                case 4: prog4(sc); break;
                case 5: prog5(sc); break;
                case 6: prog6(sc); break;
                case 7: prog7(sc); break;
                case 8: prog8(sc); break;
                case 9: prog9(sc); break;
                case 10: prog10(sc); break;
                case 11: prog11(sc); break;
                case 12: prog12(sc); break;
                case 13: prog13(sc); break;
                case 14: prog14(sc); break;
                case 15: prog15(sc); break;
                case 16: prog16(sc); break;
                case 17: prog17(sc); break;
                case 18: prog18(sc); break;
                case 19: running = false; System.out.println("Exiting!"); break;
                default: System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }

    // 1. Check if number divisible by 5
    static void prog1(Scanner sc) {
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Is the number " + n + " divisible by 5? " + (n % 5 == 0));
    }

    // 2. Check if first is smallest of three
    static void prog2(Scanner sc) {
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Is the first number the smallest? " + (a < b && a < c));
    }

    // 3. Which number is largest among three
    static void prog3(Scanner sc) {
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Is the first number the largest? " + (a > b && a > c));
        System.out.println("Is the second number the largest? " + (b > a && b > c));
        System.out.println("Is the third number the largest? " + (c > b && c > a));
    }

    // 4. Check for natural number and sum
    static void prog4(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n > 0) {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }

    // 5. Voting eligibility
    static void prog5(Scanner sc) {
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age >= 18)
            System.out.println("The person's age is " + age + " and can vote.");
        else
            System.out.println("The person's age is " + age + " and cannot vote.");
    }

    // 6. Number positive, negative or zero
    static void prog6(Scanner sc) {
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n > 0)
            System.out.println("positive");
        else if (n < 0)
            System.out.println("negative");
        else
            System.out.println("zero");
    }

    // 7. SpringSeason program
    static void prog7(Scanner sc) {
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        boolean isSpring = (month == 3 && day >= 20) ||
                (month > 3 && month < 6) ||
                (month == 6 && day <= 20);
        if (isSpring)
            System.out.println("It's a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }

    // 8. Countdown while loop
    static void prog8(Scanner sc) {
        System.out.print("Enter countdown starting number: ");
        int counter = sc.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Rocket Launched!");
    }

    // 9. Countdown for loop
    static void prog9(Scanner sc) {
        System.out.print("Enter countdown starting number: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket Launched!");
    }

    // 10. Sum until 0 entered (while loop)
    static void prog10(Scanner sc) {
        double total = 0.0, val;
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            val = sc.nextDouble();
            if (val == 0)
                break;
            total += val;
        }
        System.out.println("Total sum: " + total);
    }

    // 11. Sum until 0 or negative, while+break loop
    static void prog11(Scanner sc) {
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double n = sc.nextDouble();
            if (n <= 0)
                break;
            total += n;
        }
        System.out.println("Total sum: " + total);
    }

    // 12. n natural numbers sum (while+formula)
    static void prog12(Scanner sc) {
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        int sum = 0, i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        int formula = n * (n + 1) / 2;
        System.out.println("Sum by while loop: " + sum);
        System.out.println("Sum by formula: " + formula);
        System.out.println("The computation is " + (sum == formula ? "correct" : "incorrect"));
    }

    // 13. n natural numbers sum (for+formula)
    static void prog13(Scanner sc) {
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        int formula = n * (n + 1) / 2;
        System.out.println("Sum by for loop: " + sum);
        System.out.println("Sum by formula: " + formula);
        System.out.println("The computation is " + (sum == formula ? "correct" : "incorrect"));
    }

    // 14. Factorial (while)
    static void prog14(Scanner sc) {
        System.out.print("Enter a positive integer for factorial: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Not a natural number");
            return;
        }
        int fact = 1, i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial of " + n + ": " + fact);
    }

    // 15. Factorial (for)
    static void prog15(Scanner sc) {
        System.out.print("Enter a positive integer for factorial: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Not a natural number");
            return;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        System.out.println("Factorial of " + n + ": " + fact);
    }

    // 16. Odd and even from 1 to n
    static void prog16(Scanner sc) {
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is even");
            else
                System.out.println(i + " is odd");
        }
    }

    // 17. Employee bonus
    static void prog17(Scanner sc) {
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        if (years > 5)
            System.out.println("Bonus: " + (salary * 0.05));
        else
            System.out.println("No bonus");
    }

    // 18. Multiplication table of number from 6 to 9
    static void prog18(Scanner sc) {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}

