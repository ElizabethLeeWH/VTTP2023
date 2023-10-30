import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
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
            // case "load":
            //     FileInputStream fileStream = new FileInputStream("./shoppingCart/src/" + terms[1] + ".cart");
            //     ObjectInputStream is = new ObjectInputStream(fileStream);
            case "login":
                try(FileInputStream fis = new FileInputStream("-/shoppingCart/" + item + "cart.txt")){
                    FileReader file = new FileReader("cart.txt");
                    BufferedReader bf = new BufferedReader(file);
                    String line = bf.readLine();
                    List<String> listOfString = new ArrayList<String>(); 
                    while (line != null){
                        myShoppingCart.add(line);
                        line = bf.readLine();
                    }
                    System.out.println(myShoppingCart);;

                    // for (String i: )

                } catch(IOException) {
                    FileOutputStream fos = new FileOutputStream("-/shoppingCart/" + item + "cart.txt")
                }
                break;
            case "user":

            case "save":
                
                             
            case "list":
                if (myShoppingCart.isEmpty()){
                    System.out.println("Your cart is empty.");                   
                }
                else {
                    //this method generates a lot of garbage and is inefficient
                    int size = myShoppingCart.size();                    
                    for (int i=0; i<size; i++){
                        System.out.println(i+1 + ". " + myShoppingCart.get(i));                        
                    }
                    //this method is better
                    // for (String item: myShoppingCart){
                    //     int i = ;
                    //     System.out.println("%d, %s%n", (i+1), item);
                    // }
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
                if ( itemIndex < myShoppingCart.size()){
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
