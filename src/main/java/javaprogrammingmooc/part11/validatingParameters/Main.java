package javaprogrammingmooc.part11.validatingParameters;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Person person = new Person("John Doe", 25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());


        // test person with empty name
        try {
            Person person2 = new Person("", 30);
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating person: " + e.getMessage());
        }


        // test the factorial method
        try {
            int factorialResult = calculator.factorial(5);
            System.out.println("Factorial of 5: " + factorialResult);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // test the binomialCoefficient method
        try {
            int binomialCoefficientResult = calculator.binomialCoefficent(5, 2);
            System.out.println("Binomial Coefficient of (5, 2): " + binomialCoefficientResult);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
