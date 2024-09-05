
import java.util.Scanner;
import javax.swing.*;
class SwingDemo{
	SwingDemo(){
		JFrame jfrm=new JFrame("Pangram");
		jfrm.setSize(400,150);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel jlab=new JLabel("Enter a sentence: ");
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
}
public class swing{
	public static void main(String [] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingDemo();
			}
		});
		Scanner sc=new Scanner(System.in);
		int m=0;
		boolean pangram=true;
		int [] arr=new int[100];
		char [] missing=new char[100];
		System.out.println("Enter the sentence: ");
		String s=sc.nextLine();
		for (int i=0;i<s.length();i++) {
			arr[i]=(int)(s.charAt(i));
		}
		int i;
		for (i=97;i<=122;i++) {
			int j;
			for (j=0;j<s.length();j++)
				if(i==arr[j] || i==arr[j]+32)
					break;
			if(i==arr[j] || i==arr[j]+32)
				continue;
			pangram=false;
			missing[m]=(char)i;
			m++;
		}
		if(pangram==true)
			System.out.println("It is a Pangram!!");
		else {
			System.out.println("It is not a pangram...\nThe missing alphabets are :  ");
			for(int p=0;p<m;p++) {
				System.out.print(missing[p]+"  ");
			}
		}
	}
}