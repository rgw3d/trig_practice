import java.util.Random;
import java.util.Scanner;
public class DegreeRadianMix
{
    public void main()
    {//this will be a mix of radians and degrees. there will be more random numbers
        System.out.println("\nRadians to Degrees!");
        System.out.println("Type -1 at any time to quit and return to the front page");
        RandomWithOutRepetitions rndObj=new RandomWithOutRepetitions();//to get the list of random numbers
        Scanner kb=new Scanner(System.in);
        String tempString="";
        Random findOneOrTwo=new Random();
        int tempInt=-1;
        boolean tempRnd=true;
        for(int loop=0; loop<17; loop++)
        {          
            tempInt=rndObj.noRepetition();
            tempRnd=findOneOrTwo.nextBoolean();//change this to true or false, easier to switch
            if(tempRnd==false)//either degrees or radians
            {
                System.out.println("\nWhat is this measure in Radians?\t"+ Constants.commonAngles[tempInt][0]);
                tempString=kb.nextLine().trim();
                if(tempString.equals(Constants.commonAngles[tempInt][1]))         
                    System.out.println("Right!");            
                else if(tempString.equals("-1"))
                    break;       
                else
                    System.out.println("You Suck!");
            }
            else
            {
                System.out.println("\nWhat is this measure in Degrees?\t"+ Constants.commonAngles[tempInt][1]);
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
}
