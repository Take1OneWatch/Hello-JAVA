import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test2 extends JFrame implements ActionListener{
	JButton jb,jb1,jb2;
	JTextField write,write1;//文本框
	public Test2(){
		  setTitle("查询窗口");//标题
	      setSize(300, 250);//大小
	      setLocationRelativeTo(null);//居中
	      JPanel jp = new JPanel();
	      jp.setLayout(new GridLayout(2,1));
	   
	      
	      
	      JPanel jp1 = new JPanel();
	      jp1.setBackground(Color.CYAN);
	      jb=new JButton("按工号查询");
	      jb.setBackground(Color.GREEN);
	      jb.addActionListener(this);
	      jp1.add(jb);
	      jp.add(jp1);   
          jb1=new JButton("按姓名查询");
          jb1.setBackground(Color.GREEN);
          jb1.addActionListener(this);
	      jp1.add(jb1);
		  jp.add(jp1);
		  
		  
		  JPanel jp2 = new JPanel();
		  jp2.setBackground(Color.CYAN);
		  jb2=new JButton(" 返回主菜单");
		  jb2.setBackground(Color.white);
	      jb2.addActionListener(this);// 添加动作响应器
	      jp2.add(jb2);
	      
	      jp.add(jp2);
	      add(jp);
	      
	      
	      
	      

	}
	 public void actionPerformed(ActionEvent e) {
		 String cmd = e.getActionCommand();
		 if (cmd.equals("按工号查询")) {
			 setVisible(false);// 本窗口隐藏,
             new Test3().setVisible(true);// 新窗口显示
             dispose();//本窗口销毁,释放内存资源
		 }
		 if (cmd.equals("按姓名查询")) {
			 setVisible(false);// 本窗口隐藏,
             new Test4().setVisible(true);// 新窗口显示
             dispose();//本窗口销毁,释放内存资源
		 }
		 if (cmd.equals(" 返回主菜单")) {
			 setVisible(false);// 本窗口隐藏,
             new Test1().setVisible(true);// 新窗口显示
             dispose();//本窗口销毁,释放内存资源
		 }
		
	 }
	 public static void main(String[] args) {
	        new Test1().setVisible(true);//创建登录窗口,并可见
	    }
	 
}