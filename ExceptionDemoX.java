import java.util.Scanner;


class ExceptionDemoX
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int no1 = 0, no2 = 0;
        float ans  =0.0f;

        System.out.println("Enter first number");
        no1= sobj.nextInt();
        
        System.out.println("Enter second number");
        no2= sobj.nextInt();
        
        try
        {
            System.out.println("Inside try");
            ans = no1/no2;
        }

        catch(ArithmeticException obj)
        {
            System.out.println("Exception accured & code is insde catch block :"+obj);
        }

        finally
        {
            System.out.println("Code is inside finally block..");
            System.out.println("Division is : "+ans);

        }
    }
}