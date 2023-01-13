//*****************************************************************************************************
//
//      File:               CustomerIO.java
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
//      1.  Customer.java  -  Contains the Customer class.
//      2.  CustomerListManager.java  -  Contains the main method.
//      3.  Validator.java  -  Contains the Validator class.
//
//*****************************************************************************************************

//package customerlistmanager;

//*****************************************************************************************************

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

//*****************************************************************************************************

public class CustomerIO 
{
    private File customersFile;
    
    //*****************************************************************************************************
    
    private void checkFile()
    {
        Path customersPath = Paths.get("customers.txt");
        
        try
        {
            if(!Files.exists(customersPath))
            {
                customersFile.createNewFile();
            }
        }
        catch(IOException e)
        {
            System.out.println("Cannot read file!");
            System.out.println(e);
        }
    }
    
    //*****************************************************************************************************
    
    public CustomerIO()
    {
        customersFile = new File("customers.txt");
        this.checkFile();
    }
    
    //*****************************************************************************************************
    
    public ArrayList<String> getCustomers()
    {
        ArrayList<String> customers = null;
        
        try(BufferedReader in = 
                new BufferedReader(new FileReader(customersFile)))
        {
            customers = new ArrayList<>();
            String customer = in.readLine();
            
            while(customer != null)
            {
                customers.add(customer);
                customer = in.readLine();
            }
            
            in.close();
            
        }
        catch(IOException e)
        {
            System.out.println("Can't read file anymore!");
        }
        
        return customers;
    }
    
    //*****************************************************************************************************
    
    public boolean saveCustomers(ArrayList<String> customers)
    {
        boolean writable = false;
        try(PrintWriter out = new PrintWriter(new BufferedWriter(
                new FileWriter(customersFile))))
        {
            
            for(String customer: customers)
            {
                out.println(customer);
            }
            
            writable = true;
            out.close();
        }
        catch(IOException e)
        {
            System.out.println("Can't write to the file!");
        }
        
        
        return writable;
    }
}
