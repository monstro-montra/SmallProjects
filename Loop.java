public class Loop {
    public static void main(String[] args){

        //THIS IS A FOR LOOP
        /*System.out.println("Ready to launch the Sagittarius 7 Star Cruiser. Starting countdown.");
        for (int i=10; i > -1; i--){
            System.out.println(i);
        }
        System.out.print ("Lift off! ");*/

        //THIS IS A WHILE LOOP
        int count = 10; 
        System.out.println("Ready to launch the Sagittarius 7 Star Cruiser. Starting countdown.");

        while(count > 10){ //while count is greater than 10
            System.out.println(count); //print count
            count--; //decrement the count by 1
        }
        System.out.print ("Oops! Seems like we made an error."); 

        //THIS IS A DO-WHILE LOOP
        /*int count = 10; 
        System.out.println("Ready to launch the Sagittarius 7 Star Cruiser. Starting countdown.");

        do{ //execute the following block
            System.out.println(count); //print count
            count--; //decrement the count by 1
        } while (count > 10); //while the count is greater than -1
        System.out.println("Whoops! we failed the launch because we set our condition to count > 10!!");*/
    }
    
}

