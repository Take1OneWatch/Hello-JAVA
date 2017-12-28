  import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Test5 extends JFrame implements ActionListener{
	    JButton jb1, jb2,jb3;//按钮
	    JLabel jl1,jl2,jl3,jl4;
	    JTextField write;//文本框
	    JPasswordField mi;//密码框
	    public Test5(){
	    	setTitle("登录窗");//标题
		    setSize(300, 300);//大小
		    setLocationRelativeTo(null);//居中
		    JPanel jp = new JPanel();
		    jp.setLayout(new GridLayout(5, 1));
		    
		    
		    JPanel jp1 = new JPanel();
		    jp1.setBackground(Color.CYAN);
		    jl1=new JLabel("Warn:需获得管理员权限才能删除数据！！！");
		    jp1.add(jl1);
		    jp.add(jp1);
		    
		    
		    JPanel jp2 = new JPanel();
		    jp2.setBackground(Color.CYAN);
		    jl2=new JLabel("账号:");
		    jp2.add(jl2);
		    write = new JTextField(12);
		    jp2.add(write);
		    jp.add(jp2);
		    
		    
		    
		    JPanel jp3 = new JPanel();
		    jp3.setBackground(Color.CYAN);
		    jl3=new JLabel("密码:");
		    jp3.add(jl3);
		    mi = new JPasswordField(12);
		    jp3.add(mi);
		    jp.add(jp3);
		    
		    
		    
		    JPanel jp4 = new JPanel();
		    jp4.setBackground(Color.CYAN);
		    jb1=new JButton("取消");
		    jb1.setBackground(Color.white);
		    jb2 = new JButton("登录");
		    jb2.setBackground(Color.white);
		    jb2.addActionListener(this);// 添加动作响应器
		    jb1.addActionListener(this);// 添加动作响应器
		    jp4.add(jb2);
		    jp4.add(jb1);
		    jp.add(jp4);

		    

		    
		   JPanel jp5 = new JPanel();
		  jp5.setBackground(Color.CYAN);
		 /*   jl4=new JLabel("提示:账号 linsir 密码 123456");
		    jp5.add(jl4);*/
		    jp.add(jp5);
		    
		    
		    add(jp);
		    
		    
		    
	    }
	    public void actionPerformed(ActionEvent e) {
	    	String cmd = e.getActionCommand();
	    	if (cmd.equals("登录")) {
	    		  String id = write.getText();// 取得用户名
	              String key = new String(mi.getPassword());// 取得密码
	              if (id.equals("linsir") && key.equals("123456")) {// 判断是否登录成功
	                  // 如果登录成功
	                  setVisible(false);// 本窗口隐藏,
	                  new Test6(id).setVisible(true);// 新窗口显示
	                  dispose();//本窗口销毁,释放内存资源
	            } else {
	                //如果登录失败  弹出提示
	                JOptionPane.showMessageDialog(this, "用户名或者密码错误.", "通知", JOptionPane.ERROR_MESSAGE);
	              
	            }
	    	}
	    	if (cmd.equals("取消")) {
	    		 setVisible(false);// 本窗口隐藏,
                 new Test1().setVisible(true);// 新窗口显示
                 dispose();//本窗口销毁,释放内存资源
	    	}
	
	    }
	   
	    
	    public static void main(String[] args) {
	        new Test5().setVisible(true);//创建登录窗口,并可见
	    }
		
}