import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;


public class Test11 extends JFrame implements ActionListener{
	JTextField write,write1;//文本框
	JLabel jl1,jl2,jl3;
	JButton jb,jb1;
	public Test11(){
		  setTitle("删除窗口");//标题
	      setSize(300, 150);//大小
	      setLocationRelativeTo(null);//居中
	      JPanel jp = new JPanel();
	      jp.setBackground(Color.CYAN);
	      jp.setLayout(new FlowLayout());
	      
	      jl2 = new JLabel("   请在下面输入想要删除的教师的工号 ！         ");
	      jp.add(jl2);
	      jl1= new JLabel("工号:");
	      write = new JTextField(12);
	      jp.add(jl1);
	      jp.add(write);
	   
	      jb=new JButton("删除");
	      jb.setBackground(Color.WHITE);
	      jb.addActionListener(this);
	      jp.add(jb);
	      jb1=new JButton("返回");
	      jb1.setBackground(Color.WHITE);
	      jb1.addActionListener(this);// 添加动作响应器
	      jp.add(jb1);
	      add(jp);
	    
	      
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("返回")) {
			 setVisible(false);// 本窗口隐藏,
             new Test6(cmd).setVisible(true);// 新窗口显示
             dispose();//本窗口销毁,释放内存资源
		}
		if (cmd.equals("删除")) {
			 String id = write.getText();// 取得用户名
			 if (id.equals("101")) {
				 File file = new File("e:\\实验\\test101.txt");  
				 if(file.exists() && file.length() == 0) {  
					 setVisible(false);// 本窗口隐藏
		             new TestAAAA().setVisible(true);// 新窗口显示
		             dispose();//本窗口销毁,释放内存资源
				 }else {
					  File f = new File("e:\\实验\\test101.txt");
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
				 setVisible(false);// 本窗口隐藏,
	             new stu().setVisible(true);// 新窗口显示
	             dispose();//本窗口销毁,释放内存资源
				 }
				 
			 }else {
				 if (id.equals("102")) {
					 File file = new File("e:\\实验\\test102.txt");  
					 if(file.exists() && file.length() == 0) {  
						 setVisible(false);// 本窗口隐藏
			             new TestAAAA().setVisible(true);// 新窗口显示
			             dispose();//本窗口销毁,释放内存资源
					 }else {
						 File f = new File("e:\\实验\\test102.txt");
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
					 setVisible(false);// 本窗口隐藏,
		             new stu().setVisible(true);// 新窗口显示
		             dispose();//本窗口销毁,释放内存资源
					 }
			
				 }else {
					 if (id.equals("103")) {
						 File file = new File("e:\\实验\\test103.txt");  
						 if(file.exists() && file.length() == 0) {  
							 setVisible(false);// 本窗口隐藏
				             new TestAAAA().setVisible(true);// 新窗口显示
				             dispose();//本窗口销毁,释放内存资源
						 }else {
							 File f = new File("e:\\实验\\test103.txt");
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
						 setVisible(false);// 本窗口隐藏,
			             new stu().setVisible(true);// 新窗口显示
			             dispose();//本窗口销毁,释放内存资源
						 }
		
					 }else {
						 if (id.equals("104")) {
							 File file = new File("e:\\实验\\test104.txt");  
							 if(file.exists() && file.length() == 0) {  
								 setVisible(false);// 本窗口隐藏
					             new TestAAAA().setVisible(true);// 新窗口显示
					             dispose();//本窗口销毁,释放内存资源
							 }else {
								  File f = new File("e:\\实验\\test104.txt");
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
							 setVisible(false);// 本窗口隐藏,
				             new stu().setVisible(true);// 新窗口显示
				             dispose();//本窗口销毁,释放内存资源
							 }
			
						 }else{
							 if (id.equals("105")) {
								 File file = new File("e:\\实验\\test105.txt");  
								 if(file.exists() && file.length() == 0) {  
									 setVisible(false);// 本窗口隐藏
						             new TestAAAA().setVisible(true);// 新窗口显示
						             dispose();//本窗口销毁,释放内存资源
								 }else {
									 File f = new File("e:\\实验\\test105.txt");
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
		 JOptionPane.showMessageDialog(this, "错误:未知的用户名.", "通知", JOptionPane.ERROR_MESSAGE);
							 }
						 }
					 }
 
				 }
			 }
		}
	}
}
