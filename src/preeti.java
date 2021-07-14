import javax.swing.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public 

	
class preeti extends JFrame implements ActionListener
{
	JLabel l1;
	JPanel p1;
	JButton b;
	JTextField i;
	
	String l="";
	static JTextArea k1;
	static ServerSocket g;
	static PrintWriter pw;
	static InputStreamReader is;
	static BufferedReader bf;
	
	
	preeti(){
		setTitle("WAHATSAPP");
		
		 p1=new JPanel();
		 l1=new JLabel("Preeti");
		 b =new JButton ("send");
		 i=new JTextField("",10);
		 
		 k1=new JTextArea();
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
		add(k1);
		p1.add(video);
		p1.add(back);
		p1.add(l2);
		p1.add(more);
		
		b.addActionListener(this);
		p1.add(l1);
		p1.add(back);
		setSize(300,450);
		setLocation(300,80);
		  k1.setBounds(4, 43, 280, 335);
		 // k.setBackground(Color.PINK);
		  k1.setFont(new Font("Monaco",Font.BOLD,12));
		  k1.setEditable(false);
		  k1.setLineWrap(true);
		  k1.setWrapStyleWord(true);
		p1.setLayout(null);
		l1.setBounds(45, 5, 45, 20);
		p1.setVisible(true);
		p1.setBackground(new Color(7,94,84));
		p1.setBounds(3, 5, 280, 35);
		setLayout(null);
		l1.setFont(new Font("Monaco",Font.BOLD,16));
		l1.setForeground(Color.WHITE);
		i.setBounds(3,380,236,30);
		i.setVisible(true);
		
		b.setFont(new Font("Monaco",Font.BOLD,8));
		b.setBackground(new Color(7,94,84));
		b.setVisible(true);
		b.setForeground(Color.white);
		b.setBounds(230, 380,55,28);
		
		back.addMouseListener( new MouseAdapter() 
				{
				public void MouseClicked(MouseEvent a)
		{
			System.exit(0);
		}
		});
		
		
		back.setBounds(3, 5,35,20);
		
		
		back.setVisible(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent j)
	{  
		 String send=i.getText();
		
		k1.setText(k1.getText()+"\n\t  \t"+send);
		pw.println(send);
		
		
		 i.setText(null);
		
	}
	
	public static void main(String args[])throws Exception
	{ 
		
		 String rec="";
		preeti h=new preeti();


	try 
	{
		 g= new ServerSocket(2212);
		System.out.println("server");
		Socket o=g.accept();
		System.out.print("connected");
		
		pw=new PrintWriter(o.getOutputStream(),true);
		
		is=new InputStreamReader(o.getInputStream());
		bf =new BufferedReader(is);
		while(true)
		{
		 rec=bf.readLine();
	    k1.setText(k1.getText()+"\n\t\t\t"+rec);
		}
		
		
		
		
		
		
		
	}
	catch(Exception e) 
	{
		
		
	}

	

}
	

}
