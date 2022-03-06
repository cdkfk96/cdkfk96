package Javaproject_0306;


import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Dayselect extends JFrame implements ItemListener{

	DbConnect db=new DbConnect();
	
	Container cp;
	
	DefaultTableModel model;
	JTable table;
	JButton btnAdd,btnDel,btnUpdate;
	JRadioButton [] rb=new JRadioButton[7];
	JCheckBox [] cb=new JCheckBox[5];

	public Dayselect(String title)
	{
		super(title);
		cp=this.getContentPane();
		this.setBounds(800, 100, 700, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255, 200, 100));

		setDesign();
		this.setVisible(true);
	}

//////////////////////////////////////////////////////////////////
	//라디오버튼,체크박스,버튼 3개
	
	public void setDesign()
	{
		this.setLayout(null);
		
		//테이블
		String [] title= {}; //테이블 열에 들어갈 값
		model=new DefaultTableModel(title,0); 
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(10, 150, 670, 350);
		this.add(js);
		
		//라디오버튼 추가
		ButtonGroup bg=new ButtonGroup();
		
		//요일
		String [] rb_title= {"월","화","수","목","금","토","일"};
		
		int xpos=10;
		for(int i=0;i<rb.length;i++)
		{
			
			rb[i]=new JRadioButton(rb_title[i],i==0?true:false);
			rb[i].setBounds(xpos, 50, 90, 30);
			rb[i].setOpaque(false);
			
			//이벤트 추가
			rb[i].addItemListener(this);
			bg.add(rb[i]);
			this.add(rb[i]);
			xpos+=75;
			
		}
	}

	public void scheduleTableWrite(int select)
	{
		String sql="";
		if(select==1)
			sql="";
	}
	
///////////////////////////////////////////////////////////////////////
	//라디오버튼 이벤트
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Object ob=e.getItem();
		for(int i=0;i<rb.length;i++)
		{
			if(ob==rb[i])
			{
				this.scheduleTableWrite(i+1);
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		

		new Dayselect("날짜 선택");
		
	}

}
