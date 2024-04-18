class OuterClass{
	 double bal=2000;
	double rate=5;
	String name;
	OuterClass(String name){
		this.name=name;
	}
	void CalculateInterest1(){
		double interest=(bal*rate)/100;
		bal+=interest;
		System.out.println("Inside Outer Class:  Balance  -->"+bal);
		System.out.println("Name of Bank-->"+name);
	}
	static class InnerClass{
		static double rate1=5;
		static double bal1=1000;
		static void CalculateInterest(){
			System.out.println("BankAccount class:-->"+bal1);
			double interest=(bal1*rate1)/100;
			bal1+=interest;
			System.out.println("Inside Interest Class ::Balance  -->"+bal1);	
		}
	}
}
class myClass extends BankAccount{
	myClass(String msg){
		super(msg);
	}
	public static void main(String args[]){
		myClass myclass=new myClass("sggs");
		OuterClass account=new OuterClass("SBI");
		//InnerClass obj1 =account.new InnerClass();
		//OuterClass.InnerClass.CalculateInterest();
		/*InnerClass.CalculateInterest();*/
		
	}
}

