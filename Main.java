import java.util.Scanner;

/**
 * a program used to figure out the total cost of a pizza, including tax based on the size of it
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // store the cost of labor per pizza
    final double LABOUR_COST = 0.75;

    // store the cost of power to run the oven per pizza
    final double OVEN_COST = 0.99;

    // store the cost per centimeter in diameter the pizza will be
    final double DIAMETER_COST = 0.50;

    // get the diameter of pizza the user ordered (in cm)
    System.out.println("Please enter the diameter of the pizza (in cm):");
    int diameter = input.nextInt();

    // declare a variable to store the cost of the pizza for diameter 
    double costDiameter = diameter*DIAMETER_COST;

    // declare a variable to store the cost of the pizza including oven and labour cost
    double ovenLabour = OVEN_COST+LABOUR_COST;

    // declare a variable to store the subtotal of the pizza not including tax
    double subTotal = costDiameter+ovenLabour;

    // tell the user the subtotal
    System.out.println("The subtotal of your pizza is " + subTotal);

    // declare and calculate the tax of the pizza cost
    double taxes = subTotal*0.13;

    // tell the user the tax cost
    System.out.println("The cost of the tax is " + taxes);

    // declare and calculate a variable for the total cost of the pizza
    double totalCost = subTotal+taxes;

    // tell the user the total cost
    System.out.println("The total cost of your pizza is $" + totalCost);

    // declare and store a variable for pizza size 20cm in diameter 
    int twentyCm = 20;

    // declare and store a variable for pizza size 40cm in diameter
    int fortyCm = 40;

    // check to see what message you want to display depending on pizza size 
    if (diameter < twentyCm) {
      System.out.println("We are going to make you a cute little pizza!");
    } else if (diameter >= twentyCm && diameter <= fortyCm) {
      System.out.println("This will be delicious!");
    } else if (diameter > fortyCm) {
      System.out.println("Whoa, big pizza! You might need a truck to get this home!");
    }


    
  }
}
