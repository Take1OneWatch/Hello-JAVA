import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test8 extends JFrame implements ActionListener{
  
  
	JButton jb,jb1,jb2;
	JTextField write,write1;//�ı���
	public Test8(){
		  setTitle("�޸Ĵ���");//����
	      setSize(300, 250);//��С
	      setLocationRelativeTo(null);//����
	      JPanel jp = new JPanel();
	      jp.setLayout(new GridLayout(2, 1));
	     
	      
	      JPanel jp1 = new JPanel();
	      jp1.setBackground(Color.CYAN);
	      jb=new JButton("�������޸�");
	      jb.setBackground(Color.green);
	      jp1.add(jb);
	      jb.addActionListener(this);
          jb1=new JButton("�������޸�");
          jb1.setBackground(Color.green);
          jb1.addActionListener(this);
	      jp1.add(jb1);
		  jp.add(jp1);
		  
		  JPanel jp2 = new JPanel();
		  jp2.setBackground(Color.CYAN);
		  jb2=new JButton(" �������˵�");
		  jb2.setBackground(Color.WHITE);
	      jb2.addActionListener(this);// ��Ӷ�����Ӧ��
	      jp2.add(jb2);
	      jp.add(jp2);
	    
	      add(jp);
	      jb2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	 setVisible(false);// ����������,
	                 new Test1().setVisible(true);// �´�����ʾ
	                 dispose();//����������,�ͷ��ڴ���Դ
	            }
	        });
	}
	

	
	public void actionPerformed(ActionEvent e) {
		 String cmd = e.getActionCommand();
		 if (cmd.equals("�������޸�")) {
			 setVisible(false);// ����������,
             new Test9().setVisible(true);// �´�����ʾ
             dispose();//����������,�ͷ��ڴ���Դ
		 }
		 if (cmd.equals("�������޸�")) {
			 setVisible(false);// ����������,
             new Test10().setVisible(true);// �´�����ʾ
             dispose();//����������,�ͷ��ڴ���Դ
		 }
	 }
	 public static void main(String[] args) {
	        new Test8().setVisible(true);//������¼����,���ɼ�
	    }
	
}
