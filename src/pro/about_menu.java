package pro;
import java.awt.*;
import javax.swing.*;
public class about_menu {
    about_menu()
    {
        JFrame frame=new JFrame();
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setTitle("developers page");
        frame.setLayout(new BorderLayout(10,10));
        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel panel2=new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        JPanel panel3=new JPanel();
        panel3.setLayout(new GridLayout(10,10));
          //6row,2col and space hor and ver
        String msg;
        String msg1;
        String msg2;
        msg="this project is released on jun 2021 and all the software content is based on the date of the release!";
        msg1="the project may not work for the future and may require an update !";
//************************************************************************        
        JLabel label1=new JLabel();
        JLabel label2=new JLabel();
        label1.setText(msg);
        label2.setText(msg1);
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
      JLabel dev=new JLabel("DEVELOPERS");
      JLabel id=new JLabel("ID");
      JLabel n1=new JLabel("zereab biruk");
      JLabel n2=new JLabel("lidiya solomon");
      JLabel n3=new JLabel("tariku dubale");
      JLabel n4=new JLabel("heran belayhun");
      JLabel n5=new JLabel("firaol wakuma");
      JLabel id1=new JLabel("1605/12");
      JLabel id2=new JLabel("1209/12");
      JLabel id3=new JLabel("1031/12");
      JLabel id4=new JLabel("3656/12");
      JLabel id5=new JLabel("0935/12");
      JLabel ins=new JLabel("INSTRUCTOR");
      JLabel insn=new JLabel("ms.HIWOT"); 
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        panel.add(label1);
        panel2.add(label2);
        panel3.add(dev);
        panel3.add(id);
        panel3.add(n1);
        panel3.add(id1);
        panel3.add(n2);
        panel3.add(id2);
        panel3.add(n3);
        panel3.add(id3);
        panel3.add(n4);
        panel3.add(id4);
        panel3.add(n5);
        panel3.add(id5);
        panel3.add(ins);
        panel3.add(insn);
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++     
//*******************************************************************************  
        frame.add(panel,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.CENTER);
        frame.setVisible(true);
        
        
    }
    
}
