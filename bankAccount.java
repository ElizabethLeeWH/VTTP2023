import javax.xml.crypto.dsig.SignatureMethod;
import java.util.Date;
import java.util.LinkedList;
import java.util.UUID;
import java.util.List;

public class bankAccount {
    private String accHolderName;
    private String accNumber;
    private float accBalance;
    private List<String> accOps = new LinkedList<>();
    private boolean accClose;
    private Date accCreating;
    private Date accClosing;
    
    public String getaccHolderName(){
        return "Account Holder Name: " + accHolderName;
    }

    public String getaccNumber(){
        return "Account Number: " + accNumber;
    }

    public void bankAccount(String name, String number){
        accHolderName = "John";
        accNumber = UUID.randomUUID().toString().substring(0,8);
    }

    public void deposit(float amount){
        if(amount > 0){
            accBalance += amount;
            System.out.println("Deposited: %s\n", accBalance.get());
        }
    }
}
