import java.util.Scanner;

    class PrimeNumber {


        public static void main(String[] args){


            Scanner in = new Scanner(System.in);
            int userNum;

            System.out.println("Input your number: ");
            while (!in.hasNextInt()){
                System.out.println("That's not a prime number");
                in.next();
            }

           
            userNum = in.nextInt(); 

            if(isPrime(userNum)){
                System.out.println("Your number is: " + userNum);
                System.out.println(userNum + " is a prime number!");
            }
            else{
                System.out.println(userNum + " is not a prime number.");
            }


        }
        
        //prime numbers can only be divided by itself, and 1 without remainders.
        static boolean isPrime(int num){ 
            if(num<=1){
                return false; /*if number is less than or equal to 1, it is false. 
            there are no negative prime numbers.*/}
            for(int i=2; i<num/2; i++){  //2 is the smallest prime number.
                
                if((num%i == 0)) 
                    return false; // if there is no remainder, return false.

            }
            return true; 

        }
}

    

