public class DynamicProgramming {
    public static void main(String[] args){
        System.out.println(fibo(10));


    }

    //fibonacci numbers follow the following formula: F₀ = 0. F₁ = 1. F(sub n) = F(sub n-1) + F(sub n-2). (basically just add the last two n's)
    //The sequence starts off like this: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233...
    //max number of stacked recursive calls == n. max number of recursive calls = max number of nodes 2^n-1. Time complexity O(2^n)
    static int fibonacci(int n){
        if (n == 0) { return 0; } //if n == 0, answer is 0
        if (n == 1) { return 1; } //if n == 1, answer is 1
        return (fibonacci(n-1) + fibonacci(n - 2)); //F(sub n) = F(sub n-1) + F(sub n-2)
    }

    //top down dynamic approach
    static int fibo(int n){
        return fiboRec(n, new int[n+1]);
    }

    //memory caches the result of fibo(n) when it is called for the firs time
    static int fiboRec(int n, int[] memory){
        if (n == 0) { return 0; }
        if (n == 1) { return 1; }
        if (memory[n] == 0){ memory[n] = fiboRec(n-1, memory) + fiboRec(n-2, memory) ;}
        return memory[n];
    }



}
