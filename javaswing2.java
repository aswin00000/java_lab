import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class javaswing2 extends JFrame implements ActionListener
{
 JButton b1 = new JButton("b1");
 JLabel jb = new JLabel("hi");
 JTextField jt = new JTextField(20);
 


  javaswing2()
  {
   add(jt);
   add(b1);
   add(jb);
   

   b1.addActionListener(this);
   
   setSize(500,500);
   setLayout(new FlowLayout());
    
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setVisible(true);

   }
public void actionPerformed(ActionEvent e)
{
 if(e.getSource() == b1)
 { 
  jt.setText("hello");
 }
}
  

public static void main(String args[])
{
  javaswing2 ob = new javaswing2();
}}