/*
Develop a Java program that will store data in the form of daily average temperatures for one week. 
Store the day and average temperature in two different arraylists. Your program should prompt the user 
for the day of the week (Monday through Sunday) and display both the day and temperature for each day. 
If "week" is entered, the output for your program should provide the temperature for each day and the 
weekly average. Use the looping and decision constructs in combination with the arrays to complete this 
assignment.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class GetWeeklyTemperatures {

    
    public static void main(String[]args){
        Scanner in = new Scanner(System.in); // new scanner called in
        Random r = new Random(); //  //generate a random value between 0 and 100.
        int min = 32; // minimum temperature
        int max = 100; //maximum temperature
        String userInput;
        ArrayList<Integer> temp = new ArrayList<>(); //create int arraylist called temp
        ArrayList<String> weekDay = new ArrayList<>(); //create string arraylist called weekDay
        float averageTemp;
        int sum = 0;

        //next lines of code will add the weekdays to weekDay arraylist
        weekDay.add("Sunday");
        weekDay.add("Monday");
        weekDay.add("Tuesday");
        weekDay.add("Wednesday");
        weekDay.add("Thursday");
        weekDay.add("Friday");
        weekDay.add("Saturday");

        //add random temperatures between 32(min) and 100(max) to temp. 100 - 32 = 68. program will select
        //an integer between 0 and 68, then add 32 to that number to stay within the range of 32 to 100.
        temp.add(min + r.nextInt(max-min));
        temp.add(min + r.nextInt(max-min));
        temp.add(min + r.nextInt(max-min));
        temp.add(min + r.nextInt(max-min));
        temp.add(min + r.nextInt(max-min));
        temp.add(min + r.nextInt(max-min));
        temp.add(min + r.nextInt(max-min));

        for (int nums : temp){ // this for loop calculates the total of all the values in temp
            sum += nums;
        }

        averageTemp = (sum / (float) temp.size()); //take the sum and divide it by float version of temp.size


        System.out.println("Hi! We are going to present the weekly temperatures. Please input a day of the week, or input the word 'week'"); // prompt user to input day of week

        while(true){ // create while loop that tests user input. converts lowercase to uppercase if needed.
            if(in.hasNext("Sunday") || in.hasNext("sunday") ){ //if next input is sunday //store this value into userInput
                userInput = "Sunday";
                break; //break loop
            } 
            else if(in.hasNext("Monday") || in.hasNext("monday")){ // if next input is monday
                userInput = "Monday";
                break; //break loop
            }
            else if(in.hasNext("Tuesday") || in.hasNext("tuesday")){ // if next input is tuesday
                userInput = "Tuesday";
                break; //break loop
            }
            else if(in.hasNext("Wednesday") || in.hasNext("wednesday")){ // if next input is wednesday
                userInput = "Wednesday";
                break; //break loop
            }
            else if(in.hasNext("Thursday") || in.hasNext("thursday")){ // if next input is thursday
                userInput = "Thursday";
                break; //break loop
            }
            else if(in.hasNext("Friday") || in.hasNext("friday")){ // if next input is friday
                userInput = "Friday";
                break; //break loop
            }
            else if(in.hasNext("Saturday") || in.hasNext("saturday")){ // if next input is saturday
                userInput = "Saturday";
                break; //break loop
            }
            else if(in.hasNext("Week") || in.hasNext("week")){ // if next input is week
                userInput = "Week";
                break; //break loop
            }
            else{ //otherwise
                System.out.print("Please enter a weekday: "); //prompt user to input a new string value
                in.next(); // get next input
            }
        }


        if (userInput.equals(weekDay.get(0))){
            System.out.println(weekDay.get(0) + ": "   + temp.get(0) + " degrees.");
        } 
        else if (userInput.equals(weekDay.get(1))){
            System.out.println(weekDay.get(1) + ": " + temp.get(1) + " degrees.");
        } 
        else if (userInput.equals(weekDay.get(2))){
            System.out.println(weekDay.get(2) + ": " + temp.get(2) + " degrees.");
        }
        else if (userInput.equals(weekDay.get(3))){
            System.out.println(weekDay.get(3) + ": " + temp.get(3) + " degrees.");
        }
        else if (userInput.equals(weekDay.get(4))){
            System.out.println(weekDay.get(4) + ": " + temp.get(4) + " degrees.");
        }
        else if (userInput.equals(weekDay.get(5))){
            System.out.println(weekDay.get(5) + ": " + temp.get(5) + " degrees.");
        }
        else if (userInput.equals(weekDay.get(6))){
            System.out.println(weekDay.get(6) + ": " + temp.get(6) + " degrees.");
        }
        else if (userInput.equals("Week")){
            for (int i = 0; i < weekDay.size(); i++){
                System.out.println(weekDay.get(i) + ": " + temp.get(i) + " degrees.");
            }
            System.out.println("Average temperature: " + averageTemp + " degrees.");

        }
        in.close(); // close scanner to prevent resource leak.



        }
    }
    
        
    




