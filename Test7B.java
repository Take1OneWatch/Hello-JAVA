import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Test7B extends JFrame implements ActionListener {
	 JButton jb1, jb2,jb3;//��ť
	    JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10;
	    JTextField write,write2,write3,write4,write5,write6,write7,write8;//�ı���
	   
	  
	    public Test7B(){
	    	setTitle("");//����
		    setSize(500, 500);//��С
		    setLocationRelativeTo(null);//����
		    JPanel jp = new JPanel();
		    jp.setLayout(new GridLayout(10, 1));
		    
		    
		    JPanel jp1 = new JPanel();
		    jp1.setBackground(Color.CYAN);
		    jl3=new JLabel("�������������ʦ����Ϣ��");
		    jp1.add(jl3);
		    jp.add(jp1);
		    
		    
		    JPanel jp2 = new JPanel();
		    jp2.setBackground(Color.CYAN);
		    jl1=new JLabel("���� :");
		    jp2.add(jl1);
		    write = new JTextField(12);
		    jp2.add(write);
		    jp.add(jp2);
		    
		    
		    JPanel jp6 = new JPanel();
		    jp6.setBackground(Color.CYAN);
		    jl3=new JLabel("���� :");
		    jp6.add(jl3);
		    write3 = new JTextField(12);
		    jp6.add(write3);
		    jp.add(jp6);
		    
		    
		    
		    
		    JPanel jp3 = new JPanel();
		    jp3.setBackground(Color.CYAN);
		    jl2=new JLabel("ְ�� :");
		    jp3.add(jl2);
		    write8 = new JTextField(12);
		    jp3.add(write8);
		    jp.add(jp3);
		    
		
		    
		    JPanel jp7 = new JPanel();
		    jp7.setBackground(Color.CYAN);
		    jl4=new JLabel("����ϵ:");
		    jp7.add(jl4);
		    write4 = new JTextField(12);
		    jp7.add(write4);
		    jp.add(jp7);
		    
		    
		    JPanel jp8 = new JPanel();
		    jp8.setBackground(Color.CYAN);
		    jl5=new JLabel("���ڵ���Ҫ�γ�:");
		    jp8.add(jl5);
		    write5 = new JTextField(12);
		    jp8.add(write5);
		    jp.add(jp8);
		    
		    
		    JPanel jp9 = new JPanel();
		    jp9.setBackground(Color.CYAN);
		    jl6=new JLabel("��ϵ�绰:");
		    jp9.add(jl6);
		    write6 = new JTextField(12);
		    jp9.add(write6);
		    jp.add(jp9);
		    
		    
		    
		    JPanel jp10 = new JPanel();
		    jp10.setBackground(Color.CYAN);
		    jl7=new JLabel("��ϵ��ַ:");
		    jp10.add(jl7);
		    write7 = new JTextField(12);
		    jp10.add(write7);
		    jp.add(jp10);
		    
		    
		
		    
		    
		    JPanel jp4 = new JPanel();
		    jp4.setBackground(Color.CYAN);
		    jb1=new JButton("����");
		    jb1.setBackground(Color.white);
		    jb3 = new JButton("ȡ��");
		    jb3.setBackground(Color.white);
		    jb3.addActionListener(this);// ��Ӷ�����Ӧ��
		    jb1.addActionListener(this);// ��Ӷ�����Ӧ��
		    jp4.add(jb1);
		    jp4.add(jb3);
		    jp.add(jp4);
		    
		    
		    
		    JPanel jp5 = new JPanel();
		    jp5.setBackground(Color.CYAN);
		    jl4=new JLabel("");
		    jp5.add(jl4);
		    jp.add(jp5);
		    add(jp);   
		    
		    
		    
	    }
	     
	
	
	 public void actionPerformed(ActionEvent e) {
		 String cmd = e.getActionCommand();
		 if (cmd.equals("ȡ��")) {
			 setVisible(false);// ����������,
             new Test1().setVisible(true);// �´�����ʾ
             dispose();//����������,�ͷ��ڴ���Դ
			 
		 }
		 if(e.getSource()==jb1){
			   if(write.getText().equals("")){
			    JOptionPane.showMessageDialog(null,"�����빤��~","����",JOptionPane.ERROR_MESSAGE);
			    write.grabFocus();
			   }else{
			    write1(write.getText());
			    JOptionPane.showMessageDialog(null,"д��ɹ�","��ʾ",JOptionPane.INFORMATION_MESSAGE);
			    setVisible(false);// ����������,
	            new Test13().setVisible(true);// �´�����ʾ
	            dispose();//����������,�ͷ��ڴ���Դ
			   }
			  }
		 if(e.getSource()==jb1){
			   if(write3.getText().equals("")){
			    JOptionPane.showMessageDialog(null,"����������~","����",JOptionPane.ERROR_MESSAGE);
			    write3.grabFocus();
			   }else{
			    write2(write3.getText());
			  
			   }
			  }
		 
		 if(e.getSource()==jb1){
			   if(write8.getText().equals("")){
			    JOptionPane.showMessageDialog(null,"������ְ��~","����",JOptionPane.ERROR_MESSAGE);
			    write8.grabFocus();
			   }else{
			    write3(write8.getText());
			   }
			  }
		 
		 if(e.getSource()==jb1){
			   if(write4.getText().equals("")){
			    JOptionPane.showMessageDialog(null,"����������ϵ~","����",JOptionPane.ERROR_MESSAGE);
			    write4.grabFocus();
			   }else{
			    write4(write4.getText());
			  
			   }
			  }
		 if(e.getSource()==jb1){
			   if(write5.getText().equals("")){
			    JOptionPane.showMessageDialog(null,"��������ڵ���Ҫ�γ�~","����",JOptionPane.ERROR_MESSAGE);
			    write5.grabFocus();
			   }else{
			    write5(write5.getText());
			  
			   }
			  }
		 if(e.getSource()==jb1){
			   if(write6.getText().equals("")){
			    JOptionPane.showMessageDialog(null,"��������ϵ�绰~","����",JOptionPane.ERROR_MESSAGE);
			    write6.grabFocus();
			   }else{
			    write6(write6.getText());
			  
			   }
			  }
		 if(e.getSource()==jb1){
			   if(write7.getText().equals("")){
			    JOptionPane.showMessageDialog(null,"��������ϵ��ַ~","����",JOptionPane.ERROR_MESSAGE);
			    write7.grabFocus();
			   }else{
			    write7(write7.getText());
			  
			   }
			  }
	
	 }
	 
	 
	 public void write1(String line){
		  try{
		   File f=new File("e:\\ʵ��\\test103.txt");//��ָ���ı�����д��
		   FileWriter fw=new FileWriter(f,true);
		   fw.write(line);
		   fw.write("\r\n");
		   fw.close();
		  }catch(Exception e){
		 
		  }
		 }
	 
	 public void write2(String line){
		  try{
		   File f=new File("e:\\ʵ��\\test103.txt");//��ָ���ı�����д��
		   FileWriter fw=new FileWriter(f,true);
		   fw.write(line);
		   fw.write("\r\n");
		   fw.close();
		  }catch(Exception e){
		 
		  }
		 }
	 public void write3(String line){
		  try{
		   File f=new File("e:\\ʵ��\\test103.txt");//��ָ���ı�����д��
		   FileWriter fw=new FileWriter(f,true);
		   fw.write(line);
		   fw.write("\r\n");
		   fw.close();
		  }catch(Exception e){
			  
		  }
		  
		 }
	 public void write4(String line){
		  try{
		   File f=new File("e:\\ʵ��\\test103.txt");//��ָ���ı�����д��
		   FileWriter fw=new FileWriter(f,true);
		   fw.write(line);
		   fw.write("\r\n");
		   fw.close();
		  }catch(Exception e){
		 
		  }
		 }
	 public void write5(String line){
		  try{
		   File f=new File("e:\\ʵ��\\test103.txt");//��ָ���ı�����д��
		   FileWriter fw=new FileWriter(f,true);
		   fw.write(line);
		   fw.write("\r\n");
		   fw.close();
		  }catch(Exception e){
		 
		  }
		 }
	 public void write6(String line){
		  try{
		   File f=new File("e:\\ʵ��\\test103.txt");//��ָ���ı�����д��
		   FileWriter fw=new FileWriter(f,true);
		   fw.write(line);
		   fw.write("\r\n");
		   fw.close();
		  }catch(Exception e){
		 
		  }
		 }
	 public void write7(String line){
		  try{
		   File f=new File("e:\\ʵ��\\test103.txt");//��ָ���ı�����д��
		   FileWriter fw=new FileWriter(f,true);
		   fw.write(line);
		   fw.write("\r\n");
		   fw.close();
		  }catch(Exception e){
		 
		  }
		 }
	 
	 
	 
	 
	
	 private void write(String text) {
		
	}



	public static void main(String[] args) {
	        new Test7().setVisible(true);//������¼����,���ɼ�
	    }
	
}