package pro;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import javax.swing.*;
import java.lang.NumberFormatException;
import java.lang.Math;
//this class inherit the JFRame java class and it will have ALL FUNCTION IN JFRAME.
//and implements the actionlistner interface!
public class menu1 extends JFrame implements java.awt.event.ActionListener  {
//private variables!*********************************************
//****************************************************************    
Container cont=getContentPane();
JPanel panel1=new JPanel();
private String[] country={"USD","ETB","INDIA RUPEE","POUND","EURO","CHINA YUAN"};
//adding menu items to the menus!
private JMenuItem exit=new JMenuItem("exit program");
private JMenuItem about1=new JMenuItem("info");
private JMenuItem bg=new JMenuItem("change background color");   
 //adding the labels and ionputfields *******
 //******************************************
 private JLabel from=new JLabel("FROM");
 private JLabel to=new JLabel("TO");
 private JComboBox fc=new JComboBox(country);
 private JComboBox tc=new JComboBox(country);
 private JButton convert=new JButton("GENERATE CURRENCY!");
 JTextField input=new JTextField(10);
 JTextField screen=new JTextField(10);
//puplic variables ***************************************************
 //*********************************************************************
public static boolean flag;
public static JCheckBox toall=new JCheckBox("apply to all");    
 //************************************************
 //***************************************************
   menu1()  //this is a constructor for the gui class and intialise everything as expected !
   {
      super("Currency exchange");  //this is setting the title or sending a name to jframe class!
 //container holds the current jframe!
 //setting the container 
 cont.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
 cont.setBackground(Color.pink);
 //set the default=flowlayout starting from left and make space 10,10! 
//panel is a subcontainer!
 //adding the pannels that contain LABEL component!
 //if pannel layout manager is null the setlocation can 
 //applied to change the location of components in the frame!
 //absolute positioning!
 panel1.setLayout(new GridLayout(4,2,100,10));
 panel1.setBackground(Color.pink);
 //***************************************************
//***************************************************
 //adding the menou bar and menus to the panel 
 JMenuBar bar=new JMenuBar();
 JMenu file=new JMenu("file");
 JMenu view=new JMenu("view");
 JMenu about=new JMenu("About");
 //linking items and menus!
 bar.add(file);
 bar.add(view);
 bar.add(about);
 file.add(exit);
 about.add(about1);
 view.add(bg);
 view.add(toall);
 setJMenuBar(bar);
 //adding menu bar to the container!
 //adding the pannel to the frame!
 panel1.add(from);
 panel1.add(to);
 panel1.add(fc);
 panel1.add(tc);
 panel1.add(convert);
 panel1.add(input);
 panel1.add(screen);
 cont.add(panel1);
 convert.setBackground(Color.green);
 convert.setForeground(Color.white);
 //adding the action listner !***************
 //listners here!****************************
 //******************************************
 exit.addActionListener(this);
 about1.addActionListener(this);
 bg.addActionListener(this);
 convert.addActionListener(this);
 //adding item listner by creating object 
 //that implements a itemlistner class
 //and adjusting some fields 
 item1 itemobj=new item1();
 toall.addItemListener(itemobj);
 toall.setToolTipText("tick to apply to full page ");
 screen.setEditable(false);  //user cannot write to the screen !
 screen.setText("=");
 //****************************************************************
 //setting the container size and 
 //making it visible!
    setSize(500,500);
    setVisible(true);
   }
  
//end of constructors!***********************************************
//**********************************************************************

   @Override
   public void actionPerformed(ActionEvent ae) {
     if(ae.getSource()==exit)
     {
         dispose();
     } else if(ae.getSource()==about1)
     {
       new about_menu();  
     } else if(ae.getSource()==bg)
     {
       Color color=JColorChooser.showDialog(null, "choose bg color", Color.pink); 
       cont.setBackground(color);
       if(flag)
       {
           panel1.setBackground(color);
       } } else if(ae.getSource()==convert)
     {
       if(tc.getSelectedIndex()==fc.getSelectedIndex())   
       {
         JOptionPane.showMessageDialog(null, "you have selected the same currency!", "invalid selection", JOptionPane.ERROR_MESSAGE);
       }  else {
          double xmoney=0;
          try{
            xmoney=Double.parseDouble(input.getText()); 
          } catch(NumberFormatException exp){
            
             JOptionPane.showMessageDialog(null,"you inserted invalid number or null character! "+exp.getLocalizedMessage(), "invalid selection", JOptionPane.ERROR_MESSAGE);
           dispose();
          }
          
//if there is no error proceed !
int opt=fc.getSelectedIndex();
int opt2=tc.getSelectedIndex();
//to perform the conversation all currency must exhanged to usd!     
//then again reprocessed to there format!
double umoney=0;
   switch(opt){
   case 0:usd usdo=new usd();
  umoney=usdo.to_usd(xmoney);
   break;
   case 1:etb etbo=new etb();
 umoney=etbo.to_usd(xmoney);
   break;
   case 2:rupee repo=new rupee();
   umoney=repo.to_usd(xmoney);
   break;
   case 3:pound po=new pound();
   umoney=po.to_usd(xmoney);
   break;
   case 4:euro ero=new euro();
   umoney=ero.to_usd(xmoney);
   break;
   case 5:yuan yuno=new yuan();
   umoney=yuno.to_usd(xmoney);
   break;
   
}
xmoney=umoney;
//convert back to local currency from usd 
 switch(opt2){
   case 0:usd usdo=new usd();
  umoney=usdo.to_me(xmoney);
   break;
   case 1:etb etbo=new etb();
 umoney=etbo.to_me(xmoney);
   break;
   case 2:rupee repo=new rupee();
   umoney=repo.to_me(xmoney);
   break;
   case 3:pound po=new pound();
   umoney=po.to_me(xmoney);
   break;
   case 4:euro ero=new euro();
   umoney=ero.to_me(xmoney);
   break;
   case 5:yuan yuno=new yuan();
   umoney=yuno.to_me(xmoney);
   break;   
}

//***********************************************************
//AT THIS MOMENT CURRENCY HAS BEEN EXCHANGED AND RESULT IS IN UMONEY!
//FINAL STEP IS DISPLAYING THE RESULT ON TO THE SCREEN!
//rounding the number to avoid a decimal points !
umoney=Math.round(umoney*100.00)/100.00;
screen.setText(String.valueOf(umoney)+" "+country[opt2]);
       }    
    
     }  //end else if    
   }
// end of action performed!********************************   
   
 
}   
// another protected class that implements itemlistner 
//if the checkbox is checked it will set the boolean true 
//and if not it set to true
//to access the flag variable we set public static 
//static keyword makes the var accessavle whithout object
//and same among all objects !
class item1 implements java.awt.event.ItemListener{

    @Override
    public void itemStateChanged(ItemEvent ie) {
      if(ie.getSource()==menu1.toall)
      {
         menu1.flag=(menu1.toall.isSelected()?true:false);
         //if it is selected make true 
         // else make it false!
      }
    }
    
}


