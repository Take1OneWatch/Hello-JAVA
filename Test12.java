import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Test12 extends JFrame implements ActionListener{
	JTextField write,write1;//文本框
	JLabel jl1,jl2,jl3;
	JButton jb,jb1;
	public Test12(){
		  setTitle("删除窗口");//标题
	      setSize(300, 150);//大小
	      setLocationRelativeTo(null);//居中
	      JPanel jp = new JPanel();
	      jp.setBackground(Color.CYAN);
	      jp.setLayout(new FlowLayout());
	      
	      jl2 = new JLabel("   请在下面输入想要删除的教师的姓名 ！         ");
	      jp.add(jl2);
	      jl1= new JLabel("姓名:");
	      write = new JTextField(12);
	      jp.add(jl1);
	      jp.add(write);
	   
	      jb=new JButton("删除");
	      jb.addActionListener(this);
	      jb.setBackground(Color.WHITE);
	      jp.add(jb);
	      jb1=new JButton("返回");
	      jb1.setBackground(Color.WHITE);
	      jb1.addActionListener(this);// 添加动作响应器
	      jp.add(jb1);
	      add(jp);
	    //  add(jp1);
	      
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("返回")) {
			 setVisible(false);// 本窗口隐藏,
             new Test6(cmd).setVisible(true);// 新窗口显示
             dispose();//本窗口销毁,释放内存资源
		}
		if (cmd.equals("删除")) {
			 setVisible(false);// 本窗口隐藏,
             new TestAAAAA().setVisible(true);// 新窗口显示
             dispose();//本窗口销毁,释放内存资源
		}
	}
}
