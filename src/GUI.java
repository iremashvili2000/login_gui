import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener{
	
	private static JLabel user;
	private static JTextField userText;
	private static JLabel password;
	private static JPasswordField passwordtext;
	private static JButton button;
	private static JButton button1;
	private static JLabel success;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		frame.setSize(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		panel.setLayout(null);
		
		user=new JLabel("USER");
		user.setBounds(10,20,80,25);
		panel.add(user);
		
		userText=new JTextField(20);
		userText.setBounds(100, 20, 165,25);
		panel.add(userText);
		
		password=new JLabel("PASSWORD");
		password.setBounds(10, 50, 80, 25);
		
		panel.add(password);
		
		passwordtext=new JPasswordField();
		passwordtext.setBounds(100,50,165,25);
		panel.add(passwordtext);
		
		button=new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		button1=new JButton("sign up");
		button1.setBounds(120, 80, 80, 25);
	//	button1.addActionListener(new registration());
		panel.add(button1);
		
		success=new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);
		
		
		
		frame.setVisible(true);
		
		
		
		
		
	
		
		

	}
	//actionPerformed
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			
		
			
		try {
		String user1=userText.getText();
		
		
		String password1=passwordtext.getText();
		System.out.println(user1+", "+password1);
		
		if(user.equals("GOGA")  && password1.equals("bla123")) {
			success.setText("LOGIN successful");
		}else {
			success.setText("TRY AGAIN");
		}
		
		}catch(Exception e1) {
			System.out.println("ERROR");
			e1.printStackTrace();
		}
		
		}
		
		
		
		
		
	}
	



/*
class registration extends JFrame implements ActionListener{
	
	public static JLabel vax;
	

	@Override
	public void actionPerformed(ActionEvent e) {
		vax=new JLabel();
		vax.setBounds(10, 110, 300, 25);
		Container panel = null;
		panel.add(vax);
		// TODO Auto-generated method stub
		vax.setText("gogaaa");
		
	}
	
	
}
*/
