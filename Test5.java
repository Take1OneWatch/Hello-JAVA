  import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Test5 extends JFrame implements ActionListener{
	    JButton jb1, jb2,jb3;//��ť
	    JLabel jl1,jl2,jl3,jl4;
	    JTextField write;//�ı���
	    JPasswordField mi;//�����
	    public Test5(){
	    	setTitle("��¼��");//����
		    setSize(300, 300);//��С
		    setLocationRelativeTo(null);//����
		    JPanel jp = new JPanel();
		    jp.setLayout(new GridLayout(5, 1));
		    
		    
		    JPanel jp1 = new JPanel();
		    jp1.setBackground(Color.CYAN);
		    jl1=new JLabel("Warn:���ù���ԱȨ�޲���ɾ�����ݣ�����");
		    jp1.add(jl1);
		    jp.add(jp1);
		    
		    
		    JPanel jp2 = new JPanel();
		    jp2.setBackground(Color.CYAN);
		    jl2=new JLabel("�˺�:");
		    jp2.add(jl2);
		    write = new JTextField(12);
		    jp2.add(write);
		    jp.add(jp2);
		    
		    
		    
		    JPanel jp3 = new JPanel();
		    jp3.setBackground(Color.CYAN);
		    jl3=new JLabel("����:");
		    jp3.add(jl3);
		    mi = new JPasswordField(12);
		    jp3.add(mi);
		    jp.add(jp3);
		    
		    
		    
		    JPanel jp4 = new JPanel();
		    jp4.setBackground(Color.CYAN);
		    jb1=new JButton("ȡ��");
		    jb1.setBackground(Color.white);
		    jb2 = new JButton("��¼");
		    jb2.setBackground(Color.white);
		    jb2.addActionListener(this);// ��Ӷ�����Ӧ��
		    jb1.addActionListener(this);// ��Ӷ�����Ӧ��
		    jp4.add(jb2);
		    jp4.add(jb1);
		    jp.add(jp4);

		    

		    
		   JPanel jp5 = new JPanel();
		  jp5.setBackground(Color.CYAN);
		 /*   jl4=new JLabel("��ʾ:�˺� linsir ���� 123456");
		    jp5.add(jl4);*/
		    jp.add(jp5);
		    
		    
		    add(jp);
		    
		    
		    
	    }
	    public void actionPerformed(ActionEvent e) {
	    	String cmd = e.getActionCommand();
	    	if (cmd.equals("��¼")) {
	    		  String id = write.getText();// ȡ���û���
	              String key = new String(mi.getPassword());// ȡ������
	              if (id.equals("linsir") && key.equals("123456")) {// �ж��Ƿ��¼�ɹ�
	                  // �����¼�ɹ�
	                  setVisible(false);// ����������,
	                  new Test6(id).setVisible(true);// �´�����ʾ
	                  dispose();//����������,�ͷ��ڴ���Դ
	            } else {
	                //�����¼ʧ��  ������ʾ
	                JOptionPane.showMessageDialog(this, "�û��������������.", "֪ͨ", JOptionPane.ERROR_MESSAGE);
	              
	            }
	    	}
	    	if (cmd.equals("ȡ��")) {
	    		 setVisible(false);// ����������,
                 new Test1().setVisible(true);// �´�����ʾ
                 dispose();//����������,�ͷ��ڴ���Դ
	    	}
	
	    }
	   
	    
	    public static void main(String[] args) {
	        new Test5().setVisible(true);//������¼����,���ɼ�
	    }
		
}