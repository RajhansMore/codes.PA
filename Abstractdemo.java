class Abstractdemo
{
    public static void main (String Arg[])
    {
      //  RBI robj = new RBI();
        SBI sobj = new SBI();
        BOM bobj = new BOM ();

        sobj.DisplayRules();
        bobj.DisplayRules();

        float fRet = 0.0f;
        fRet = sobj.CalculateROI();
        System.out.println("RIO of SBI os "+fRet);

        fRet = sobj.CalculateROI();
        System.out.println("RIO of BOM os "+fRet);
    }
}

abstract class RBI
{
    public abstract float CalculateROI();
    public void DisplayRules()
    {
        System.out.println("You have to submit adhar and pan card");
        System.out.println("Minimum balance is 10,000");
        
    }
}

class SBI extends RBI
{
    public float CalculateROI()
    {
        return 5.7f;
    }

}

class BOM extends RBI
{
    public float CalculateROI()
    {
        return 7.7f;
    }
}


