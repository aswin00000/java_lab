import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

class ok_cancle_button extends JFrame implements ActionListener
{ JLabel jlab;
ok_cancle_button(){ // Create a new JFrame container.
JFrame jfrm = new JFrame("An Event Example");
// Specify FlowLayout for the layout manager.
jfrm.setLayout(new FlowLayout());
// Give the frame an initial size.
jfrm.setSize(220, 90);
// Terminate the program when the user closes the 

jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Make two buttons.
JButton jbtnOk = new JButton("OK"); 
JButton jbtnCancel = new JButton("Cancel");
// Add action listener for Ok button.
jbtnOk.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
jlab.setText("OK pressed.");
}
}
);
// Add action listener for Cancel button.
jbtnCancel.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
jlab.setText("Cancel pressed.");
}
}
);

// Add the buttons to the content pane. 
jfrm.add(jbtnOk); 
jfrm.add(jbtnCancel);
// Create a text-based label.
jlab = new JLabel("Press a button.");
// Add the label to the content pane.
jfrm.add(jlab);
// Display the frame.
jfrm.setVisible(true);
}

public static void main(String args[])
{
// Create the frame on the event dispatching thread.
SwingUtilities.invokeLater(new Runnable()
{
public void run()
{
new ok_cancle_button();
}
}
);
}

@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    
}
}