import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
public class Test9 extends JFrame implements ActionListener{
	JTextField write,write1;//文本框
	JLabel jl1,jl2,jl3;
	JButton jb,jb1;
	public Test9(){
		 setTitle("修改窗口");//标题
	      setSize(300,250);//大小
	      setLocationRelativeTo(null);//居中
	      JPanel jp = new JPanel();
	      jp.setBackground(Color.CYAN);
	      jp.setLayout(new GridLayout(3,1));
	      
	      
	      
	      
	      JPanel jp1 = new JPanel();
	      jp1.setBackground(Color.CYAN);
	      jl2 = new JLabel("请在下面输入想要修改的教师的工号! ");
	      jp1.add(jl2);
	      jp.add(jp1);
	      
	      
	      JPanel jp2 = new JPanel();
	      jp2.setBackground(Color.CYAN);
	      jl1= new JLabel("工号:");
	      write = new JTextField(12);
	      jp2.add(jl1);
	      jp2.add(write);
	   
	      jb=new JButton("修改");
	      jb.setBackground(Color.white);
	      jb.addActionListener(this);
	      jp2.add(jb);
	      jp.add(jp2);
	      
	      
	      
	      
	      
	      JPanel jp3 = new JPanel();
	      jp3.setBackground(Color.CYAN);
	      jb1=new JButton("返回");
	      jb1.setBackground(Color.white);
	      jb1.addActionListener(this);// 添加动作响应器
	      jp3.add(jb1);
	      jp.add(jp3);
	      add(jp);
	         
	}	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("返回")) {
			 setVisible(false);// 本窗口隐藏,
             new Test8().setVisible(true);// 新窗口显示
             dispose();//本窗口销毁,释放内存资源
		}
		if (cmd.equals("修改")) {
		String id = write.getText();
		 if (id.equals("101") ){
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
	             new Test7().setVisible(true);// 新窗口显示
	             dispose();//本窗口销毁,释放内存资源
			 }

		 }else {
			 if (id.equals("102") ) {
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
		             new Test7A().setVisible(true);// 新窗口显示
		             dispose();//本窗口销毁,释放内存资源
				 }
	
			 }else {
				 if (id.equals("103") ) {
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
			             new Test7B().setVisible(true);// 新窗口显示
			             dispose();//本窗口销毁,释放内存资源
					 }
			
				 }else {
					 if (id.equals("104") ) {
						 File file = new File("e:\\实验\\test104.txt");  
						 if(file.exists() && file.length() == 0) {  
							 setVisible(false);// 本窗口隐藏
				             new TestAAAA().setVisible(true);// 新窗口显示
				             dispose();//本窗口销毁,释放内存资源
						 }else{
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
				             new Test7C().setVisible(true);// 新窗口显示
				             dispose();//本窗口销毁,释放内存资源
						 }
		
					 }else {
						 if (id.equals("105") ) {
							 File file = new File("e:\\实验\\test104.txt");  
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
								 setVisible(false);// 本窗口隐藏,
					             new Test7D().setVisible(true);// 新窗口显示
					             dispose();//本窗口销毁,释放内存资源
							 }
						 }
					 }
				 }
			 }
		 }
	} 
		 
		 
	}
	
}
