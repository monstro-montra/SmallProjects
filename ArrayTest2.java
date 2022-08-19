public class ArrayTest2 {
    public static void main(String[] args){

        int[] level = new int[4]; //create new int array with 4 values
        String[] name = new String[10]; //create new array with 10 string values
        double[] salary = new double[10]; //create new array with 10 double values

        //set values for levels
        level[0] = 1;
        level[1] = 2;
        level[2] = 3;
        level[3] = 4;
        
        //set values for names
        name[0] = "Jorge";
        name[1]= "Alex";
        name[2]= "Marlon";
        name[3]= "Peralta";
        name[4]= "Jennifer";
        name[5]= "Melina";
        name[6]= "Ivan";
        name[7]= "Frank";
        name[8]= "Sydney";
        name[9]= "Sofia";

        //set values for yearly salaries
        salary[0] = 34596.72;
        salary[1] = 40766.32;
        salary[2] = 37009.39;
        salary[3] = 52001.41;
        salary[4] = 53421.50;
        salary[5] = 77029.90;
        salary[6] = 75902.92;
        salary[7] = 95076.87;
        salary[8] = 103969.55;
        salary[9] = 101333.02;

        //Print out all values and organize them.
        System.out.println("Employee 1" + "\nName: " + name[0] + "\nSalary: " + salary[0] + "\nLevel: " + level[0]);
        System.out.println("Employee 2" + "\nName: " + name[1] + "\nSalary: " + salary[1] + "\nLevel: " + level[0]);
        System.out.println("Employee 3" + "\nName: " + name[2] + "\nSalary: " + salary[2] + "\nLevel: " + level[0]);
        System.out.println("Employee 4" + "\nName: " + name[3] + "\nSalary: " + salary[3] + "\nLevel: " + level[1]);
        System.out.println("Employee 5" + "\nName: " + name[4] + "\nSalary: " + salary[4] + "\nLevel: " + level[1]);
        System.out.println("Employee 6" + "\nName: " + name[5] + "\nSalary: " + salary[5] + "\nLevel: " + level[2]);
        System.out.println("Employee 7" + "\nName: " + name[6] + "\nSalary: " + salary[6] + "\nLevel: " + level[2]);
        System.out.println("Employee 8" + "\nName: " + name[7] + "\nSalary: " + salary[7] + "\nLevel: " + level[3]);
        System.out.println("Employee 9" + "\nName: " + name[8] + "\nSalary: " + salary[8] + "\nLevel: " + level[3]);
        System.out.println("Employee 10" + "\nName: " + name[9] + "\nSalary: " + salary[9] + "\nLevel: " + level[3]);
    }

    
}
