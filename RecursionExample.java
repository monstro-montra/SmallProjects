public class RecursionExample {

    public static void main(String[] args){
        RecursionExample recursionExample = new RecursionExample();
        System.out.println("Factorial is: " + recursionExample.recursiveFactorial(5));
        System.out.println("Factorial is: " + recursionExample.iterativeFactorial(5));
    }

    public int iterativeFactorial (int n){ // n will be substituted for any number in main. in this case 5.
        int factorial = 1;
        for (int i = 1; i <= n; i++){ // for i = 1, i <=(5), add 1 to i
            factorial = factorial * i; // factorial = itself times i
        }
        return factorial; //return factorial
    }

    public int recursiveFactorial (int n){
        if (n == 1){ // base case
            return 1;
        }
        else{ //otherwise
            return n * recursiveFactorial(n - 1); // n times (n-1)!
        }

    }
}
