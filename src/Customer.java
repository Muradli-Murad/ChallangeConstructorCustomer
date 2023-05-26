import javax.sound.midi.Soundbank;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;


    public Customer(){
        this("Default", "Default@gmail");
        System.out.println("Default Constructor was called");
    }

    public Customer(String name,String email){
        this(name,25000.00,email);
        System.out.println("Like a default constructor was called");
    }

    public Customer(String name,double creditLimit,String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
        System.out.println("Major Constructor was called");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
