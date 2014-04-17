/**
 * So this will be used to practice trig values and the unit circle 
 */
import java.util.Scanner;
import java.util.Arrays;
public class Tester
{
    public static void main(String args[])
    {
        System.out.println("What do you want to test? \n1 for degrees to radians \n2 for radians to degrees \n3 a mix of radians and degrees \n4 Trig Values");
        Scanner read=new Scanner(System.in);
        for (int y=1; y==y; y+=0)
        {
            int x=read.nextInt();
            if(x!=0)
            {
                switch(x)
                {
                    case 1:        
                    DegreeToRadian objDR=new DegreeToRadian();
                    objDR.main();
                    break;
                    case 2:
                    RadianToDegree objRD=new RadianToDegree();
                    objRD.main();
                    break;
                    case 3:
                    DegreeRadianMix objDRM=new DegreeRadianMix();
                    objDRM.main();
                    case 4:
                    TrigValues objTV=new TrigValues();
                    objTV.main();
                    break;
                }
                System.out.println("Type 0 to exit");
            }
            else
                break;
        }
    }
}
