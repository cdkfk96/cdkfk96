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
	//������ư,üũ�ڽ�,��ư 3��
	
	public void setDesign()
	{
		this.setLayout(null);
		
		//���̺�
		String [] title= {}; //���̺� ���� �� ��
		model=new DefaultTableModel(title,0); 
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(10, 150, 670, 350);
		this.add(js);
		
		//������ư �߰�
		ButtonGroup bg=new ButtonGroup();
		
		//����
		String [] rb_title= {"��","ȭ","��","��","��","��","��"};
		
		int xpos=10;
		for(int i=0;i<rb.length;i++)
		{
			
			rb[i]=new JRadioButton(rb_title[i],i==0?true:false);
			rb[i].setBounds(xpos, 50, 90, 30);
			rb[i].setOpaque(false);
			
			//�̺�Ʈ �߰�
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
	
	public static void main(String[] args) {
		

		new Dayselect("��¥ ����");
		
	}

}
