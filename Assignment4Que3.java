import java.util.Scanner;

class Assignment4Que3

{
    private double objectValue;

    // Constructor for object of class Assignment4Que3
    public Assignment4Que3(double d) {
        objectValue = d;
    }

    // Checks if object value is 0
    public boolean isZero() {
        if (objectValue == 0.0)
            return true;
        else
            return false;
    }

    // Checks if object value is positive
    public boolean isPositive() {
        if (objectValue > 0.0)
            return true;
        else
            return false;
    }

    // Checks if object value is negative
    public boolean isNegative() {
        if (objectValue < 0.0)
            return true;
        else
            return false;
    }

    // Checks if object value is odd
    public boolean isOdd() {
        if (objectValue % 2 != 0.0)
            return true;
        else
            return false;
    }

    // Checks if object value is even
    public boolean isEven() {
        if (objectValue % 2 == 0.0)
            return true;
        else
            return false;
    }

    // Checks if object value is a prime number
    public boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }

    // Checks if object value is an Amstrong number
    public boolean isAmstrong(int n) {
        int temp = n;
        int sum = 0;
 
        while (n > 0) {
 
            int rem = n % 10;
            sum += rem * rem * rem;
            n = n / 10;
        }

        if (temp == sum) {
            return true;
        }
        else {
            return false;
        }
    }

    // Finds the factorial value of the object 
    public long getFactorial(int num) {

        return (num == 1 || num == 0) ? 1 : num * getFactorial(num - 1);
    }

    // Gets square root of the given object
    public double getSqrt() {
        double d = Math.sqrt(objectValue);
        return d;
    }
    
    // Gets square of the given object
    public double getSqr() {
        double d = objectValue * objectValue;
        return d;
    }

    // Gets the sum of the digits of the given object
    public int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    // Gets the reverse order of the given object
    public int getReverse(int num) {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    // gets a list of all the factors of the given object
    public void listFactor(int n) {
        System.out.print("listFactor\t");
        for (int i=1;i<=n;i++){
            if (n%i == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    // gets the given objects value in binary format
    public void dispBinary(int n) {
        System.out.println("dispBinary\t" + Integer.toBinaryString(n));
    }

    

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        double inputValue = input.nextDouble();
        input.close();

        Assignment4Que3 mynum = new Assignment4Que3(inputValue);
        int num = (int) inputValue;
        
        System.out.println("isZero\t\t" + mynum.isZero());
        System.out.println("isPositive\t" + mynum.isPositive());
        System.out.println("isNegative\t" + mynum.isNegative());
        System.out.println("isOdd\t\t" + mynum.isOdd());
        System.out.println("isEven\t\t" + mynum.isEven());
        System.out.println("isPrime\t\t" + mynum.isPrime(num));
        System.out.println("isAmstrong\t" + mynum.isAmstrong(num));
        System.out.println("getFactorial\t" + mynum.getFactorial(num));
        System.out.println("getSqrt\t\t" + mynum.getSqrt());
        System.out.println("getSqr\t\t" + mynum.getSqr());
        System.out.println("sumDigits\t" + mynum.sumDigits(num));
        System.out.println("getReverse\t" + mynum.getReverse(num));
        mynum.listFactor(num);
        mynum.dispBinary(num);
    }
}