import java.awt.*;
import java.awt.event.*;
public class MiniCalci1 extends Frame{
//    Label l1;
    TextField l1;
    Button p,m,a,d,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bcalc,bclr;
    Double num1,num2;
    public MiniCalci1()
    {   //FRAME
        super("CALCULATOR");
        setSize(300,450);
        setLayout(new GridBagLayout());     
//LABEL 
//        l1=new Label();
        l1 = new TextField(); 
        l1.setBackground(Color.LIGHT_GRAY);
//BUTTONS
        p=new Button("+"); 
        m=new Button("-");
        a=new Button("*");
        d=new Button("/");
            
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        b0=new Button("0");
        bdot=new Button(".");
        bcalc=new Button("=");
        bclr=new Button("clr");
//Gridbag
        GridBagConstraints c = new GridBagConstraints();

        c.gridwidth = 4;
        c.gridheight = 6;
        c.weightx = 5.0;
        c.weighty = 10.0;
        c.fill = GridBagConstraints.BOTH;

        c.gridx=0;
        c.gridy=0;
        c.gridwidth=30;
        c.gridheight=10;
    add(l1,c);
        c.gridy=10;
        c.gridwidth=10;
        c.gridheight=10;
   add(d,c);
        c.gridy=20;
        c.gridwidth=10;
        c.gridheight=10;
   add(b7,c);
        c.gridy=30;
        c.gridwidth=10;
        c.gridheight=01;
    add(b4,c);
        c.gridy=40;
        c.gridwidth=10;
        c.gridheight=10;
    add(b1,c);
        c.gridy=50;
        c.gridwidth=20;
        c.gridheight=10;
    add(b0,c);
        c.gridx=10;
        c.gridy=10;
        c.gridwidth=10;
        c.gridheight=10;
    add(a,c);
        c.gridy=20;
        c.gridwidth=10;
        c.gridheight=10;
    add(b8,c);
        c.gridy=30;
        c.gridwidth=10;
        c.gridheight=10;
    add(b5,c);
        c.gridy=40;
        c.gridwidth=10;
        c.gridheight=10;
    add(b2,c);
        c.gridx=20;
         c.gridy=10;
        c.gridwidth=20;
        c.gridheight=10;
    add(m,c);
        c.gridy=20;
        c.gridwidth=10;
        c.gridheight=10;
    add(b9,c);
        c.gridy=30;
        c.gridwidth=10;
        c.gridheight=10;
    add(b6,c);
        c.gridy=40;
        c.gridwidth=10;
        c.gridheight=10;
    add(b3,c);
        c.gridy=50;
        c.gridwidth=10;
        c.gridheight=10;
    add(bdot,c);
        c.gridx=30;
        c.gridy=00;
        c.gridwidth=10;
        c.gridheight=10;
    add(bclr,c);
        c.gridy=20;
        c.gridwidth=10;
        c.gridheight=20;
    add(p,c);
        c.gridy=40;
        c.gridwidth=10;
        c.gridheight=20;
    add(bcalc,c);
 // adding action command
        d.setActionCommand("/");
        a.setActionCommand("*");
        m.setActionCommand("-");
        p.setActionCommand("+");
        bcalc.setActionCommand("=");
        bdot.setActionCommand(".");
        bclr.setActionCommand("clr");
        
        b1.setActionCommand("1");
        b2.setActionCommand("2");
        b3.setActionCommand("3");
        b4.setActionCommand("4");
        b5.setActionCommand("5");
        b6.setActionCommand("6");
        b7.setActionCommand("7");
        b8.setActionCommand("8");
        b9.setActionCommand("9");
//EventHandeling
        Event_handel eh=new Event_handel(this);
        d.addActionListener(eh);
        a.addActionListener(eh);
        m.addActionListener(eh);
        p.addActionListener(eh);
        
        b1.addActionListener(eh);
        b2.addActionListener(eh);
        b3.addActionListener(eh);
        b4.addActionListener(eh);
        b5.addActionListener(eh);
        b6.addActionListener(eh);
        b7.addActionListener(eh);
        b8.addActionListener(eh);
        b9.addActionListener(eh);
        b0.addActionListener(eh);
        bdot.addActionListener(eh);
        bcalc.addActionListener(eh);
        bclr.addActionListener(eh);
        
        d.addKeyListener(eh);
        a.addKeyListener(eh);
        m.addKeyListener(eh);
        p.addKeyListener(eh);
        
        b1.addKeyListener(eh);
        b2.addKeyListener(eh);
        b3.addKeyListener(eh);
        b4.addKeyListener(eh);
        b5.addKeyListener(eh);
        b6.addKeyListener(eh);
        b7.addKeyListener(eh);
        b8.addKeyListener(eh);
        b9.addKeyListener(eh);
        b0.addKeyListener(eh);
        bdot.addKeyListener(eh);
        bcalc.addKeyListener(eh);
        bclr.addActionListener(eh);
        
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e)
            {System.exit(0);}
        });
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MiniCalci1();
    }
}
class Event_handel implements ActionListener,KeyListener{
    int c=0;
    MiniCalci1 mc;
    Event_handel(MiniCalci1 mc){
        this.mc=mc;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    { 
        //Numbers
        if(e.getSource()==mc.b1)
            mc.l1.setText(mc.l1.getText()+"1");
        if(e.getSource()==mc.b2)
            mc.l1.setText(mc.l1.getText()+"2");
        if(e.getSource()==mc.b3)
            mc.l1.setText(mc.l1.getText()+"3");
        if(e.getSource()==mc.b4)
            mc.l1.setText(mc.l1.getText()+"4");
        if(e.getSource()==mc.b5)
            mc.l1.setText(mc.l1.getText()+"5");
        if(e.getSource()==mc.b6)
            mc.l1.setText(mc.l1.getText()+"6");
        if(e.getSource()==mc.b7)
            mc.l1.setText(mc.l1.getText()+"7");
        if(e.getSource()==mc.b8)
            mc.l1.setText(mc.l1.getText()+"8");
        if(e.getSource()==mc.b9)
            mc.l1.setText(mc.l1.getText()+"9");
        if(e.getSource()==mc.b0)
            mc.l1.setText(mc.l1.getText()+"0");
        if(e.getSource()==mc.bdot)              //ADD DECIMAL PTS
             mc.l1.setText(mc.l1.getText()+"."); 
        if(e.getSource()==mc.bclr)
            mc.l1.setText("0");
       
        if(e.getSource()==mc.p)
        {
          if(c==0)
            {
                try{    mc.num1=Double.valueOf(mc.l1.getText());
                }
                catch(NumberFormatException f)
                {   mc.l1.setText("Invalid format");
                    return;
                }
            }
          else{
                try{    mc.num2=Double.valueOf(mc.l1.getText());
                  }
                  catch(NumberFormatException f)
                  {   mc.l1.setText("Invalid format");
                      return;
                  }
                 switch(c) {
                  case 1 -> mc.num1=mc.num1+mc.num2;
                  case 2 -> mc.num1=mc.num1-mc.num2;
                  case 3 -> mc.num1=mc.num1*mc.num2;
                  case 4 -> mc.num1=mc.num1/mc.num2;
                  default -> { }
                }
              }
          mc.l1.setText("");
          c=1;
        }
        else if(e.getSource()==mc.m)
        {
          if(c==0)
            {
                try{    mc.num1=Double.valueOf(mc.l1.getText());
                }
                catch(NumberFormatException f)
                {   mc.l1.setText("Invalid format");
                    return;
                }
            }
          else{
                try{    mc.num2=Double.valueOf(mc.l1.getText());
                  }
                  catch(NumberFormatException f)
                  {   mc.l1.setText("Invalid format");
                      return;
                  }
                 switch(c) {
                  case 1 -> mc.num1=mc.num1+mc.num2;
                  case 2 -> mc.num1=mc.num1-mc.num2;
                  case 3 -> mc.num1=mc.num1*mc.num2;
                  case 4 -> mc.num1=mc.num1/mc.num2;
                  default -> { }
                }
              }
          mc.l1.setText("");
          c=2;
        }
        else if(e.getSource()==mc.a)
        {
          if(c==0)
            {
                try{    mc.num1=Double.valueOf(mc.l1.getText());
                }
                catch(NumberFormatException f)
                {   mc.l1.setText("Invalid format");
                    return;
                }
            }
          else{
                try{    mc.num2=Double.valueOf(mc.l1.getText());
                  }
                  catch(NumberFormatException f)
                  {   mc.l1.setText("Invalid format");
                      return;
                  }
                 switch(c) {
                  case 1 -> mc.num1=mc.num1+mc.num2;
                  case 2 -> mc.num1=mc.num1-mc.num2;
                  case 3 -> mc.num1=mc.num1*mc.num2;
                  case 4 -> mc.num1=mc.num1/mc.num2;
                  default -> { }
                }
              }
          mc.l1.setText("");
          c=3;
        }
        else if(e.getSource()==mc.d)
        {
          if(c==0)
            {
                try{    mc.num1=Double.valueOf(mc.l1.getText());
                }
                catch(NumberFormatException f)
                {   mc.l1.setText("Invalid format");
                    return;
                }
            }
          else{
                try{    mc.num2=Double.valueOf(mc.l1.getText());
                  }
                  catch(NumberFormatException f)
                  {   mc.l1.setText("Invalid format");
                      return;
                  }
                 switch(c) {
                  case 1 -> mc.num1=mc.num1+mc.num2;
                  case 2 -> mc.num1=mc.num1-mc.num2;
                  case 3 -> mc.num1=mc.num1*mc.num2;
                  case 4 -> mc.num1=mc.num1/mc.num2;
                  default -> { }
                }
              }
          mc.l1.setText("");
          c=4;
        }
        else if(e.getSource()==mc.bcalc)
        {
            try{    mc.num2=Double.valueOf(mc.l1.getText());
                  }
            catch(NumberFormatException f)
            {   mc.l1.setText("Invalid format");
                return;
            }
            switch(c) {
             case 1 -> mc.num1=mc.num1+mc.num2;
             case 2 -> mc.num1=mc.num1-mc.num2;
             case 3 -> mc.num1=mc.num1*mc.num2;
             case 4 -> mc.num1=mc.num1/mc.num2;
             default -> { }
            }
        mc.num2=0.0;
        mc.l1.setText(String.valueOf(mc.num1));
        c=0;
        }
    }
    // key controls
    @Override
    public void keyPressed(KeyEvent e)
     {
        char x;
        x = e.getKeyChar();
       if(x == '.') actionPerformed (new ActionEvent(mc.p,ActionEvent.ACTION_PERFORMED,"."));
       if(x == '+') actionPerformed (new ActionEvent(mc.p ,ActionEvent.ACTION_PERFORMED,"+"));
       if(x == '-') actionPerformed (new ActionEvent(mc.m ,ActionEvent.ACTION_PERFORMED,"-"));
       if(x == '*') actionPerformed (new ActionEvent(mc.a,ActionEvent.ACTION_PERFORMED, "*"));
       if(x == '/') actionPerformed (new ActionEvent(mc.d ,ActionEvent.ACTION_PERFORMED,"/"));
       if(x == '='||x == KeyEvent.VK_ENTER) actionPerformed(new ActionEvent(mc.bcalc,ActionEvent.ACTION_PERFORMED,"="));
      if(x == KeyEvent.VK_BACK_SPACE) actionPerformed(new ActionEvent(mc.bclr,ActionEvent.ACTION_PERFORMED,"clr"));
 
        if(x == '0') actionPerformed (new ActionEvent(mc.b0,ActionEvent.ACTION_PERFORMED,"0"));
        if(x == '1') actionPerformed (new ActionEvent(mc.b1,ActionEvent.ACTION_PERFORMED,"1"));
        if(x == '2') actionPerformed (new ActionEvent(mc.b2,ActionEvent.ACTION_PERFORMED,"2"));
        if(x == '3') actionPerformed (new ActionEvent(mc.b3, ActionEvent.ACTION_PERFORMED,"3"));
        if(x == '4') actionPerformed (new ActionEvent(mc.b4, ActionEvent.ACTION_PERFORMED,"4"));
        if(x == '5') actionPerformed (new ActionEvent(mc.b5,ActionEvent.ACTION_PERFORMED,"5"));
        if(x == '6') actionPerformed (new ActionEvent(mc.b6,ActionEvent.ACTION_PERFORMED,"6"));
        if(x == '7') actionPerformed (new ActionEvent(mc.b7, ActionEvent.ACTION_PERFORMED,"7"));
        if(x == '8') actionPerformed (new ActionEvent(mc.b8, ActionEvent.ACTION_PERFORMED,"8"));
        if(x == '9') actionPerformed (new ActionEvent(mc.b9, ActionEvent.ACTION_PERFORMED,"9"));
    }
    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}