import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test13 extends JFrame implements ActionListener{
	JTextField write,write1;//文本框
	JLabel jl1,jl2,jl3;
	JButton jb,jb1;
	Test13(){
		setTitle("");//标题
	    setSize(300, 300);//大小
	    setLocationRelativeTo(null);//居中
	    JPanel jp = new JPanel();
	    jp.setLayout(new GridLayout(3, 1));
	    
	    
	    JPanel jp1 = new JPanel();
	    jp1.setBackground(Color.CYAN);
	    jl1= new JLabel("提示");
	    jp1.add(jl1);
	    jp.add(jp1);
	    
	    
	    JPanel jp2 = new JPanel();
	    jp2.setBackground(Color.CYAN);
	    jl2= new JLabel("请问您是否需要继续");
	    jp2.add(jl2);
	    jp.add(jp2);
	    
	    JPanel jp3 = new JPanel();
	    jp3.setBackground(Color.CYAN);
	    jb = new JButton("继续");
	    jb.setBackground(Color.WHITE);
	    jb.addActionListener(this);
	    jb1 = new JButton("取消");
	    jb1.setBackground(Color.WHITE);
	    jb1.addActionListener(this);
	    jp3.add(jb);
	    jp3.add(jb1);
	    jp.add(jp3);
	    
	    add(jp);
	    
	}

	
    public void actionPerformed(ActionEvent e) {
    	String cmd = e.getActionCommand();
    	if (cmd.equals("取消")) {
    		 setVisible(false);// 本窗口隐藏,
             new Test1().setVisible(true);// 新窗口显示
             dispose();//本窗口销毁,释放内存资源
    	}
    	if (cmd.equals("继续")) {
    		setVisible(false);// 本窗口隐藏,
            new TestA().setVisible(true);// 新窗口显示
            dispose();//本窗口销毁,释放内存资源
    	}
    	 
	}
	
	
	public static void main(String[] args) {
		

	}

}
