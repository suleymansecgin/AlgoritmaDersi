/*
 */
public class Example1 {

    public static void numsum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Result: " + result);
    }

    public static void incrementby1(int num) {
        num++;
        System.out.println(num);
    }

    public static void main(String[] args) {

        int num1 = 5, num2 = 3;
        numsum(5, 3);
        incrementby1(num1);
        incrementby1(num2);
        
    }

}
