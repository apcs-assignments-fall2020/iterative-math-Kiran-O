import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double qwe = 1;
        double one = 1;
        do { 
            qwe = one;
            qwe = (Math.random()+x);
            one = (qwe + x/qwe)/2;
        }
        while (Math.abs(qwe-one) > 0.00001);
        return one;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int wer = 1;
        for (int k = x; k > 1; k--){
            wer *= k;
        }
        return wer;
    }    

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double ert = 0;
        int x = 0;
        while (Math.abs(Math.E - ert) > 0.00001){
            ert += 1/factorial(x);
            x += 1;
        }
        return ert;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        double x = scan.nextDouble();
        System.out.println("The square root of:" + x + babylonian(x));
        System.out.println("The value of e is roughly:" + calculateE());

        scan.close();
    }
}
