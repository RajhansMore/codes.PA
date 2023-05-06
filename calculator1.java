import java.awt.*;
import java.awt.event.*;

class calculator
{
    public static void main(String Arg[])
    {
        marvellouscalculator mobj = new marvellouscalculator(400,400,"Marvellous");

    }
}

class marvellouscalculator extends WindowAdapter implements ActionListener
{
    public Frame fobj;
    public Button b1,b2,b3,b4;
    public TextField t1, t2;
    public Integer no1, no2;

    public marvellouscalculator(int width, int height, String title)
    {
        fobj = new Frame(title);
        fobj.setSize(width,height);
    

        fobj.addWindowListener(this);

        b1= new Button("Add");
        b2= new Button("Sub");
        b3= new Button("Mult");
        b4= new Button("Div");

        t1 = new TextField();
        t2 = new TextField();

        b1.setBounds(100,280,80,40);   //X,Y,W,H
        b2.setBounds(100,280,80,40);   //X,Y,W,H
        b3.setBounds(190,280,80,40);   //X,Y,W,H
        b4.setBounds(290,280,80,40);   //X,Y,W,H

        b1.setBounds(70,100,100,40);   //X,Y,W,H
        b2.setBounds(220,280,100,40);   //X,Y,W,H

        fobj.add(b1);
        fobj.add(b2);
        fobj.add(b3);
        fobj.add(b4);

        fobj.add(t1);
        fobj.add(t2);

        lobj = new Label();
        b2.setBounds(150,25,200,100);   //X,Y,W,H
        
        fobj.add(lobj);


        fobj.setLayout(null);
        fobj.setVisible(true);

    }
    public void windowClosing(WindowEvent obj) //event handler for frame
    {
        System.exit(0);
    }
    public void actionPerformed(ActionEvent aobj)   //event handler for buttons
    {
        try
        {
         no1 = Integer.parsInt(t1.getText());
        
         no2 = Integer.parsInt(t2.getText());

         if(aobj.getSource()==b1)  //add
         {
            lobj.setText("Additon is : "+(no1+no2));

         }
         else if(aobj.getSource()==b1)  //add
         {
            lobj.setText("sub is : "+(no1-no2));

         }
         else if(aobj.getSource()==b1)  //add
         {
            lobj.setText("mult is : "+(no1*no2));

         }
         else if(aobj.getSource()==b1)  //add
         {
            lobj.setText(" is : "+(no1/no2));

         }
        }
        catch(Exception eobj)
        {

        }
    }
}