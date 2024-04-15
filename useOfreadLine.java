
import java.io.*;
class Demo{
	void Method1(){
		int i=0,j=1,k=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter the Number");
			j=Integer.parseInt(br.readLine());
			k=i/j;
			//System.out.println("Line in Excetion Occured Before");
			System.out.println("No Exception!!!!!");
		}
		catch(IOException I){
			System.out.println("Io Exception");
			System.out.println("Io Exception Occured is  "+I);
		}
		catch(ArithmeticException A){
			System.out.println("ArithmeticException  Exception");
			System.out.println("Io Exception Occured is  "+A);
		}
		catch(Exception e){
			System.out.println("Default Exception");
			System.out.println("Io Exception Occured is  "+e);
		}
		System.out.println("Method Excecution has been completed");
	}
	public static void main(String args[]){
		Demo obj1=new Demo();
		obj1.Method1();
	}
}
/*class InputStreamReaderExample {  
    void method1(){
     try{  
            InputStream stream = new FileInputStream("exceptionTheory.txt");  
            Reader reader = new InputStreamReader(stream);  
            int data = reader.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = reader.read();
            }  
        }
        catch (Exception e) {  
            e.printStackTrace();  
        }  
    
    }
    public static void main(String[] args) {  
       InputStreamReaderExample obj1=new InputStreamReaderExample();
       obj1.method1();
    }  
}
*/
