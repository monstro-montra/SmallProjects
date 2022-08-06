import java.util.Scanner;

class IfStatementTest {

    public static void main(String[] args){
                
        int x;
        Scanner in = new Scanner(System.in);

        System.out.println("Pick a Number: 1-5. I will add two to that number. ");
        x = in.nextInt();

        switch(x){
            case 1: x = 1; 
            x = x + 2;
            break;
            
            case 2: x = 2;
            x = x + 2;
            break;

            case 3: x = 3;
            x = x + 2;
            break;
            
            case 4: x = 4;
            x = x + 2;
            break;

            case 5: x = 5;
            x = x + 2;
            break;

        }

        System.out.println("Your new number is: " + x);

        in.close();
        
    }
}


                