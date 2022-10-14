import java.awt.*; //import awt
import javax.swing.*; //import Swing


public class BasicGUI extends JPanel {
    //class attributes
    private JFrame Dough = new JFrame(); //create new JFrame object called 'plate'
    private JPanel Sauce = new JPanel(); //creates new JPanel Object called 'eggs'
    //the following will create JLabels called 'Pepperoni' 1-5
    private JButton Toppings;

    
    public static void main(String[] args){
        BasicGUI Pizza = new BasicGUI();//object was created to be able to call other methods non-statically
        Pizza.createPizza();
        Pizza.addToppings();
        Pizza.addSauce();
        
    }

    public void createPizza(){
        Dough.getContentPane();
        final int P_WIDTH = 600; //width of frame plate is 600 pixels
        final int P_HEIGHT = 600; //height of frame plate is 600 pixels
        Dough.setSize(P_WIDTH, P_HEIGHT); //set the size of this frame to 600 x 600 pixels
        Dough.setTitle("Pizza"); //this will set the title bar to "Plate"
        Dough.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //defautl close operation is exit on close.
        Dough.setVisible(true); //allows the frame to be visible
    }

    public void addSauce() { //add the jpanel
        //set top left bottom and right borders of sauce
        Sauce.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 
        Sauce.setBounds(0 ,0 , 600, 600); //the bounds are set in the form: x, y, width, height
        Sauce.setBackground(Color.RED); // this will set the background color of 'sauce' to red
        Sauce.setLayout(null); // sets the jpanel layout to null
        Dough.add(Sauce); //adds sauce to the dough!
    }

    public void addToppings(){ //add the conent
        Toppings = new JButton("Pepperoni"); //first slice of pepperoni!
        Toppings.setBounds(20, 20, 120, 120);
        Sauce.add(Toppings);

        Toppings = new JButton("Pepperoni"); //second slice of pepperoni!
        Toppings.setBounds(50, 50, 120, 120);
        Sauce.add(Toppings);

        Toppings = new JButton("Pepperoni"); //third slice of pepperoni!
        Toppings.setBounds(350, 300, 120, 120);
        Sauce.add(Toppings);

        Toppings = new JButton("Pepperoni"); //fourth slice of pepperoni!
        Toppings.setBounds(200, 400, 120, 120);
        Sauce.add(Toppings);

        Toppings = new JButton("Pepperoni"); //fifth slice of pepperoni!
        Toppings.setBounds(250, 100, 120, 120);
        Sauce.add(Toppings);

        Toppings = new JButton("Pepperoni"); //sixth slice of pepperoni!
        Toppings.setBounds(50, 300, 120, 120);
        Sauce.add(Toppings);
        

    }
    
    
}
