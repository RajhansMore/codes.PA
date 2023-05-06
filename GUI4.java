import java.awt.*;
import java.awt.event.*;

class GUI4
{
    public static void main(String a[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA");
    }
}

class MarvellousFrame
{
    public Frame fobj;
    public MarvellousFrame(String Title);
    {
        Frame fobj = new Frame(title);
        fobj.setSize(400,400);
        fobj.setVisible(true);
        fobj.addWindowlistener(new MarvellousListener());
    }
}
class MarvellousListener implements Windowlistener
{
    public void windowDeactivated(WindowEvent obj){}
    public void windowDeiconified(WindowEvent obj){}
    public void windowIconified(WindowEvent obj){}
    public void windowClosed(WindowEvent obj){}
    public void windowOpened(WindowEvent obj){}
    public void windowActivated(WindowEvent obj){}
    public void windowClosing(WindowEvent obj){}
    {
        Systemexit(0);
    }
    
    
} 
