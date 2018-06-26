import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test8 extends JFrame implements ActionListener{
  
  
	JButton jb,jb1,jb2;
	JTextField write,write1;//文本框
	public Test8(){
		  setTitle("修改窗口");//标题
	      setSize(300, 250);//大小
	      setLocationRelativeTo(null);//居中
	      JPanel jp = new JPanel();
	      jp.setLayout(new GridLayout(2, 1));
	     
	      
	      JPanel jp1 = new JPanel();
	      jp1.setBackground(Color.CYAN);
	      jb=new JButton("按工号修改");
	      jb.setBackground(Color.green);
	      jp1.add(jb);
	      jb.addActionListener(this);
          jb1=new JButton("按姓名修改");
          jb1.setBackground(Color.green);
          jb1.addActionListener(this);
	      jp1.add(jb1);
		  jp.add(jp1);
		  
		  JPanel jp2 = new JPanel();
		  jp2.setBackground(Color.CYAN);
		  jb2=new JButton(" 返回主菜单");
		  jb2.setBackground(Color.WHITE);
	      jb2.addActionListener(this);// 添加动作响应器
	      jp2.add(jb2);
	      jp.add(jp2);
	    
	      add(jp);
	      jb2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	 setVisible(false);// 本窗口隐藏,
	                 new Test1().setVisible(true);// 新窗口显示
	                 dispose();//本窗口销毁,释放内存资源
	            }
	        });
	}
	

	
	public void actionPerformed(ActionEvent e) {
		 String cmd = e.getActionCommand();
		 if (cmd.equals("按工号修改")) {
			 setVisible(false);// 本窗口隐藏,
             new Test9().setVisible(true);// 新窗口显示
             dispose();//本窗口销毁,释放内存资源
		 }
		 if (cmd.equals("按姓名修改")) {
			 setVisible(false);// 本窗口隐藏,
             new Test10().setVisible(true);// 新窗口显示
             dispose();//本窗口销毁,释放内存资源
		 }
	 }
	 public static void main(String[] args) {
	        new Test8().setVisible(true);//创建登录窗口,并可见
	    }
	
}
