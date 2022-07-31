    import java.util.InputMismatchException;
    import java.util.Scanner;

        class MPGCalculator {


            public static void main(String[] args){
                
                //the following variables will be printed in this order
                int carYear; //year of the car
                String carBrand; //car brand
                String carModel; //model of the car
                double startingOdometer;
                double endingOdometer; //the starting odometer reading
                double gallonsUsed; //how many gallons were used
                double gasMileage; //car's mpg
                Scanner in = new Scanner(System.in);

                System.out.println("Hi! We are going to calculate your Miles per Gallon.");

                System.out.print("Input your car's year: ");//ask user to input 
                while(true) { //create a while loop
                    try{//try block. exceptions errors can occur here.
                        carYear = in.nextInt(); //check for an integer
                        break; //break out of the while loop here
                    }catch(InputMismatchException e){ // catches the try block exception error
                        System.out.print("Please input an integer: "); //ask user to input an integer.
                        in.nextLine(); // scanner waits for next user input.
                    }
                }
                
                System.out.print("Input your car's brand: "); //ask user to input
                while(true){ // create while loop
                    if(in.hasNext("[A-Za-z]*")){ //if next input is exclusively alphabetical
                        carBrand = in.next(); //store this value into carBrand
                        break; //break loop
                    }
                    else{ //otherwise
                        System.out.print("Please enter an alphabetical input: "); //prompt user to input a new string value
                        in.next(); // get next input
                    }
                }

                System.out.print("Input your car's model: "); // ask user input for car model
                while(true){ // create while loop
                    if(in.hasNext("[A-Za-z]*")){ //if next input is exclusively alphabetical
                        carModel = in.next(); //store this value into carModel
                        break; //break loop
                    }
                    else if(in.hasNext("[A-Za-z]*" + "[0123456789]")){ // or if the next input contains numbers and alphabet
                        carModel = in.next(); //store carModel into nextLine
                        break; //break loop
                    }
                    else{ //otherwise
                        System.out.print("Please enter a car model: "); //prompt user to input a new string value
                        in.next(); //
                    }
                }


                System.out.print("Input your car's odometer reading from the start of the trip: ");// ask user to input a odometer reading
                while(true) { //create a while loop
                    try{//try block. exceptions errors can occur here.
                        startingOdometer = in.nextDouble(); //check for an double
                        break; //break out of the while loop here
                    }catch(InputMismatchException e){ // catches the try block exception error
                        System.out.print("Please input a number: "); //ask user to input an integer.
                        in.next(); // scanner waits for next user input.
                    }
                }

                System.out.print("Input your car's odometer reading from the end of the trip: ");// ask user to input a odometer reading
                while(true) { //create a while loop
                    try{//try block. exceptions errors can occur here.
                        endingOdometer = in.nextDouble(); //check for an double
                        break; //break out of the while loop here
                    }catch(InputMismatchException e){ // catches the try block exception error
                        System.out.print("Please input a number: "); //ask user to input an integer.
                        in.next(); // scanner waits for next user input.
                    }
                }

                System.out.print("Input how many gallons it took to refill your car: "); // ask how many gallons used
                while(true) { //create a while loop
                    try{//try block. exceptions errors can occur here.
                        gallonsUsed = in.nextDouble(); //check for an double
                        break; //break out of the while loop here
                    }catch(InputMismatchException e){ // catches the try block exception error
                        System.out.print("Please input a number: "); //ask user to input an integer.
                        in.next(); // scanner waits for next user input.
                    }
                }

                in.close(); // close scanner to prevent resource leak

                gasMileage = (endingOdometer - startingOdometer) / gallonsUsed;

                System.out.println("Car Year: " + carYear);
                System.out.println("Car Brand " + carBrand);
                System.out.println("Car Model: " + carModel);
                System.out.println("Starting odometer reading: " + startingOdometer);
                System.out.println("Ending odometer reading: " + endingOdometer);
                System.out.println("Gallons used to refill car: " + gallonsUsed);
                System.out.println("Your MPG is: " + gasMileage);
            }
        }