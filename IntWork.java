//Ashley Gutierrez Carreto
//October 25th, 2023
//Lab 8 IntWork
//Running a class that reads an integers if it is in the limits between 
//two more integers or not

public class IntWork
{   

    private int lowerLimit; //instantiate variable
    private int upperLimit; //instantiate variable
    public IntWork  (int x, int y) //instantiate variable
  
    { 
    
         lowerLimit = x;
         upperLimit = y;
     
    }

    public  boolean inRange(int number) //boolean type to check true or false
    {  
        return (lowerLimit <= number && number <= upperLimit); 

    }   
}



