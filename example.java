//import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
class Sample{
	public static void main(String args[])throws IOException{
		Sample obj1=new Sample();
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("sggs");
		File name=new File("java.txt");
		name.createNewFile(); 
		try{
			name.createNewFile(); 
			JOptionPane.showMessageDialog(null,"Sample","File executed Successfully",JOptionPane.QUESTION_MESSAGE);
			System.out.println("Exception Not occured");
		}
		catch(IOException e){
			e.getMessage();
			System.out.println("Exception handled");
		}
	}
}
