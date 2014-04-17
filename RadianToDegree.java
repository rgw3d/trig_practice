import java.util.Random;
import java.util.Scanner;
public class RadianToDegree
{
    public void main()
    {   //used to test Radians to degrees.  
        System.out.println("\nRadians to Degrees!");
        System.out.println("Type -1 at any time to quit and return to the front page");
        RandomWithOutRepetitions rndObj=new RandomWithOutRepetitions();
        Scanner kb=new Scanner(System.in);
        String tempString="";
        int tempInt=-1;
        for(int loop=0; loop<17; loop++)
        {          
            tempInt=rndObj.noRepetition();
            System.out.println("\nWhat is this measure in Degrees?\t" + Constants.commonAngles[tempInt][1]);
            tempString=kb.nextLine().trim();
            if(tempString.equals(Constants.commonAngles[tempInt][0]))         
                System.out.println("Right!");            
            else if(tempString.equals("-1"))
                break;       
            else
                System.out.println("You Suck!");
        }    
    }
}