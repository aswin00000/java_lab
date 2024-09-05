
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class swingtictac implements ActionListener {
	Random random=new Random();
	JFrame frame=new JFrame();
	JPanel title_panel=new JPanel();
	JPanel button_panel=new JPanel();
	JLabel textfield=new JLabel();
	JButton[] buttons=new JButton[9];
	boolean player_1;
	
	swingtictac(){
		//frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		frame.setSize(400,400);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		
		//JLABEL
		textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(new Color(20,225,0));
		textfield.setFont(new Font("Ink Free",Font.BOLD,75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("Tic-Tac-Toe");
		textfield.setOpaque(true);
		
		//JPANEL
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0,0,400,100);
		
		button_panel.setLayout(new GridLayout(3,3));
		button_panel.setBackground(new Color(150,150,150));
		for(int i=0;i<9;i++) {
			buttons[i]=new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boil",Font.BOLD,75));
			buttons[i].setFocusable(false);
			//addin the actiolisteners to this (using this keyword)
			buttons[i].addActionListener(this);
		}
		
		title_panel.add(textfield);
		frame.add(title_panel,BorderLayout.NORTH);
		frame.add(button_panel);
			first();
			System.out.println("The program working perfectly!!");
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int  i=0;i<9;i++) {
			if(e.getSource()==buttons[i]) {
				if(player_1) {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(255,0,0));
						buttons[i].setText("X");
						player_1=false;
						textfield.setText("O TURN");
						check();
					}
				}else {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(0,0,255));
						buttons[i].setText("O");
						player_1=true;
						textfield.setText("X TURN");
						check();
					}
				}
			}
		}
		
	}
	public void first(){
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		if(random.nextInt(2)==0) {
			player_1=true;
			textfield.setText("X TURN");
		}else {
			player_1=false;
			textfield.setText("O TURN");
		}
	}
	public void check() {
		if(
				(buttons[0].getText()=="X")&&
				(buttons[1].getText()=="X") &&
				(buttons[2].getText()=="X") 
				)
		{
			xwin(0,1,2);
		}
		if(
				(buttons[3].getText()=="X")&&
				(buttons[4].getText()=="X") &&
				(buttons[5].getText()=="X") 
				)
		{
			xwin(3,4,5);
		}
		if(
				(buttons[6].getText()=="X")&&
				(buttons[7].getText()=="X") &&
				(buttons[8].getText()=="X") 
				)
		{
			xwin(6,7,8);
		}
		if(
				(buttons[0].getText()=="X")&&
				(buttons[3].getText()=="X") &&
				(buttons[6].getText()=="X") 
				)
		{
			xwin(0,3,6);
		}
		if(
				(buttons[1].getText()=="X")&&
				(buttons[4].getText()=="X") &&
				(buttons[7].getText()=="X") 
				)
		{
			xwin(1,4,7);
		}
		if(
				(buttons[2].getText()=="X")&&
				(buttons[5].getText()=="X") &&
				(buttons[8].getText()=="X") 
				)
		{
			xwin(2,5,8);
		}
		if(
				(buttons[0].getText()=="X")&&
				(buttons[4].getText()=="X") &&
				(buttons[8].getText()=="X") 
				)
		{
			xwin(0,4,8);
		}
		if(
				(buttons[2].getText()=="X")&&
				(buttons[4].getText()=="X") &&
				(buttons[6].getText()=="X") 
				)
		{
			xwin(2,4,6);
		}
		if(
				(buttons[0].getText()=="O")&&
				(buttons[1].getText()=="O") &&
				(buttons[2].getText()=="O") 
				)
		{
			owin(0,1,2);
		}
		if(
				(buttons[3].getText()=="O")&&
				(buttons[4].getText()=="O") &&
				(buttons[5].getText()=="O") 
				)
		{
			owin(3,4,5);
		}
		if(
				(buttons[6].getText()=="O")&&
				(buttons[7].getText()=="O") &&
				(buttons[8].getText()=="O") 
				)
		{
			owin(6,7,8);
		}
		if(
				(buttons[0].getText()=="O")&&
				(buttons[3].getText()=="O") &&
				(buttons[6].getText()=="O") 
				)
		{
			owin(0,3,6);
		}
		if(
				(buttons[1].getText()=="O")&&
				(buttons[4].getText()=="O") &&
				(buttons[7].getText()=="O") 
				)
		{
			owin(1,4,7);
		}
		if(
				(buttons[2].getText()=="O")&&
				(buttons[5].getText()=="O") &&
				(buttons[8].getText()=="O") 
				)
		{
			owin(2,5,8);
		}
		if(
				(buttons[0].getText()=="O")&&
				(buttons[4].getText()=="O") &&
				(buttons[8].getText()=="O") 
				)
		{
			owin(0,4,8);
		}
		if(
				(buttons[2].getText()=="O")&&
				(buttons[4].getText()=="O") &&
				(buttons[6].getText()=="O") 
				)
		{
			owin(2,4,6);
		}
		
			
	}
	public void xwin(int a,int b,int c) {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		
		for(int i=0;i<9;i++) 
		{
			buttons[i].setEnabled(false);
		}
		textfield.setText("X WINS!!!!!!");
	}
	public void owin(int a,int b,int c) {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		
		for(int i=0;i<9;i++) 
		{
			buttons[i].setEnabled(false);
		}
		textfield.setText("O WINS!!!!!!");
	}
	
}

