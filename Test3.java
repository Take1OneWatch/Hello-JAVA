import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;
import java.io.*;

public class Test3 extends JFrame implements ActionListener {
	JTextField write,write1;//�ı���
	JLabel jl1,jl2,jl3;
	JButton jb,jb1;
	public Test3(){
		 setTitle("��ѯ����");//����
	      setSize(300, 250);//��С
	      setLocationRelativeTo(null);//����
	      JPanel jp = new JPanel();
	      jp.setLayout(new GridLayout(3,1));
	      
	      
	      
	      JPanel jp1 = new JPanel();
	      jp1.setBackground(Color.CYAN);
	      jl2 = new JLabel("��������������Ҫ��ѯ�Ľ�ʦ�Ĺ��� ! ");
	      jp1.add(jl2);
	      jp.add(jp1);
	      
	      
	      
	      
	      
	      JPanel jp2 = new JPanel();
	      jp2.setBackground(Color.CYAN);
	      jl1= new JLabel("����:");
	      write = new JTextField(12);
	      jp2.add(jl1);
	      jp2.add(write);

	      jb=new JButton("��ѯ");
	      jb.setBackground(Color.white);
	      jb.addActionListener(this);// ��Ӷ�����Ӧ��
	      jp2.add(jb);
	      
	      jp.add(jp2);
	      
	      
	      
	      
	      JPanel jp3 = new JPanel();
	      jp3.setBackground(Color.CYAN);
	      jb1=new JButton("����");
	      jb1.setBackground(Color.white);
	      jb1.addActionListener(this);// ��Ӷ�����Ӧ��
	      jp3.add(jb1);
	      jp.add(jp3);
	      
	      
	      
	      add(jp);
	   
	      
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("����")) {
			 setVisible(false);// ����������,
             new Test2().setVisible(true);// �´�����ʾ
             dispose();//����������,�ͷ��ڴ���Դ
		}
		if (cmd.equals("��ѯ")) {
			  String id = write.getText();// ȡ�ù���
			    if (id.equals("101")) {
			    	 File file = new File("e:\\ʵ��\\test101.txt");  
					 if(file.exists() && file.length() == 0) {  
						 setVisible(false);// ����������
			             new TestAAAA().setVisible(true);// �´�����ʾ
			             dispose();//����������,�ͷ��ڴ���Դ
					 }else {
						   setVisible(false);// ����������,
		             new test101().setVisible(true);// �´�����ʾ
		             dispose();//����������,�ͷ��ڴ���Դ
					 }
		
			  }else {
				   if (id.equals("102")) {
					   File file = new File("e:\\ʵ��\\test102.txt");  
						 if(file.exists() && file.length() == 0) {  
							 setVisible(false);// ����������
				             new TestAAAA().setVisible(true);// �´�����ʾ
				             dispose();//����������,�ͷ��ڴ���Դ
						 }else {
							  setVisible(false);// ����������,
				             new test102().setVisible(true);// �´�����ʾ
				             dispose();//����������,�ͷ��ڴ���Դ
						 }
					  }
				   else {
					   if (id.equals("103")) {
						   File file = new File("e:\\ʵ��\\test103.txt");  
							 if(file.exists() && file.length() == 0) {  
								 setVisible(false);// ����������
					             new TestAAAA().setVisible(true);// �´�����ʾ
					             dispose();//����������,�ͷ��ڴ���Դ
							 }else {
								  setVisible(false);// ����������,
					             new test103().setVisible(true);// �´�����ʾ
					             dispose();//����������,�ͷ��ڴ���Դ
							 }
						  }
					   else {
						   if (id.equals("104")) {
							   File file = new File("e:\\ʵ��\\test104.txt");  
								 if(file.exists() && file.length() == 0) {  
									 setVisible(false);// ����������
						             new TestAAAA().setVisible(true);// �´�����ʾ
						             dispose();//����������,�ͷ��ڴ���Դ
								 }else {
									   setVisible(false);// ����������,
						             new test104().setVisible(true);// �´�����ʾ
						             dispose();//����������,�ͷ��ڴ���Դ
								 }
							  }
						   else {
							   if (id.equals("105")) {
								   File file = new File("e:\\ʵ��\\test105.txt");  
									 if(file.exists() && file.length() == 0) {  
										 setVisible(false);// ����������
							             new TestAAAA().setVisible(true);// �´�����ʾ
							             dispose();//����������,�ͷ��ڴ���Դ
									 }else {
										 setVisible(false);// ����������,
							             new test105().setVisible(true);// �´�����ʾ
							             dispose();//����������,�ͷ��ڴ���Դ
									 }
								  }
							   else {
									  JOptionPane.showMessageDialog(this, "����:δ֪���û���.", "֪ͨ", JOptionPane.ERROR_MESSAGE);
						              
								  }
							  }
						  }
					  }
			       }  
	
		} 
	}
	
}