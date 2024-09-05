import java.awt.Color;
import java.awt.*;

import javax.swing.*;

public class swingTut {
    public static void main(String[] args)
    {
        /*JFrame Jb = new JFrame();
        Jb.setDefaultCloseOperation(Jb.EXIT_ON_CLOSE);// set exit 
        Jb.setSize(420,420);//se tsize of JFrame
        
        Jb.getContentPane().setBackground(Color.BLACK);//set Background color for JFrame
        ImageIcon image1 = new ImageIcon("D:/image/IMG_5147.JPG");//create image icon
        Jb.setIconImage(image1.getImage());//set image icon to JFrame
        ImageIcon image2 = new ImageIcon("D:/s3DS/java/swing/icons8-kali-linux-48.png");       
        JLabel Jb = new JLabel();//create new JLable
        Jb.setIcon(image2);//set image to Lable
        Jb.setText("YOU LOOK UGLY");//set text to lable
        Jb.setHorizontalTextPosition(SwingConstants.CENTER);//horizontal position
        Jb.setVerticalTextPosition(Jb.TOP);//vertcal position
        Jb.setForeground(Color.WHITE);//text color
        Jb.setFont(new Font("MV Boli",Font.PLAIN,25));//text font
        Jb.setIconTextGap(40);
        Jb.setVerticalAlignment(Jb.CENTER);
        Jb.setHorizontalAlignment(Jb.CENTER);
        Jb.add(Jb);
        Jb.setVisible(true);//visibility*/
        


        /* JFrame Jb = new JFrame();
        Jb.setDefaultCloseOperation(Jb.EXIT_ON_CLOSE);
        Jb.setSize(750,750);
        
        ImageIcon image2 = new ImageIcon("D:/s3DS/java/swing/icons8-kali-linux-48.png");       

        JPanel J1 = new JPanel();
        J1.setBackground(Color.CYAN);
        J1.setBounds(0, 0, 250, 250);
       
        JPanel J2 = new JPanel();
        
        J2.setIcon(image2);
        
        J1.add(J2);
        Jb.add(J1);
        Jb.setLayout(null);
        Jb.setVisible(true);*/

        //Border layout
        /*JFrame Jb = new JFrame("HELLO");
        Jb.setDefaultCloseOperation(Jb.EXIT_ON_CLOSE);
        Jb.setSize(500,500);
        Jb.setLayout(new BorderLayout(10,10));
        Jb.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
    

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.cyan);
        panel3.setBackground(Color.BLACK);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.magenta);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));
        

        //sub panels
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();
    

        panel6.setBackground(Color.orange);
        panel7.setBackground(Color.pink);
        panel8.setBackground(Color.blue);
        panel9.setBackground(Color.green);
        panel10.setBackground(Color.white);

        panel6.setPreferredSize(new Dimension(25,25));
        panel7.setPreferredSize(new Dimension(25,25));
        panel8.setPreferredSize(new Dimension(25,25));
        panel9.setPreferredSize(new Dimension(25,25));
        panel10.setPreferredSize(new Dimension(25,25));

        panel5.setLayout(new BorderLayout());

        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.WEST);
        panel5.add(panel8,BorderLayout.SOUTH);
        panel5.add(panel9,BorderLayout.EAST);
        panel5.add(panel10,BorderLayout.CENTER);

        //end of sub panel

        Jb.add(panel1,BorderLayout.NORTH);
        Jb.add(panel2,BorderLayout.WEST);
        Jb.add(panel3,BorderLayout.SOUTH);
        Jb.add(panel4,BorderLayout.EAST);
        Jb.add(panel5,BorderLayout.CENTER);
        */
        
        //flow layout

        /*JFrame Jb = new JFrame();
        Jb.setDefaultCloseOperation(Jb.EXIT_ON_CLOSE);
        Jb.setSize(750,750);
        Jb.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        Jb.add(new JButton("2"));
        Jb.add(new JButton("3"));
        Jb.add(new JButton("1"));
        Jb.add(new JButton("4"));
        Jb.add(new JButton("7"));
        Jb.add(new JButton("10"));
        Jb.add(new JButton("9"));
        Jb.add(new JButton("20"));
        Jb.add(new JButton("120"));
        Jb.add(new JButton("12"));
        Jb.add(new JButton("7"));

        Jb.setVisible(true);*/
        
        
        // for in panel

        /* 
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setSize(750,750);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        JPanel Jb = new JPanel();
        Jb.setPreferredSize(new Dimension(100,250));
        Jb.setBackground(Color.cyan);
        Jb.setLayout(new FlowLayout());



        Jb.add(new JButton("2"));
        Jb.add(new JButton("3"));
        Jb.add(new JButton("1"));
        Jb.add(new JButton("4"));
        Jb.add(new JButton("7"));
        Jb.add(new JButton("10"));
        Jb.add(new JButton("9"));
        Jb.add(new JButton("20"));
        Jb.add(new JButton("120"));
        Jb.add(new JButton("12"));
        Jb.add(new JButton("7"));
        
        f.add(Jb);
        f.setVisible(true);*/

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLayout(new GridLayout(2,1));


        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));
        f.add(new JButton("4"));
        f.add(new JButton("5"));
        f.add(new JButton("6"));
        f.add(new JButton("7"));




        f.setVisible(true);

        
        

    }
    
}
