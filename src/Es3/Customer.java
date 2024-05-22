package Es3;

import java.util.Date;
import java.util.Random;

public class Customer {
    private int id;
    private String name;
    private String surname;
    private String email;
    private Date registrationAt;

    public Customer(String email, String surname, String name) {
        Random rand = new Random();
        this.id = rand.nextInt(1, 10000);
        this.registrationAt = new Date();
        this.email = email;
        this.surname = surname;
        this.name = name;
    }

    public void printCustomer() {
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Email: " + this.email);
        System.out.println("Id: " + this.id);
        System.out.println("Registration: " + this.registrationAt);
    }

//    public int getId() {
//        return id;
//    }
//
//    public Date getRegistrationAt() {
//        return registrationAt;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public String getName() {
//        return name;
//    }
}
