//*****************************************************************************************************
//
//      File:               Customer.java
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
//      2.  CustomerListManager.java  -  Contains the main method.
//      3.  Validator.java  -  Contains the Validator class.
//
//*****************************************************************************************************

//package customerlistmanager;

//*****************************************************************************************************

public class Customer 
{
    private String name,
            custID,
            email;
    
    //*****************************************************************************************************
    
    public Customer()
    {
        name = "";
        custID = "";
        email = "";
    }
    
    //*****************************************************************************************************
    
    public Customer(String name, String custID, String email)
    {
        this.name = name;
        this.custID = custID;
        this.email = email;
    }
    
    //*****************************************************************************************************
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    //*****************************************************************************************************
    
    public void setCustID(String custID)
    {
        this.custID = custID;
    }
    
    //*****************************************************************************************************
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    //*****************************************************************************************************
    
    public String getName()
    {
        return name;
    }
    
    //*****************************************************************************************************
    
    public String getCustID()
    {
        return custID;
    }
    
    //*****************************************************************************************************
    
    public String getEmail()
    {
        return email;
    }
    
    //*****************************************************************************************************
    
    @Override
    public String toString()
    {
        String output = "";
        output += name + "\n";
        output += custID + "\n";
        output += email;
        return output;
    }
    
}
