package pack;
public class ownCreatedException{
	double d1,d2;
	public ownCreatedException(double a,double b){
		d1=a;
		d2=b;
	}
	public void sum(){
		System.out.println("Sum is-->"+(d1+d2));
	}
	public static void main(String args[]){
		ownCreatedException obj1=new ownCreatedException(4,10);	
	}
}

