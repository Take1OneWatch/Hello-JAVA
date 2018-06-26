import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test1 extends JFrame implements ActionListener {
	 JButton jb1,jb2,jb3,jb4,jb5;//按钮
	 JLabel jl;
	 public Test1() {
		 setTitle("教师信息管理");
		 setSize(300, 250);
		 setLocationRelativeTo(null);//设置窗口居中
		 setLayout(new BorderLayout());
		 JPanel jp = new JPanel();
		 jp.setLayout(new GridLayout(4, 1));
		 jp.setBackground(Color.BLUE);
		 
		 
		 JPanel jp1 = new JPanel();
		 jp1.setBackground(Color.CYAN);
		 jl=new JLabel("    欢迎来到教师信息管理系统");
		 jp1.add(jl);
		 jp.add(jp1);
		 
		 
		 
		 JPanel jp2 = new JPanel();
		 jp2.setBackground(Color.CYAN);
		 jb1 = new JButton("查询教师信息");
		 jb1.setBackground(Color.WHITE);
		 jb1.addActionListener(this);// 添加动作响应器
		 jp2.add(jb1);
		

		 jb2 = new JButton("增加教师信息");
		 jb2.setBackground(Color.GREEN);
		 jb2.addActionListener(this);// 添加动作响应器
		 jp2.add(jb2);
		 jp.add(jp2);
		 
		 
		 JPanel jp3 = new JPanel();
		 jp3.setBackground(Color.CYAN);
		 jb3 = new JButton("删除教师信息");
		 jb3.setBackground(Color.red);
		 jb3.addActionListener(this);// 添加动作响应器
		 jp3.add(jb3);
		 
	
		 jb4 = new JButton("修改教师信息");
		 jb4.setBackground(Color.YELLOW);
		 jb4.addActionListener(this);// 添加动作响应器
		 jp3.add(jb4);
		 jp.add(jp3);
		 
		 
		 JPanel jp4 = new JPanel();
		 jp4.setBackground(Color.CYAN);
		 jb5=new JButton("退出");
		 jb5.setBackground(Color.WHITE);
		 jb5.addActionListener(this);
		 jp4.add(jb5);
		 jp.add(jp4);
		 add(jp);

	 }
	 public void actionPerformed(ActionEvent e) {
		 String cmd = e.getActionCommand();
		 if (cmd.equals("查询教师信息")) {
			   setVisible(false);// 本窗口隐藏,
               new Test2().setVisible(true);// 新窗口显示
               dispose();//本窗口销毁,释放内存资源
		 }
		 if (cmd.equals("增加教师信息")) {
			 setVisible(false);// 本窗口隐藏,
             new TestA().setVisible(true);// 新窗口显示
             dispose();//本窗口销毁,释放内存资源
		 }
    		 if (cmd.equals("删除教师信息")) {
    			 setVisible(false);// 本窗口隐藏,
                 new Test5().setVisible(true);// 新窗口显示
                 dispose();//本窗口销毁,释放内存资源
    		 }
         if (cmd.equals("修改教师信息")) {
        	 setVisible(false);// 本窗口隐藏,
             new Test8().setVisible(true);// 新窗口显示
             dispose();//本窗口销毁,释放内存资源
		 }
         
		 if (cmd.equals("退出")) {
			 setVisible(false);// 本窗口隐藏
			 dispose();//本窗口销毁,释放内存资源
		 }
		 
	 }
	 public static void main(String[] args) {
	        new Test1().setVisible(true);//创建登录窗口,并可见
	    }
}