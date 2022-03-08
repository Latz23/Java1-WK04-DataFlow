import java.util.Scanner;

public class DataFlow {

    public static void main(String[] args){

        //pythagorean theorem c = square root of (a^2 + b^2)
        Scanner input = new Scanner(System.in);
        /*
        //int a = input.nextInt();
       //int b = input.nextInt();
        int a = 3;
        int b = 4;
        double c = pythagorean(a, b);
        System.out.println("c = " + c);
        System.out.println("Pie = " + Math.PI);
        System.out.println("ceil = " + Math.ceil(2.1));
        System.out.println("min = " + Math.min(3.0, 2.0));
        System.out.println("max = " + Math.max(3.0, 1.0));
        System.out.println("abs = " + Math.abs(-3.0));
        System.out.println("floor = " + Math.floor(3.99));
        System.out.println("Rando = " + Math.random() * 10);


        String original = "abcdefghijk";
        for (int i = 0; i < original.length(); i++){
            System.out.println("The character at index " + i + " is " + original.charAt(i));
        }
        System.out.println("The letter 'c' is at index = " + original.indexOf('c'));
        System.out.println("The letter 'z' is not in the String = " + original.indexOf('z'));
        System.out.println(original + " - Converted into upper case - " + original.toUpperCase());

        System.out.print("Fibonacci n=? ");
        int fib = input.nextInt();
        System.out.println("Fibonacci of # " + fib + " is # " + fibonacci(fib));
*/
    System.out.println(DayFibMultiply(40, 1, 1, 1));

    }

    public static double pythagorean(int a, int b){
        double aSq = Math.pow(a, 2);
        double bSq = Math.pow(b, 2);
        double c = Math.sqrt(aSq + bSq);
        return c;

    }

    public static int fibonacci (int n){
        if (n == 1){
            return 1;
        }else if (n == 2){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static int DayFibMultiply (int n, int x, int i, int c){
        // n = # of days
        // x = xi-1 * 2
        // i = day count upto n
        // c = xi-1 + xi
        // start at 1,
            // x = x * 2
            // c = c + x (used to cary yesterdays x)
            // Recursion with n, x, i+1, c
        // e.g. n = 5, 1=1, 2=2, 3=4, 4=8, 5=16, 6=32, total = 1+2+4+8+16+32=63
        System.out.println("n = " + n);
        if (n == i){
            return c;
        }
        if (n == 1){
            return 1;
        }
        if (n < 1){
            return 0;
        }
        if (n > 30){
            return -1;
        }else{
            x = x * 2;
            c = c + x;
            System.out.println("x of Recs = " + x);
            System.out.println("c of Recs = " + c);
            System.out.println("i of Recs = " + i);
            return DayFibMultiply(n, x, i+1, c);
        }
    }


}
