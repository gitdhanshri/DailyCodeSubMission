import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
class calsi extends JFrame{
	JLabel num1,num2,result;
	JTextField num1JTextField,num2JTextField,ResultJTextField;
	JButton addButton;
	JButton subButton;
	public calsi(){
		JLabel num1 =new JLabel("Num1");
		JLabel num2 =new JLabel("Num2");
		JLabel result =new JLabel("Result");
		
	        num1JTextField=new JTextField(20);
		num2JTextField=new JTextField(20);
		ResultJTextField=new JTextField(21);
		addButton=new JButton("Addition");
		setLayout(new FlowLayout(FlowLayout.LEFT,40,50));
		add(num1);add(num1JTextField);
		add(num2);add(num2JTextField);
		add(result);add(ResultJTextField);
		add(addButton);
		
	}
	void Addition(){
		JLabel num1 =new JLabel("Num1");
		JLabel num2 =new JLabel("Num2");
		JLabel result =new JLabel("Result");
		
	        num1JTextField=new JTextField(20);
		num2JTextField=new JTextField(20);
		ResultJTextField=new JTextField(21);
		addButton=new JButton("Addition");
		setLayout(new FlowLayout(FlowLayout.LEFT,40,50));
		add(num1);add(num1JTextField);
		add(num2);add(num2JTextField);
		add(result);add(ResultJTextField);
		add(addButton);
	}
	void Subtration(){
		JLabel num1 =new JLabel("Num1");
		JLabel num2 =new JLabel("Num2");
		JLabel result =new JLabel("Result");
		
	        num1JTextField=new JTextField(20);
		num2JTextField=new JTextField(20);
		ResultJTextField=new JTextField(21);
		subButton=new JButton("Subtration");
		setLayout(new FlowLayout(FlowLayout.LEFT,40,50));
		add(num1);add(num1JTextField);
		add(num2);add(num2JTextField);
		add(result);add(ResultJTextField);
		add(subButton);
	}
	public static void main(String args[]){
		calsi myCalsi=new calsi();
		System.out.println("Here is The calsi");	
		myCalsi.setVisible(true);
		myCalsi.setSize(300,300);
		myCalsi.setVisible(true);
		//myCalsi.Addition();
		System.out.println("\n");
		//myCalsi.Subtration();
		
	
	}
}
