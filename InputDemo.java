import java.io.*;

class InputDemo
{
    public static void main(String Arg[]) 

    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader (System.in));
        try
        {
            System.out.println("Enter first number");
            int no1= Integer.parseInt(bobj.readLine());

            System.out.println("Enter second number");
            int no2= Integer.parseInt(bobj.readLine());
        }
        catch(IOException obj)
        {

        }
        int ans = no1 + no2;

        System.out.println("addiction is "+ans);
    }
}