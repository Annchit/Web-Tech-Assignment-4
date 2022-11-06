import java.util.*;

class Assignment4Que1{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Take user input for the size of vector
        System.out.println("what is the size of the vector that you want");
        int size_of_vector = input.nextInt();

        

        if(size_of_vector <=0 ){
            System.out.println("Give a bigger value for the size of vector");
            input.close();
            return;
        }
        Vector userVector = new Vector(size_of_vector);

        
        System.out.println("what do you want to save in the vector (to stop giving inputs, give -1)");

        // vectorEntries keeps tally of the inputs given by the user incase the whole capacity of the vector is not utilized
        // kept initialized to -1 for the corner case that user gives no input for the vector
        int vectorEntries = -1;

        // Take input for the vector from the user till the user wants to give inputs, then stop
        for(int i =0;i<size_of_vector;i++)
        {
            int obj = input.nextInt();
            if(obj == -1){
                break;
            }
            // if the user wants to save a value in the vector, then use <vector_name>.add() 
            userVector.add(obj);
            vectorEntries++;
        }
        
        input.close();
        
        System.out.println("vector so produced is : ");
        for(int i=0;i<size_of_vector && i<=vectorEntries;i++){
           
            System.out.println(userVector.elementAt(i));
        }
    }
}