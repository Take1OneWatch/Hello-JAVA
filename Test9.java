import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
public class Test9 extends JFrame implements ActionListener{
	JTextField write,write1;//�ı���
	JLabel jl1,jl2,jl3;
	JButton jb,jb1;
	public Test9(){
		 setTitle("�޸Ĵ���");//����
	      setSize(300,250);//��С
	      setLocationRelativeTo(null);//����
	      JPanel jp = new JPanel();
	      jp.setBackground(Color.CYAN);
	      jp.setLayout(new GridLayout(3,1));
	      
	      
	      
	      
	      JPanel jp1 = new JPanel();
	      jp1.setBackground(Color.CYAN);
	      jl2 = new JLabel("��������������Ҫ�޸ĵĽ�ʦ�Ĺ���! ");
	      jp1.add(jl2);
	      jp.add(jp1);
	      
	      
	      JPanel jp2 = new JPanel();
	      jp2.setBackground(Color.CYAN);
	      jl1= new JLabel("����:");
	      write = new JTextField(12);
	      jp2.add(jl1);
	      jp2.add(write);
	   
	      jb=new JButton("�޸�");
	      jb.setBackground(Color.white);
	      jb.addActionListener(this);
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
             new Test8().setVisible(true);// �´�����ʾ
             dispose();//����������,�ͷ��ڴ���Դ
		}
		if (cmd.equals("�޸�")) {
		String id = write.getText();
		 if (id.equals("101") ){
			 File file = new File("e:\\ʵ��\\test101.txt");  
			 if(file.exists() && file.length() == 0) {  
				 setVisible(false);// ����������
	             new TestAAAA().setVisible(true);// �´�����ʾ
	             dispose();//����������,�ͷ��ڴ���Դ
			 }else {
				 File f = new File("e:\\ʵ��\\test101.txt");
				 FileWriter fw = null;
				try {
					fw = new FileWriter(f);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				 try {
					fw.write("");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				 try {
					fw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				 setVisible(false);// ����������,
	             new Test7().setVisible(true);// �´�����ʾ
	             dispose();//����������,�ͷ��ڴ���Դ
			 }

		 }else {
			 if (id.equals("102") ) {
				 File file = new File("e:\\ʵ��\\test102.txt");  
				 if(file.exists() && file.length() == 0) {  
					 setVisible(false);// ����������
		             new TestAAAA().setVisible(true);// �´�����ʾ
		             dispose();//����������,�ͷ��ڴ���Դ
				 }else {
					 File f = new File("e:\\ʵ��\\test102.txt");
					 FileWriter fw = null;
					try {
						fw = new FileWriter(f);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					 try {
						fw.write("");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					 try {
						fw.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					 setVisible(false);// ����������,
		             new Test7A().setVisible(true);// �´�����ʾ
		             dispose();//����������,�ͷ��ڴ���Դ
				 }
	
			 }else {
				 if (id.equals("103") ) {
					 File file = new File("e:\\ʵ��\\test103.txt");  
					 if(file.exists() && file.length() == 0) {  
						 setVisible(false);// ����������
			             new TestAAAA().setVisible(true);// �´�����ʾ
			             dispose();//����������,�ͷ��ڴ���Դ
					 }else {
						 File f = new File("e:\\ʵ��\\test103.txt");
						 FileWriter fw = null;
						try {
							fw = new FileWriter(f);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						 try {
							fw.write("");
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						 try {
							fw.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						 setVisible(false);// ����������,
			             new Test7B().setVisible(true);// �´�����ʾ
			             dispose();//����������,�ͷ��ڴ���Դ
					 }
			
				 }else {
					 if (id.equals("104") ) {
						 File file = new File("e:\\ʵ��\\test104.txt");  
						 if(file.exists() && file.length() == 0) {  
							 setVisible(false);// ����������
				             new TestAAAA().setVisible(true);// �´�����ʾ
				             dispose();//����������,�ͷ��ڴ���Դ
						 }else{
							 File f = new File("e:\\ʵ��\\test104.txt");
							 FileWriter fw = null;
							try {
								fw = new FileWriter(f);
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							 try {
								fw.write("");
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							 try {
								fw.close();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							 setVisible(false);// ����������,
				             new Test7C().setVisible(true);// �´�����ʾ
				             dispose();//����������,�ͷ��ڴ���Դ
						 }
		
					 }else {
						 if (id.equals("105") ) {
							 File file = new File("e:\\ʵ��\\test104.txt");  
							 if(file.exists() && file.length() == 0) {  
								 setVisible(false);// ����������
					             new TestAAAA().setVisible(true);// �´�����ʾ
					             dispose();//����������,�ͷ��ڴ���Դ
							 }else {
								 File f = new File("e:\\ʵ��\\test105.txt");
								 FileWriter fw = null;
								try {
									fw = new FileWriter(f);
								} catch (IOException e1) {
									e1.printStackTrace();
								}
								 try {
									fw.write("");
								} catch (IOException e1) {
									e1.printStackTrace();
								}
								 try {
									fw.close();
								} catch (IOException e1) {
									e1.printStackTrace();
								}
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
	
}
