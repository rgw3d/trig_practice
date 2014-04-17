import java.util.Random;
public class RandomWithOutRepetitions
{
    public int noRepetition()
    {
        Random findRnd=new Random();  
        if(list[0]==-1)
        {
            for(int loop=0; loop<17; loop++)
            {
                if(loop==0)
                   list[loop]=findRnd.nextInt(17);
                else
                {
                
                    while(true)
                    {
                        int temp=findRnd.nextInt(17);
                        if(!(temp==list[0]||temp==list[1]||temp==list[2]||temp==list[3]||temp==list[4]||temp==list[5]||temp==list[6]||temp==list[7]||temp==list[8]||temp==list[9]||temp==list[10]||temp==list[11]||temp==list[12]||temp==list[13]||temp==list[14]||temp==list[15]||temp==list[16]))
                        {//make sure that it does not equal any of the other values
                            list[loop]=temp;
                            break;
                        }
                    }
                }
            }
        }
        return list[iteration++];
    }
    public int[] list= { -1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    private int iteration=0;
}
