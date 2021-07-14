import javax.swing.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public 

	
class nidhi extends JFrame implements ActionListener
{
	JLabel l1;
	JPanel p1;
	JButton b;
	JTextField i;
	
	String l="";
	 static JLabel t;
	 static JTextArea k;
	static Socket g;
	static PrintWriter pw;
	static BufferedReader bf;
	static InputStreamReader is; 
	 
	 
	
	
  nidhi(){
		setTitle("WAHATSAPP");
		
		 p1=new JPanel();
		 l1=new JLabel("Nidhi ");
		 b =new JButton ("send");
		 i=new JTextField("",10);
		 
		 k=new JTextArea();
	
		 
		     ImageIcon j=new ImageIcon(ClassLoader.getSystemResource("arrow.jpg"));
			Image i2=j.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
			ImageIcon j1=new ImageIcon(i2);
			JLabel back=new JLabel(j1);
			ImageIcon y=new ImageIcon(ClassLoader.getSystemResource("phone.png"));
			Image o=y.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
			ImageIcon phone=new ImageIcon(o);
			JLabel l2=new JLabel(phone);
			l2.setBounds(210,5,35,20);
			ImageIcon z=new ImageIcon(ClassLoader.getSystemResource("3icon.png"));
			Image w=z.getImage().getScaledInstance(10,25,Image.SCALE_DEFAULT);
			ImageIcon qw=new ImageIcon(w);
			JLabel more=new JLabel(qw);
			more.setBounds(250,5,35,20);	
			ImageIcon z1=new ImageIcon(ClassLoader.getSystemResource("video.png"));
			Image w1=z1.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
			ImageIcon qw1=new ImageIcon(w1);
			JLabel video=new JLabel(qw1);
			video.setBounds(170,5,35,20);	
			
		
		add(p1);
		add(l1);
		add(b);
		add(i);
		add(k);
		p1.add(l2);
		p1.add(more);
		p1.add(video);
		
		
		
		b.addActionListener(this);
		p1.add(l1);
		p1.add(back);
		setSize(300,450);
		setLocation(300,80);
		  k.setBounds(4, 43, 280, 335);
		  k.setBackground(Color.white);
		  k.setFont(new Font("Monaco",Font.BOLD,12));
		 k.setEditable(false);
		  k.setLineWrap(true); 
		  k.setWrapStyleWord(true);
		p1.setLayout(null);
		l1.setBounds(45, 5, 45, 20);
		p1.setVisible(true);
		p1.setBackground(new Color(7,94,84));
		p1.setBounds(3, 5, 280, 35);
		setLayout(null);
		l1.setFont(new Font("Monaco",Font.BOLD,16));
		back.setBounds(3, 5,35,20);
		l1.setForeground(Color.WHITE);
		i.setBounds(3,380,236,30);
		i.setVisible(true);
		
		b.setFont(new Font("Monaco",Font.BOLD,8));
		b.setBackground(new Color(7,94,84));
		b.setVisible(true);
		b.setForeground(Color.WHITE);
		b.setBounds(230, 380,55,28);
		
		back.addMouseListener( new MouseAdapter() 
				{
				public void MouseClicked(MouseEvent a)
		{
          System.exit(0);
		}
		});
		
		
		
		
		back.setVisible(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent j)
	{ 
		 
		  String send=i.getText();
		pw.println(send);
		
		k.setText(k.getText()+"\n\t  \t"+send);
		i.setText(null);
		
		
		
	}
	
	
	public static void main(String args[])throws Exception
	{ 
       nidhi h=new nidhi();
          String rec="";

	try  
	{
		g= new Socket("localhost",2212);
		System.out.println("client");
		pw=new PrintWriter(g.getOutputStream(),true);
		  
		is=new InputStreamReader(g.getInputStream());
	    bf =new BufferedReader(is);
	      while(true)
	      {
	   
	    rec=bf.readLine();
	    k.setText( k.getText()+"\n\t\t\t"+rec); 
	      }
	    	
	  
	  
		
		
		
		
		
	}
	catch(Exception e)
	{
		
		
	}

	

}
	

}
