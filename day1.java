import java.util.ArrayList;
import java.util.Scanner; //import the scanner class

public class day1 {
    public static void main(String[] args){

        System.out.println("Welcome to your shopping cart");
        ArrayList<String> myShoppingCart = new ArrayList<String>();

        boolean proceed = true;

        while (proceed){
            String userInput = System.console().readLine("What would you like to do?" + '\n');
            Scanner input = new Scanner(userInput);
            String prompt = input.next().trim().toLowerCase();
            String item = "";
            if (input.hasNextLine()){
                item = new String(input.nextLine().toLowerCase());
            }

            switch(prompt){
            case "list":
                if (myShoppingCart.isEmpty()){
                    System.out.println("Your cart is empty.");                   
                }
                else {
                    int size = myShoppingCart.size();
                    for (int i=0; i<size; i++){
                        System.out.println(i+1 + ". " + myShoppingCart.get(i));                        
                    }
                }                
                break;
            case "add":
                // ArrayList<String> itemArray = new ArrayList<String>();
                String[] itemToBeInArray = item.split(", ");
                for (String elements: itemToBeInArray){
                    String inputItems = new String(elements.trim());
                
                    if (!myShoppingCart.contains(inputItems)){
                    myShoppingCart.add(inputItems);
                    System.out.println(inputItems + " has been added.");
                    } else {
                    System.out.println("Oops "+ inputItems + " is already in cart!");
                    }
                }
                break;
            case "delete":
                int itemIndex = Integer.parseInt(item.trim()) -1;
                if (itemIndex < myShoppingCart.size()){
                    myShoppingCart.remove(itemIndex);                    
                } else {
                    System.out.println("Incorrect item index.");
                }                  
                break;
            case "quit":
                input.close();
                return;
            default:
                System.out.println("Prompt not recognised.");
            }
            input.close();        
        }       
    }
}
