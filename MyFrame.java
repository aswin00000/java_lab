import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.plaf.TreeUI;

import java.awt.event.*;

import javax.swing.JFrame;
public class MyFrame extends JFrame implements ActionListener {
    JButton button, button2;
    MyFrame()
    {   JFrame f = new JFrame("sugamano mowne");
        button = new JButton();
        button.setBounds(100,100,100,50);
        button.addActionListener(this);
        button.setText("hello");
        button2 = new JButton();
        button2.setBounds(100,200,100,50);
        button2.setText("hi");
        button2.addActionListener(this);
        f.add(button);
        f.add(button2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
        f.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==button){
            System.out.println("Poo");

        }
        if(e.getSource()==button2)
        {
         System.out.println("eat the poo");
        }
        
        
    }
    
    public static  void main( String[] args) {
        new MyFrame();
        
    }

    
}
