import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator2 implements ActionListener{
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons =new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton,equButton, delButton, clrButton;
    
    JPanel panel;

    Font myFont = new Font("Ink Free",Font.BOLD,30);

    double num1 = 0, num2 =0, result =0;
    char Operation;

    calculator2()
    {
        frame = new JFrame("CALCULATOR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textfield = new JTextField();
        

        frame.setVisible(true);
    }



    public void main (String[] args)
    {
       calculator2 calc = new calculator2(); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
