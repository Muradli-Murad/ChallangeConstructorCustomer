import java.security.PrivateKey;
import java.sql.SQLOutput;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args){

        Customer muradCustomer=new Customer("Murad",18000.25,"murad@email.com");
        System.out.println("Name "+muradCustomer.getName()+ " ,Credit Limit = "+muradCustomer.getCreditLimit());

        Customer zaurCustomer=new Customer("Zaur","zaur@GMAIL");
        System.out.println("Name "+zaurCustomer.getName()+ " ,Credit Limit = "+zaurCustomer.getCreditLimit()+", " +
                "Email = "+ zaurCustomer.getEmail());

        Customer defaultCustomer=new Customer();

            }
        };
