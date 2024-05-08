import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
public class Addtion extends JFrame implements ActionListener{
	JLabel num1,num2,result;
	JTextField num1JText,num2JText,ResultJText;
	JButton addButton,buttonOk;
	public Addtion(){
		 num1 =new JLabel("Num1");
		 num2 =new JLabel("Num2");
		 result =new JLabel("Result");
		
	         num1JText=new JTextField(20);
		 num2JText  =new JTextField(20);
		 ResultJText=new JTextField(21);
		 addButton=new JButton("Addition");
		  buttonOk=new JButton("oK");
		add(num1);
		add(num1JText);
		add(num2);
		add(num2JText);
		add(result);
		add(ResultJText);
		add(addButton);
		add(buttonOk);
		
		addButton.addActionListener(this);//Action Listener is an Interface
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae){
		int number1=Integer.parseInt(num1JText.getText());
		int number2=Integer.parseInt(num2JText.getText());
		int value=number1+number2;
		result.setText(value+" ");
	}
	public static void main(String args[]){
		System.out.println("Here is The calsi");	
		Addtion myCalsi=new Addtion();
	}
}
