import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;


public class Test11 extends JFrame implements ActionListener{
	JTextField write,write1;//�ı���
	JLabel jl1,jl2,jl3;
	JButton jb,jb1;
	public Test11(){
		  setTitle("ɾ������");//����
	      setSize(300, 150);//��С
	      setLocationRelativeTo(null);//����
	      JPanel jp = new JPanel();
	      jp.setBackground(Color.CYAN);
	      jp.setLayout(new FlowLayout());
	      
	      jl2 = new JLabel("   ��������������Ҫɾ���Ľ�ʦ�Ĺ��� ��         ");
	      jp.add(jl2);
	      jl1= new JLabel("����:");
	      write = new JTextField(12);
	      jp.add(jl1);
	      jp.add(write);
	   
	      jb=new JButton("ɾ��");
	      jb.setBackground(Color.WHITE);
	      jb.addActionListener(this);
	      jp.add(jb);
	      jb1=new JButton("����");
	      jb1.setBackground(Color.WHITE);
	      jb1.addActionListener(this);// ��Ӷ�����Ӧ��
	      jp.add(jb1);
	      add(jp);
	    
	      
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("����")) {
			 setVisible(false);// ����������,
             new Test6(cmd).setVisible(true);// �´�����ʾ
             dispose();//����������,�ͷ��ڴ���Դ
		}
		if (cmd.equals("ɾ��")) {
			 String id = write.getText();// ȡ���û���
			 if (id.equals("101")) {
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
	             new stu().setVisible(true);// �´�����ʾ
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
		             new stu().setVisible(true);// �´�����ʾ
		             dispose();//����������,�ͷ��ڴ���Դ
					 }
			
				 }else {
					 if (id.equals("103")) {
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
			             new stu().setVisible(true);// �´�����ʾ
			             dispose();//����������,�ͷ��ڴ���Դ
						 }
		
					 }else {
						 if (id.equals("104")) {
							 File file = new File("e:\\ʵ��\\test104.txt");  
							 if(file.exists() && file.length() == 0) {  
								 setVisible(false);// ����������
					             new TestAAAA().setVisible(true);// �´�����ʾ
					             dispose();//����������,�ͷ��ڴ���Դ
							 }else {
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
				             new stu().setVisible(true);// �´�����ʾ
				             dispose();//����������,�ͷ��ڴ���Դ
							 }
			
						 }else{
							 if (id.equals("105")) {
								 File file = new File("e:\\ʵ��\\test105.txt");  
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
