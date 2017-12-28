import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test6 extends JFrame implements ActionListener{
	
    public Test6(String name) {
    	setTitle("删除窗口");//标题
        setSize(300, 250);//大小
        setLocationRelativeTo(null);//居中
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(3, 1));
        
       JPanel jp1 = new JPanel();
       jp1.setBackground(Color.CYAN);
        JLabel jl1 = new JLabel("Warn:一旦删除无法回复，请谨慎操作");
        jl1.setBackground(Color.yellow);
        jp1.add(jl1);
        jp.add(jp1);
      
        
        JPanel jp2 = new JPanel();
        jp2.setBackground(Color.CYAN);
        JButton it = new JButton("按工号删除");
        it.setBackground(Color.GREEN);
        jp2.add(it);
        jp.add(jp2);
        it.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 setVisible(false);// 本窗口隐藏,
                 new Test11().setVisible(true);// 新窗口显示
                 dispose();//本窗口销毁,释放内存资源
            }
        });
   
       
        JButton it1 = new JButton("按姓名删除");
        it1.setBackground(Color.GREEN);
        jp2.add(it1);
        it1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 setVisible(false);// 本窗口隐藏,
                 new Test12().setVisible(true);// 新窗口显示
                 dispose();//本窗口销毁,释放内存资源
            }
        });
        
        
        
        
        JPanel jp3 = new JPanel();
        jp3.setBackground(Color.CYAN);
        JButton it2 = new JButton("返回主菜单");
        it2.setBackground(Color.WHITE);
        jp3.add(it2);
        jp.add(jp3);
       
        it2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 setVisible(false);// 本窗口隐藏,
                 new Test1().setVisible(true);// 新窗口显示
                 dispose();//本窗口销毁,释放内存资源
            }
        });
        add(jp);
    }
    
    public void actionPerformed(ActionEvent arg0) {
		
		
	}
    
    
    public static void main(String[] args) {
        new Test1().setVisible(true);//创建登录窗口,并可见
    }
   
	
}
