package Javaproject_0306;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DoubleClickFrame extends JFrame{

	Container cp;
	
	JLabel scheday,weekday,schecont,schetime,schecate,title1;
	JButton btnExit;
	
	//´Ý±â ¾ÆÀÌÄÜ
	ImageIcon icon=new ImageIcon("C:\\Users\\cdkfk\\Desktop\\picture\\cc.png");
	
	public DoubleClickFrame(String title)
	{
		super(title);
		cp=this.getContentPane();
		this.setBounds(800, 200, 400, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(230, 230, 250));

		initDesign();
		//this.setVisible(true);
	}


	public void initDesign()
	{
		this.setLayout(null);
		
		title1=new JLabel("2022 .   2 .");
		scheday=new JLabel();
		weekday=new JLabel();
		schecont=new JLabel();
		schetime=new JLabel();
		schecate=new JLabel();
			
		btnExit=new JButton(icon);
		
		Font b=new Font("ÇÑÄÄ ¸»¶û¸»¶û Bold",Font.PLAIN,20);
		Font c=new Font("ÈÞ¸Õ¿¾Ã¼",Font.PLAIN,20);
		
		
		title1.setBounds(55, 20, 130, 40);
		title1.setFont(new Font("ÇÑÄÄ ¸»¶û¸»¶û Bold", Font.BOLD, 20));
		title1.setForeground(new Color(075, 000, 130));
		this.add(title1);
	
		scheday.setBounds(170, 20, 60, 40);
		scheday.setFont(new Font("ÇÑÄÄ ¸»¶û¸»¶û Bold", Font.BOLD, 20));
		scheday.setForeground(new Color(075, 000, 130));
		this.add(scheday);
		
		weekday.setBounds(160, 80, 60, 40);
		weekday.setFont(b);
		weekday.setForeground(new Color(025,025,112));
		this.add(weekday);
		
		schetime.setBounds(70, 81, 60, 40);
		schetime.setFont(c);
		schetime.setForeground(new Color(139, 000, 000));
		this.add(schetime);
		
		schecate.setBounds(245, 80, 60, 40);
		schecate.setFont(b);
		schecate.setForeground(new Color(106, 90, 205));
		this.add(schecate);
		
		schecont.setBounds(70, 140, 250, 40);
		schecont.setFont(b);
		schecont.setForeground(new Color(075, 000, 130));
		this.add(schecont);
		
		btnExit.setBounds(320, 150, 50, 45);
		btnExit.setOpaque(false);
		btnExit.setBorderPainted(false);
		btnExit.setBackground(null);
		this.add(btnExit);
		
		
		
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DoubleClickFrame("ÀÏÁ¤ »ó¼¼");
		
		
	}

}
