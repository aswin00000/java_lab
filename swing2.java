import javax.swing.*;
import java.awt.*;

public class swing2 {
    public static void main(String[] args)
    {
        JFrame f = new JFrame("demo");
        JPanel panel = new JPanel();
        f.add(panel);

        JLabel jb1 = new JLabel("user");
        jb1.setBounds(10,20,80,25);
        JTextField userText = new JTextField(20);
        userText.setBounds(100,200,165,50);


        panel.setLayout(new FlowLayout());
        panel.add(userText);
        panel.add(jb1);
        panel.setVisible(true);
        
         
        
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        

    }
    
    
}
