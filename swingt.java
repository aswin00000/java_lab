import javax.swing.*;
public class swingt {
    public static void main(String [] args) throws Exception
    {
        JFrame f = new JFrame("swing demo");
        JButton a = new JButton("click here");
        JButton b = new JButton("are you 18+");
        
        b.setBounds(50, 50, 100, 100);
        a.setBounds(100, 100, 100, 100);
        f.add(a);
        f.add(b);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

    }
    
}
