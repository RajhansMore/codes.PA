
class OOP
{
    public static void main(String Arg[])
    {
        System.out.println("inside main function");
        
        Arithematic obj1 = new Arithmatic();
        Arithematic obj2 = new Arithmatic(11,10);
        
        int iret = 0;

        iret = obj1.addition(); //0
        System.out.println("addition is : "+iret);

        iret = obj1.substraction(); //0
        System.out.println("substraction is : "+iret);

        iret = obj2.addition(); //21
        System.out.println("addition is : "+iret);

        iret = obj2.substration(); //1
        System.out.println("substration is : "+iret);
    }
}

class Arithematic 
{
    public int no1;
    public int no2;

    public int Arithematic() //default constructor 
    {
        System.out.println("inside default constructor");
        this.no1=0;
        this.no2=0;
    }
    public int Arithematic(int i, int j)  // parametrised constructor 
    {
        System.out.println("inside parametrised constructor");
        this.no1=i;
        this.no2=j;
    }

    public int addition()
    {
        int ans= 0;
        ans = this.no1 + this.no2;
        return ans;
    }
    
    public int substraction()
    {
        int ans= 0;
        ans = this.no1 - this.no2;
        return ans;
    }
}