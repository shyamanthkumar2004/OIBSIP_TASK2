import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Gui2 extends JFrame
{
	int a=0,count=1,n=0,j=3,c=0;
	JFrame f=new JFrame();
	JFrame f1 =new JFrame();
	JLabel l=new JLabel("NUMBER GUESSING GAME");
	JButton gb=new JButton("GENERATE RANDOM NUMBER");
	JButton cb=new JButton("enter number");
	JButton score=new JButton("score");
	JButton check=new JButton("check");
	JButton enter=new JButton("Enter");
	Icon icon=new ImageIcon("C:\\Users\\USER\\Pictures\\download.png");
	JButton image=new JButton(icon);
	JTextArea ta = new JTextArea();
	JTextArea ta1 = new JTextArea();
	JTextField tf = new JTextField();
	JTextField tf1=new JTextField();
	JLabel l3=new JLabel("You have only 3 chances");
	JLabel l4=new JLabel("First click on generate random number Button");
	JLabel l1=new JLabel();
	JLabel l2=new JLabel();
	JLabel l9=new JLabel("INSTUCTIONS:");
	JLabel l10=new JLabel("*** YOU should guess computer generated number");
	JLabel l5=new JLabel("--> You have only 3 chances");
	JLabel l6=new JLabel("--> 1st Guess-100 points");
	JLabel l7=new JLabel("--> 2nd Guess-50 points");
	JLabel l8=new JLabel("--> 3rd Guess-10 points");
	public Gui2()
	{
		f.add(l);
		f1.add(l9);
		f1.add(l10);
		f1.add(l5);
		f1.add(l6);
		f1.add(l7);
		f1.add(l8);
		f.add(image);
		image.setBounds(700,10,300,300);
		image.setBackground(Color.BLACK);
		l9.setBounds(170,30,400,30);
		l10.setBounds(20,60,400,30);
		l5.setBounds(20,90,400,30);
		l6.setBounds(20,120,400,30);
		l7.setBounds(20,150,400,30);
		l8.setBounds(20,180,400,30);
		l.setBounds(100,100,500,100);
		f.add(cb);
		cb.setBounds(100,300,200,50);
		f.add(gb);
		gb.setBounds(100,400,300,50);
		f.add(score);
		score.setBounds(500,600,200,50);
		score.setVisible(false);
		f1.add(enter);
		enter.setBounds(200,200,100,50);
		f.add(l3);
		l3.setBounds(300,50,300,50);
		f.add(check);
		check.setBounds(600,500,100,50);
		f.add(l4);
		l4.setBounds(100,200,600,100);
		f.add(ta);
		ta.setBounds(100,600,500,30);
		f.add(ta1);
		ta1.setBounds(100,400,300,70);
		cb.setBackground(Color.YELLOW);
		score.setBackground(Color.YELLOW);
		score.setBackground(Color.YELLOW);
		check.setBackground(Color.CYAN);
		cb.setBackground(Color.CYAN);
		ta1.setVisible(false);
		ta.setVisible(false);
		check.setVisible(false);
		f.setBackground(Color.YELLOW);
		ta.setBackground(Color.CYAN);
		Font font=new Font("Courier",Font.BOLD,30);
		Font font1=new Font("Courier",Font.BOLD,16);
		Font font2=new Font("Courier",Font.BOLD,20);
		ta.setFont(font);
		cb.setFont(font1);
		gb.setFont(font1);
		score.setFont(font1);
		l9.setFont(font);
		l.setFont(font);
		l3.setFont(font2);
		l4.setFont(font2);
		ta1.setFont(font1);
		ta1.setBackground(Color.YELLOW);
	gb.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
		Random r=new Random();
		a=r.nextInt(100);
		System.out.println(a);
		l4.setVisible(false);
		gb.setVisible(false);
		ta1.setVisible(true);
		ta1.setText("the computer generated number\nbetween 0-100\nselect any number");
	}});
	cb.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
		String s=JOptionPane.showInputDialog("enter number to check");
		n=Integer.parseInt(s);
		check.setVisible(true);
		ta1.setText("play and enjoy the game...");
	}});
	check.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
		for(int i=0;i<2;i++){
		if(a==n){
			JOptionPane.showMessageDialog(f,"you won the game");
			cb.setVisible(false);
			count--;
			break;
		}
		else if(n<a){
			JOptionPane.showMessageDialog(f,"your number is less than computer generated number");
			count++;
		}
		else if(n>a){
			JOptionPane.showMessageDialog(f,"your number is greater than computer generated number");
			count++;
		}
		String s=JOptionPane.showInputDialog("enter number to check");
		n=Integer.parseInt(s);
		j--;
		}
		if(a==n){
		}
		else if(n<a){
			JOptionPane.showMessageDialog(f,"your number is less than computer generated number");
			count++;
		}
		else{
			JOptionPane.showMessageDialog(f,"your number is greater than computer generated number");
			count++;
		}
		cb.setVisible(false);
		check.setVisible(false);
		score.setVisible(true);
	}});
	score.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
		score.setVisible(false);
		ta.setVisible(true);
		if(count==0){
			ta.setText("you are excellent and won 100 points");
		}
		else if(count==1){
			ta.setText("you are good and won 50 points");
		}
		else if(count==3){
			ta.setText("you are good and won 10 points");
		}
		else{
			ta.setText("BETTER LUCK NEXT TIME");
			ta1.setText("Your answer is : "+a);
			ta1.setFont(font2);
		}
	}});
	enter.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
			f1.setVisible(false);
			f.setVisible(true);
		}
	});
	f.add(l1);
	f1.add(l2);
	f1.setSize(500,500);
	f1.getContentPane().setBackground(Color.CYAN);
	l1.setBounds(0,0,0,0);
	l2.setBounds(0,0,0,0);
	f.setSize(1000,1000);
	f1.setVisible(true);
	}
	public static void main(String args[]){
		Gui2 g=new Gui2();
	}
}