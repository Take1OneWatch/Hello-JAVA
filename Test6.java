import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test6 extends JFrame implements ActionListener{
	
    public Test6(String name) {
    	setTitle("ɾ������");//����
        setSize(300, 250);//��С
        setLocationRelativeTo(null);//����
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(3, 1));
        
       JPanel jp1 = new JPanel();
       jp1.setBackground(Color.CYAN);
        JLabel jl1 = new JLabel("Warn:һ��ɾ���޷��ظ������������");
        jl1.setBackground(Color.yellow);
        jp1.add(jl1);
        jp.add(jp1);
      
        
        JPanel jp2 = new JPanel();
        jp2.setBackground(Color.CYAN);
        JButton it = new JButton("������ɾ��");
        it.setBackground(Color.GREEN);
        jp2.add(it);
        jp.add(jp2);
        it.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 setVisible(false);// ����������,
                 new Test11().setVisible(true);// �´�����ʾ
                 dispose();//����������,�ͷ��ڴ���Դ
            }
        });
   
       
        JButton it1 = new JButton("������ɾ��");
        it1.setBackground(Color.GREEN);
        jp2.add(it1);
        it1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 setVisible(false);// ����������,
                 new Test12().setVisible(true);// �´�����ʾ
                 dispose();//����������,�ͷ��ڴ���Դ
            }
        });
        
        
        
        
        JPanel jp3 = new JPanel();
        jp3.setBackground(Color.CYAN);
        JButton it2 = new JButton("�������˵�");
        it2.setBackground(Color.WHITE);
        jp3.add(it2);
        jp.add(jp3);
       
        it2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 setVisible(false);// ����������,
                 new Test1().setVisible(true);// �´�����ʾ
                 dispose();//����������,�ͷ��ڴ���Դ
            }
        });
        add(jp);
    }
    
    public void actionPerformed(ActionEvent arg0) {
		
		
	}
    
    
    public static void main(String[] args) {
        new Test1().setVisible(true);//������¼����,���ɼ�
    }
   
	
}
