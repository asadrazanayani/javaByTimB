package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        int myValue = 10000;
        // Integer is wrapper class. Allows us to perform more methods on the primitive data type;
        // Wrapper class is available on all primitive data type in JAVA.
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        System.out.println("Max value is " + maxValue);
        System.out.println("Min value is " + minValue);
//        int overFlowTest = 2147483648;
//        int underFlowTest = -2147483649;
        int altIntSyntax = 2_147_483_647;
        System.out.println("Busted MAX value = " + (maxValue + 2)); // change the positive into negative . This concept is called overflow
        System.out.println("Busted MAX value = " + (minValue - 1)); // change the negative into positive . This concept is called underflow

        //Byte

    }
}
