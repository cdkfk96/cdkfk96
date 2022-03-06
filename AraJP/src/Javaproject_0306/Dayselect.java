package Javaproject_0306;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;


public class Dayselect extends JFrame implements ItemListener,ActionListener{

	DbConnect db=new DbConnect();
	
	Container cp;
	
	DefaultTableModel model;
	JTable table;
	JButton btnAdd,btnDel,btnUpdate;
	JRadioButton [] rb=new JRadioButton[7];
	JCheckBox [] cb=new JCheckBox[5];

	
	ImageIcon icon1=new ImageIcon("C:\\Users\\cdkfk\\Desktop\\picture\\1.png");
	ImageIcon icon2=new ImageIcon("C:\\Users\\cdkfk\\Desktop\\picture\\2.png");
	ImageIcon icon3=new ImageIcon("C:\\Users\\cdkfk\\Desktop\\picture\\3.png");
	ImageIcon icon4=new ImageIcon("C:\\Users\\cdkfk\\Desktop\\picture\\4.png");
	ImageIcon icon5=new ImageIcon("C:\\Users\\cdkfk\\Desktop\\picture\\5.png");
	ImageIcon icon6=new ImageIcon("C:\\Users\\cdkfk\\Desktop\\picture\\6.png");
	ImageIcon icon7=new ImageIcon("C:\\Users\\cdkfk\\Desktop\\picture\\7.png");
	ImageIcon iconbtn=new ImageIcon("C:\\Users\\cdkfk\\Desktop\\picture\\8.png");
	
	ImageIcon [] icon={icon1,icon2,icon3,icon4,icon5,icon6,icon7};
	
	
	public Dayselect(String title)
	{
		super(title);
		cp=this.getContentPane();
		this.setBounds(800, 200, 600, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cp.setBackground(new Color(255, 200, 100));

		setDesign();
		this.setVisible(true);
	}

//////////////////////////////////////////////////////////////////
	//������ư,üũ�ڽ�,��ư 3��
	
	public void setDesign()
	{
		this.setLayout(null);
		
		//���̺�
		String [] title= {}; //���̺� ���� �� ��
		model=new DefaultTableModel(title,0); 
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(10, 200, 570, 300);
		this.add(js);
		
		//������ư �߰�
		ButtonGroup bg=new ButtonGroup();
		
		//����
		
		int xpos=10;
		
		for(int i=0;i<rb.length;i++)
		{
			//rb[i]=new JRadioButton(rb_title[i],i==0?true:false);
			rb[i]=new JRadioButton(icon[i]);
			rb[i].setBounds(xpos, 20, 90, 60);
			rb[i].setOpaque(false);
			
			rb[i].setPressedIcon(iconbtn);
			
			//�̺�Ʈ �߰�
			rb[i].addItemListener(this);
			bg.add(rb[i]);
			this.add(rb[i]);
			xpos+=80;
			
		}
		String [] str= {"�","����","����","���","��Ÿ"};
		int a=45;
		for(int i=0;i<cb.length;i++)
		{
			cb[i]=new JCheckBox(str[i]);
			cb[i].setBounds(a, 100, 80, 30);
			cb[i].setFont(new FontUIResource("�����ٸ���", Font.BOLD, 15));
			a+=100;
			cb[i].setOpaque(false);
			this.add(cb[i]);
			
			cb[i].addItemListener(this);
		}
		
		//��ư
		btnAdd=new JButton("�߰�");
		btnAdd.setBounds(200, 10, 60, 30);
		this.add(btnAdd);
		btnAdd.addActionListener(this);
				
			
		btnDel=new JButton("����");
		btnDel.setBounds(350, 10, 60, 30);
		this.add(btnDel);
		btnDel.addActionListener(this);
	}

	public void scheduleTableWrite(int select)
	{
		String sql="";
		if(select==1)
			sql="";
	}
	
///////////////////////////////////////////////////////////////////////
	//������ư �̺�Ʈ
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
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		

		new Dayselect("");
		
	}

}
