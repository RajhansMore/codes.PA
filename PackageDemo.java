import Marvellous.Arithmatic;
import Marvellous.Mathematics;

class PackageDemo
{
    public static void main(String Arg[])
    {
        Arithmatic aobj = new Arithmatic();
        Mathematics mobj = new Mathematics();

        int iRet = 0;
        iRet = aobj.addition(10,11);
        System.out.println("addition is : "+iRet);
        
        iRet = aobj.substraction(10,11);
        System.out.println("substraction is : "+iRet);

        iRet = mobj.square(10);
        System.out.println("square is : "+iRet);

        iRet = mobj.cube(10);
        System.out.println("cube is : "+iRet);
    }
}