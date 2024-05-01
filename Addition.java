package packadditon;
public class Addition{

	private double d1,d2;
	public Addition(double a,double b){
		d1=a;
		d2=b;
	}
	public void sum(){
		System.out.println("Sum is->"+(d1+d2));
	}
	public void Subtract(double a,double b){
		System.out.println("Subtraction Result->"+(a-b));
	}
	/*String methodName="Addition";
	public Addition(){
		System.out.println("Inside deFault Constructor");
	}
	public void sum(int a,int b){
		int res=a+b;
		System.out.println("Sum is ->"+res);
	}*/
	/*public static void main(String args[]){
		Addition obj1=new Addition();
		obj1.sum(3,6);
	}*/
}
