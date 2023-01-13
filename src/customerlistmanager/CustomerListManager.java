//*****************************************************************************************************
//
//      File:               CustomerListManager.java
//
//      Student:            Leon Krugliakov
//
//      Assignment:         Assignment #8
//
//      Course Name:        Java I
//
//      Course Number:      COSC 2050 - 01
//
//      Due:                April 1st, 2020
//
//
//      This progam takes in user responses about whether the user wants to 
//      view the contents of a txt file or input information into the file.
//      Then program does the corresponding action to the user's choice of
//      presenting the file content or adds informaiton to the file.
//
//      Other files required:
//      1.  CustomerIO.java  -  Contains the CustomerIO class.
//      2.  Customer.java  -  Contains the Customer class.
//      3.  Validator.java  -  Contains the Validator class.
//
//*****************************************************************************************************

//package customerlistmanager;

//*****************************************************************************************************

import java.util.Scanner;
import java.util.ArrayList;

//*****************************************************************************************************

public class CustomerListManager 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        CustomerIO customersFile = new CustomerIO();
        int answer = 0,
                size;
        String customer = "";
        ArrayList<String> customers = null;
        
        System.out.println("Customer List Manager\n");
        System.out.println("1 - Display all customers");
        System.out.println("2 - Add a customer");
        System.out.println("3 - Exit");
        
        while(answer != 3)
        {
            
            answer = Validator.getIntWithinRange(sc, "\nEnter menu item: ", 1, 3);
            System.out.println();
            
            switch(answer)
            {
                case 1:
                {
                    customers = customersFile.getCustomers();
                    size = customers.size();
                    for(int i = 0; i < size; i++)
                    {
                        customer = customers.get(i);
                        System.out.println(customer);
                    }
                    break;
                }
                case 2:
                {
                    customers = customersFile.getCustomers();
                    
                    sc.nextLine();
                    customer = "";
                    
                    System.out.println("Enter customer information: ");
                    customer += Validator.getRequiredString(sc, "Enter name: ") + "\n";
                    customer += Validator.getRequiredString(sc, "Enter Customer ID: ") + "\n";
                    customer += Validator.getRequiredString(sc, "Enter customer email: ");
                    
                    customers.add("\n" + customer);
                    
                    customersFile.saveCustomers(customers);
                    
                    System.out.println("This customer has been saved.");
                    break;
                }
                case 3:
                {
                    System.out.println("Goodbye.");
                    break;
                }
                
            }
            
        }
    }
}

//*****************************************************************************************************

/*
Customer List Manager

1 - Display all customers
2 - Add a customer
3 - Exit

Enter menu item: 1

Thomas	Willliams
42124	
tomwilliams@gmail.com

Jane	Adams	
29521
janeadams@yahoo.com

Robert	Rodriguez
93197	
robertrodriguez@sbcglobal.net

Enter menu item: 2

Enter customer information: 
Enter name: John Doe
Enter Customer ID: 45123
Enter customer email: johndoe@something.com
This customer has been saved.

Enter menu item: 3

Goodbye.
*/