//Ashley Gutierrez Carreto
//October 25th, 2023
//Lab 8 IntWork
//Running a class that reads an integers if it is in the limits between 
//two more integers or not
public class IntWorkTest
{   
    public static void main (String [] args)
    {
 
        IntWork myIntWork = new IntWork(10,20);//Instantiates the class "IntWork"
          
        int num = 29; //variable that is not in range
      
      
        if (myIntWork.inRange(num))//calling a method
        {
            System.out.println ("Your integer is between the limits. ");
            //if statement if it is false
        }
      
        else 
        {
            System.out.println ("Your integer is not between the limits. ");
            //if the statement is true
        }
    }
}

