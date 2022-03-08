package Javaproject_0306;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//추가버튼 클릭시 생성될 프레임..이름,자바,ban,jsp,spring,추가버튼 들어감
public class AddFrameSch extends JFrame{

	Container cp; 
	JLabel titleSday,titleCategory,titleCon,titleTime,titleWeekday;
	JTextField tfSday,tfCon,tfTime1;
	JComboBox<String> cbCategory,cbweekday;
	JButton btnAdd;
	
	ImageIcon iconadd=new ImageIcon("C:\\Users\\cdkfk\\Desktop\\picture\\aaaa.png");
	
	public AddFrameSch(String title)
	{
		super(title);
		cp=this.getContentPane();
		this.setBounds(200, 100, 290, 310);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255, 240, 245));

		initDesign();
		//this.setVisible(true);
	}

	public void initDesign()
	{
		this.setLayout(null);
		
		Font a=new Font("한컴 말랑말랑 Regular",Font.BOLD,14);
		
		
		//label
		titleSday=new JLabel("날짜");
		titleSday.setFont(a);
		titleCategory=new JLabel("카테고리");
		titleCategory.setFont(a);
		titleCon=new JLabel("내용");
		titleCon.setFont(a);
		titleTime=new JLabel("시간");
		titleTime.setFont(a);
		titleWeekday=new JLabel("요일");
		titleWeekday.setFont(a);
		
		//tf
		tfSday=new JTextField(20);
		tfCon=new JTextField(20);
		tfTime1=new JTextField(20);
		
		//cb
		String [] category= {"운동","업무","병원","행사","기타"};
		cbCategory=new JComboBox<String>(category);  
		String [] weekday= {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		cbweekday=new JComboBox<String>(weekday);  
		
		//btn
		btnAdd=new JButton(iconadd);
		
		//컴포넌트들의 위치선정
		titleSday.setBounds(55, 20, 60, 30);
		this.add(titleSday);
		titleCategory.setBounds(55, 60, 60, 30);
		this.add(titleCategory);
		titleCon.setBounds(55, 100, 60, 30);
		this.add(titleCon);
		titleTime.setBounds(55, 140, 60, 30);
		this.add(titleTime);
		titleWeekday.setBounds(55, 180, 60, 30);
		this.add(titleWeekday);
		
		tfSday.setBounds(115, 25, 70, 20);
		this.add(tfSday);
		cbCategory.setBounds(115, 65, 70, 20);
		this.add(cbCategory);
		tfCon.setBounds(115, 105, 70, 20);
		this.add(tfCon);
		tfTime1.setBounds(115, 145, 70, 20);
		this.add(tfTime1);
		cbweekday.setBounds(115, 185, 70, 20);
		this.add(cbweekday);
		
		
		btnAdd.setBounds(112, 220, 30, 30);
		btnAdd.setOpaque(false);
		btnAdd.setBorderPainted(false);
		btnAdd.setBackground(null);
		this.add(btnAdd);
		
		
		
	}
	
	
	//public static void main(String[] args) {
		

		//new AddFrameSch("일정추가 프레임");
	

	//}
}
