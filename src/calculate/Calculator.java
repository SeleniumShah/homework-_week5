package calculate;

/**
 * 1. Write a java program using the following descriptions
 * 1. Create one package with name calculate
 * 2. Create two class with name “Calculator” and “Main”
 * 3. Create four methods with manes “addition”, “subtraction”, “division”,
 * and “multiplication”. All methods are instance methods and it doesn’t
 * return anything. But it has two parameters with the names “int a” and
 * “int b”. Also each method has System.out.println(). This prints the
 * result. Also create one more method with the name “calculateResult”
 * with three parameters with name int a, int b and char symbol. Write the
 * logic in the calculateResult method that when the user enters first
 * number and second number and symbol based on symbol it does
 * calculate.
 */

public class Calculator {

    public void addition(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is: " + (a+b));
    }

    public void subtraction(int a, int b) {
        System.out.println("subtraction of " + a + " and " + b + " is: " + (a-b));
    }


    public void division(int a, int b) {
        System.out.println("Division of " + a + " and " + b + " is: " + (a/b));
    }

    public void multiplication(int a, int b) {
        System.out.println("Multiplication of " + a + " and " + b + " is: " + (a*b));
    }

    public void calculateResult(int a, int b, char symbol){
        if(symbol == '+'){
            addition(a,b);
        }else if (symbol == '-'){
        subtraction(a,b);
    }else if (symbol == '*'){
            multiplication(a,b);
        }else {
            division(a, b);
        }
    }


    }


