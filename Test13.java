import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test13 extends JFrame implements ActionListener{
	JTextField write,write1;//�ı���
	JLabel jl1,jl2,jl3;
	JButton jb,jb1;
	Test13(){
		setTitle("");//����
	    setSize(300, 300);//��С
	    setLocationRelativeTo(null);//����
	    JPanel jp = new JPanel();
	    jp.setLayout(new GridLayout(3, 1));
	    
	    
	    JPanel jp1 = new JPanel();
	    jp1.setBackground(Color.CYAN);
	    jl1= new JLabel("��ʾ");
	    jp1.add(jl1);
	    jp.add(jp1);
	    
	    
	    JPanel jp2 = new JPanel();
	    jp2.setBackground(Color.CYAN);
	    jl2= new JLabel("�������Ƿ���Ҫ����");
	    jp2.add(jl2);
	    jp.add(jp2);
	    
	    JPanel jp3 = new JPanel();
	    jp3.setBackground(Color.CYAN);
	    jb = new JButton("����");
	    jb.setBackground(Color.WHITE);
	    jb.addActionListener(this);
	    jb1 = new JButton("ȡ��");
	    jb1.setBackground(Color.WHITE);
	    jb1.addActionListener(this);
	    jp3.add(jb);
	    jp3.add(jb1);
	    jp.add(jp3);
	    
	    add(jp);
	    
	}

	
    public void actionPerformed(ActionEvent e) {
    	String cmd = e.getActionCommand();
    	if (cmd.equals("ȡ��")) {
    		 setVisible(false);// ����������,
             new Test1().setVisible(true);// �´�����ʾ
             dispose();//����������,�ͷ��ڴ���Դ
    	}
    	if (cmd.equals("����")) {
    		setVisible(false);// ����������,
            new TestA().setVisible(true);// �´�����ʾ
            dispose();//����������,�ͷ��ڴ���Դ
    	}
    	 
	}
	
	
	public static void main(String[] args) {
		

	}

}
