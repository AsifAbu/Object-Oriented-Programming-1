import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.*;
import java.*;

public class UserRegistration extends JFrame implements ActionListener
{
	private JPanel createregp = new JPanel();
	
	private JLabel loginid = new JLabel("LOGIN ID ");
	private JTextField logintext = new JTextField();
	private static int counts = 0;
	
	private JLabel firstname = new JLabel("FIRST NAME ");
	private JTextField fntext = new JTextField();

	private JLabel lastname = new JLabel("LAST NAME ");
	private JTextField lntext = new JTextField();

	private JLabel pass1 = new JLabel("PASSWORD ");
	private JTextField pass1text = new JTextField();

	private JLabel pass2 = new JLabel("RE-PASSWORD");
	private JTextField pass2text = new JTextField();

	private JLabel gender = new JLabel("GENDER ");
	private JTextField gendertext = new JTextField();
	
	private JLabel mailid = new JLabel("MAIL-ID ");
	private JTextField mailtext = new JTextField();
	
	private JButton save = new JButton("SAVE");
	private JButton save2 = new JButton("SAVE");
	private JButton clear = new JButton("CLEAR");
	private JButton back = new JButton("BACK");
	private JButton back2 = new JButton("BACK");
	private JLabel d = new JLabel();
	
	Connection con;
	Statement stm ;
	boolean rs;
	private static int cs;
	
	
	public UserRegistration(int ct)
	{
		this.cs=ct;
		this.setBounds(20,30,720,480);
		this.setTitle("STUDENT REGISTRATION");
        this.setLayout(null);
		createregp();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        try
    	{
    		con = DriverManager.getConnection("jdbc:mysql://localhost/javaproject","root","");
    		stm = con.createStatement();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    		JOptionPane.showMessageDialog(null, "ERROR");
    	}
        this.setBackground(Color.GRAY);
        this.setVisible(true);
	}
	public UserRegistration(double a,int ct)
	{
		this.cs=cs;
		this.setBounds(20,30,720,480);
		this.setTitle("STUDENT REGISTRATION");
        this.setLayout(null);
		createregpb();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        try
    	{
    		con = DriverManager.getConnection("jdbc:mysql://localhost/javaproject","root","");
    		stm = con.createStatement();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    		JOptionPane.showMessageDialog(null, "ERROR");
    	}
        this.setBackground(Color.GRAY);
        this.setVisible(true);
	}
	private void createregp()
	{
		createregp.setLayout(null);
		createregp.setBounds(0,0,720,600);
		loginid.setBounds(20,30,80,20);	
		logintext.setBounds(120,30,120,20);
		createregp.add(loginid);
		logintext.setText("SID-"+cs);
		//logintext.setFocusable(false);
		createregp.add(logintext);
		firstname.setBounds(20,60,80,20);
		createregp.add(firstname);
		fntext.setBounds(120,60,120,20);
		createregp.add(fntext);
		lastname.setBounds(20,90,80,20);
		createregp.add(lastname);
		lntext.setBounds(120,90,120,20);
		createregp.add(lntext);
		pass1.setBounds(20,120,80,20);
		createregp.add(pass1);
		pass1text.setBounds(120,120,120,20);
		createregp.add(pass1text);
		pass2.setBounds(20,150,110,20);
		createregp.add(pass2);
		pass2text.setBounds(120,150,120,20);
		createregp.add(pass2text);
		gender.setBounds(20,180,80,20);
		createregp.add(gender);
		gendertext.setBounds(120,180,120,20);
		createregp.add(gendertext);
		mailid.setBounds(20,210,80,20);
		createregp.add(mailid);
		mailtext.setBounds(120,210,120,20);
		createregp.add(mailtext);
		clear.setBounds(50,250,80,30);
		createregp.add(clear);
		this.clear.addActionListener(this);
		save.setBounds(150,250,90,30);
		createregp.add(save);
		this.save.addActionListener(this);
		back.setBounds(50,290,190,30);
		createregp.add(back);
		this.back.addActionListener(this);
		createregp.setBackground(Color.GRAY);
		d.setBounds(280,-70,420,400);
		d.setIcon(new ImageIcon("C:\\Users\\Asif\\eclipse-workspace\\JavaProject\\src\\Screenshot (180).jpg"));
		createregp.add(d);
		
		this.add(createregp);
	}
	private void createregpb()
	{
		createregp.setLayout(null);
		createregp.setBounds(0,0,720,600);
		loginid.setBounds(20,30,80,20);	
		logintext.setBounds(120,30,120,20);
		createregp.add(loginid);
		//counts++;
		logintext.setText("SID-"+cs);
		//logintext.setFocusable(false);
		createregp.add(logintext);
		firstname.setBounds(20,60,80,20);
		createregp.add(firstname);
		fntext.setBounds(120,60,120,20);
		createregp.add(fntext);
		lastname.setBounds(20,90,80,20);
		createregp.add(lastname);
		lntext.setBounds(120,90,120,20);
		createregp.add(lntext);
		pass1.setBounds(20,120,80,20);
		createregp.add(pass1);
		pass1text.setBounds(120,120,120,20);
		createregp.add(pass1text);
		pass2.setBounds(20,150,110,20);
		createregp.add(pass2);
		pass2text.setBounds(120,150,120,20);
		createregp.add(pass2text);
		gender.setBounds(20,180,80,20);
		createregp.add(gender);
		gendertext.setBounds(120,180,120,20);
		createregp.add(gendertext);
		mailid.setBounds(20,210,80,20);
		createregp.add(mailid);
		mailtext.setBounds(120,210,120,20);
		createregp.add(mailtext);
		clear.setBounds(50,250,80,30);
		createregp.add(clear);
		this.clear.addActionListener(this);
		save2.setBounds(150,250,90,30);
		createregp.add(save2);
		this.save2.addActionListener(this);
		back2.setBounds(50,290,190,30);
		createregp.add(back2);
		this.back2.addActionListener(this);
		createregp.setBackground(Color.GRAY);
		d.setBounds(280,-70,420,400);
		d.setIcon(new ImageIcon("C:\\Users\\Asif\\eclipse-workspace\\JavaProject\\src\\Screenshot (180).jpg"));
		createregp.add(d);
		this.add(createregp);
	}
	private void cleartext()
	{
		fntext.setText(null);
		lntext.setText(null);
		pass1text.setText(null);
		pass2text.setText(null);
		gendertext.setText(null);
		mailtext.setText(null);
	}
	public void actionPerformed(ActionEvent e)
    {
		Object src = e.getSource();
		String p1 = pass1text.getText();
		String p2 = pass2text.getText();
		boolean k=mailtext.getText().matches("[a-zA-Z0-9]{1,}[@]{1,}[a-zA-Z]{1,}[.]{1,}[a-zA-Z]{3}");
		if(src == clear)
		{
			cleartext();
		}
		else if(src == save)
		{
			if(fntext != null)
			{
				if(lntext != null)
				{
					if(p1.equals(p2))
					{
						if(gendertext.getText().equalsIgnoreCase("male")||gendertext.getText().equalsIgnoreCase("female"))
						{
							if(k == true)
							{
								try
								{
									String b = "insert into studentreg values ('"+logintext.getText()+
											"','"+fntext.getText()+"','"+lntext.getText()+"','"+pass1text.getText()+
											"','"+pass2text.getText()+"','"+gendertext.getText()+"','"+mailtext.getText()+"')";

									rs = stm.execute(b);
									System.out.println(rs);
									this.setVisible(false);
									new SelectFirst().userp();
									JOptionPane.showMessageDialog(null,"Succesful Registration");
								}
								catch(Exception e4)
								{
									e4.printStackTrace();
									JOptionPane.showMessageDialog(null,"ERROR in sql");

								}
								finally {
						    		 try
						    	        {
						    	        stm.close();
						    	       // rs.close();
						    	        con.close();
						    	        }
						    	        catch(Exception e4)
						    	        {
						    	        	e4.printStackTrace();
						    	        	JOptionPane.showMessageDialog(null, "ERROR CLOSE finaly");
						    	        }
						    		}
							}
							else
								JOptionPane.showMessageDialog(null,"Give MailID Correctly");
						}
						else
							JOptionPane.showMessageDialog(null,"Give Gender Correctly");
					}
					else
						JOptionPane.showMessageDialog(null,"Your Two Password Not Same");
				}
				else
					JOptionPane.showMessageDialog(null,"Give Last Name Correctly");
			}
			else
				JOptionPane.showMessageDialog(null,"Give First Name Correctly");
		}
		else if(src == back)
		{
        	this.setVisible(false);
			new SelectFirst().userp();
		}
		else if(src == back2)
		{
        	this.setVisible(false);
			new Admin1st();
		}
		else if(src == save2)
		{
			if(fntext != null)
			{
				if(lntext != null)
				{
					if(p1.equals(p2))
					{
						if(gendertext.getText().equalsIgnoreCase("male")||gendertext.getText().equalsIgnoreCase("female"))
						{
							if(mailtext != null)
							{
								try
								{
									String b = "insert into studentreg values ('"+logintext.getText()+
											"','"+fntext.getText()+"','"+lntext.getText()+"','"+pass1text.getText()+
											"','"+pass2text.getText()+"','"+gendertext.getText()+"','"+mailtext.getText()+"')";
				
									rs = stm.execute(b);
									System.out.println(rs);
									this.setVisible(false);
									new Admin1st();
									JOptionPane.showMessageDialog(null,"Succesful Registration");
								}
								catch(Exception e4)
								{
									e4.printStackTrace();
									JOptionPane.showMessageDialog(null,"ERROR in sql");

								}
								finally {
						    		 try
						    	        {
						    	        stm.close();
						    	       // rs.close();
						    	        con.close();
						    	        }
						    	        catch(Exception e4)
						    	        {
						    	        	e4.printStackTrace();
						    	        	JOptionPane.showMessageDialog(null, "ERROR CLOSE finaly");
						    	        }
								}
							}
							else
								JOptionPane.showMessageDialog(null,"Give MailID Correctly");
						}
						else
							JOptionPane.showMessageDialog(null,"Give Gender Correctly");
					}
					else
						JOptionPane.showMessageDialog(null,"Your Two Password Not Same");
				}
				else
					JOptionPane.showMessageDialog(null,"Give Last Name Correctly");
			}
			else
				JOptionPane.showMessageDialog(null,"Give First Name Correctly");
		}
    }
	public static void main(String[] args)
	{
		UserRegistration obj = new UserRegistration(cs);
	}

}
