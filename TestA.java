import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class TestA extends JFrame implements ActionListener{
	
	JButton jb,jb1,jb2;
	JTextField write,write1;//文本框
	JLabel jl,jl1;
	public TestA(){
		  setTitle("添加窗口");//标题
	      setSize(300, 250);//大小
	      setLocationRelativeTo(null);//居中
	      JPanel jp = new JPanel();
	      jp.setLayout(new GridLayout(3,1));
	      
	      
	      JPanel jp1 = new JPanel();
	      jp1.setBackground(Color.CYAN);
	      jl = new JLabel("请先输入工号再添加其他数据！");
	      jp1.add(jl);
	      jp.add(jp1);
	      
	      
	      
	      
	      JPanel jp2 = new JPanel();
	      jp2.setBackground(Color.CYAN);
	      jl1=new JLabel("工号:");
	      jp2.add(jl1);
	      
	      write = new JTextField(12);
	      jp2.add(write);
	      jb=new JButton("增加");
	      jb.setBackground(Color.WHITE);
	      jb.addActionListener(this);
	      jp2.add(jb);
	      jp.add(jp2);
	       
	            
         
		  
		  
		  JPanel jp3 = new JPanel();
		  jp3.setBackground(Color.CYAN);
		  jb2=new JButton(" 返回主菜单");
		  jb2.setBackground(Color.white);
	      jb2.addActionListener(this);// 添加动作响应器
	      jp3.add(jb2); 
	      jp.add(jp3);
	      

	      add(jp);

	}
	 public void actionPerformed(ActionEvent e) {
		 String cmd = e.getActionCommand();
		 if (cmd.equals(" 返回主菜单")) {
			 setVisible(false);// 本窗口隐藏,
             new Test1().setVisible(true);// 新窗口显示
             dispose();//本窗口销毁,释放内存资源
		 }
		 
		 if (cmd.equals("增加")) {
			 String id = write.getText();
			 if (id.equals("101")) {
				 File file = new File("e:\\实验\\test101.txt");  
				 if(file.exists() && file.length() != 0) {  
					 setVisible(false);// 本窗口隐藏
		             new TestAA().setVisible(true);// 新窗口显示
		             dispose();//本窗口销毁,释放内存资源
				 }else {
					 setVisible(false);
		             new Test7().setVisible(true);
		             dispose();
				 } 
	
			 }else {
				 if (id.equals("102")) {
					 File file = new File("e:\\实验\\test102.txt");  
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
						 File file = new File("e:\\实验\\test103.txt");  
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
							 File file = new File("e:\\实验\\test104.txt");  
							 if(file.exists() && file.length() != 0) {  
								 setVisible(false);// 本窗口隐藏
					             new TestAA().setVisible(true);// 新窗口显示
					             dispose();//本窗口销毁,释放内存资源
							 }else {
								  setVisible(false);// 本窗口隐藏,
				             new Test7C().setVisible(true);// 新窗口显示
				             dispose();//本窗口销毁,释放内存资源 
							 }
						 }else {
							 if (id.equals("105")) {
								 File file = new File("e:\\实验\\test104.txt");  
								 if(file.exists() && file.length() != 0) {  
									 setVisible(false);// 本窗口隐藏
						             new TestAA().setVisible(true);// 新窗口显示
						             dispose();//本窗口销毁,释放内存资源
								 }else {
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
		
		
	 public static void main(String[] args) {
	        new Test1().setVisible(true);
	    }
	 
}