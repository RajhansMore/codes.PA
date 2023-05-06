import java.io.*;

class Randomaccess
{
    public static void main(String Arg[]) throws Exception
    {
        RandomAccessFile fobj = new RandomAccessFile("infosystems.txt","rw");

        fobj.writeUTF("abcdefghij");

        fobj.seek(0);
        System.out.println("Data from file is: " +fobj.readUTF());

        fobj.seek(5);

        fobj.writeUTF("****");
        System.out.println("Data from file is: "+fobj.readUTF());
    }
}