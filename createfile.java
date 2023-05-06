import java.io.*;

class createfile
{
    public static void main(String Arg[]) throws Exception
    {
        File fobj = new File("infosystems.txt");

        if(fobj.createNewFile())
        {
            System.out.println("File successfully created");
        }
        else
        {
            System.out.println("Unalbe to create the file");
        }

    }
}