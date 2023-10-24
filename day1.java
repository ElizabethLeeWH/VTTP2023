import java.util.ArrayList;
import java.util.Scanner; //import the scanner class

public class day1 {
    /**
     * @param args
     */
    public static void main(String[] args){

        Scanner item = new Scanner(System.in);   
        ArrayList<String> myShoppingCart = new ArrayList<String>();
        String prompt = item.next();
        
        System.out.println("Welcome to your shopping cart");

        switch(prompt.trim().toLowerCase()){
            case "list":
                while (!myShoppingCart.isEmpty()){
                    for (String element : myShoppingCart){
                        System.out.println(element);                        
                    }

                    if (myShoppingCart.isEmpty()){
                        System.out.println("Your cart is empty");
                        break;
                    }
                    
                }

        }

        


        // boolean isUnique = true;
        //     for (String i: myShoppingCart){
        //         if (input.equals(myShoppingCart.get()){
        //             isUnique = false;
        //         }
        //     }
        //     if (isUnique == true){
        //         myShoppingCart.add(input);
        //     }
    
    }
}
