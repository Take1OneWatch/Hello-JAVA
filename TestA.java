import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class TestA extends JFrame implements ActionListener{
	
	JButton jb,jb1,jb2;
	JTextField write,write1;//�ı���
	JLabel jl,jl1;
	public TestA(){
		  setTitle("��Ӵ���");//����
	      setSize(300, 250);//��С
	      setLocationRelativeTo(null);//����
	      JPanel jp = new JPanel();
	      jp.setLayout(new GridLayout(3,1));
	      
	      
	      JPanel jp1 = new JPanel();
	      jp1.setBackground(Color.CYAN);
	      jl = new JLabel("�������빤��������������ݣ�");
	      jp1.add(jl);
	      jp.add(jp1);
	      
	      
	      
	      
	      JPanel jp2 = new JPanel();
	      jp2.setBackground(Color.CYAN);
	      jl1=new JLabel("����:");
	      jp2.add(jl1);
	      
	      write = new JTextField(12);
	      jp2.add(write);
	      jb=new JButton("����");
	      jb.setBackground(Color.WHITE);
	      jb.addActionListener(this);
	      jp2.add(jb);
	      jp.add(jp2);
	       
	            
         
		  
		  
		  JPanel jp3 = new JPanel();
		  jp3.setBackground(Color.CYAN);
		  jb2=new JButton(" �������˵�");
		  jb2.setBackground(Color.white);
	      jb2.addActionListener(this);// ��Ӷ�����Ӧ��
	      jp3.add(jb2); 
	      jp.add(jp3);
	      

	      add(jp);

	}
	 public void actionPerformed(ActionEvent e) {
		 String cmd = e.getActionCommand();
		 if (cmd.equals(" �������˵�")) {
			 setVisible(false);// ����������,
             new Test1().setVisible(true);// �´�����ʾ
             dispose();//����������,�ͷ��ڴ���Դ
		 }
		 
		 if (cmd.equals("����")) {
			 String id = write.getText();
			 if (id.equals("101")) {
				 File file = new File("e:\\ʵ��\\test101.txt");  
				 if(file.exists() && file.length() != 0) {  
					 setVisible(false);// ����������
		             new TestAA().setVisible(true);// �´�����ʾ
		             dispose();//����������,�ͷ��ڴ���Դ
				 }else {
					 setVisible(false);
		             new Test7().setVisible(true);
		             dispose();
				 } 
	
			 }else {
				 if (id.equals("102")) {
					 File file = new File("e:\\ʵ��\\test102.txt");  
					 if(file.exists() && file.length() != 0) {  
						 setVisible(false);
			             new TestAA().setVisible(true);
			             dispose();
					 }else {
						 setVisible(false);
			             new Test7A().setVisible(true);
			             dispose();
					 }
				 }else {
					 if (id.equals("103")) {
						 File file = new File("e:\\ʵ��\\test103.txt");  
						 if(file.exists() && file.length() != 0) {  
							 setVisible(false);
				             new TestAA().setVisible(true);
				             dispose();
						 }else {
							  setVisible(false);
			             new Test7B().setVisible(true);
			             dispose();
						 }				
					 }else {
						 if (id.equals("104")) {
							 File file = new File("e:\\ʵ��\\test104.txt");  
							 if(file.exists() && file.length() != 0) {  
								 setVisible(false);// ����������
					             new TestAA().setVisible(true);// �´�����ʾ
					             dispose();//����������,�ͷ��ڴ���Դ
							 }else {
								  setVisible(false);// ����������,
				             new Test7C().setVisible(true);// �´�����ʾ
				             dispose();//����������,�ͷ��ڴ���Դ 
							 }
						 }else {
							 if (id.equals("105")) {
								 File file = new File("e:\\ʵ��\\test104.txt");  
								 if(file.exists() && file.length() != 0) {  
									 setVisible(false);// ����������
						             new TestAA().setVisible(true);// �´�����ʾ
						             dispose();//����������,�ͷ��ڴ���Դ
								 }else {
									  setVisible(false);// ����������,
					             new Test7D().setVisible(true);// �´�����ʾ
					             dispose();//����������,�ͷ��ڴ���Դ 
								 }
							 }
						 }
					 }
				 }
			 }
		 }
	 }
		
		
	 public static void main(String[] args) {
	        new Test1().setVisible(true);
	    }
	 
}