package javaprogrammingmooc.part11.validatingParameters;

public class Calculator {
    public int factorial(int num) {

        int answer = 1;
        if (num < 0) {
            throw new IllegalArgumentException("No negative numbers !");
        }
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }
        return answer;
    }

    public int binomialCoefficent(int i, int i1) {
        return i;
    }
}