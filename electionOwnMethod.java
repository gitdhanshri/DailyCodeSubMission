interface voter{
	void castVote();
}
interface EC{
	void checkValidityOfVoter(int a);
}
class EcIndia implements voter,EC{
	int age;
	EcIndia(int a){
		this.age=a;
	}
	public void castVote(){
		System.out.println("Required age in India is-->"+age);
	}
	public void  checkValidityOfVoter(int a){
		if(a<age){
		throws new myException1("Invalid Voter for Indian Election  & Requred Age-->");
		}
	}
	
}
class EcBrazil implements voter,EC{
	int age;
	EcBrazil(int a){
		this.age=a;
	}
	public void castVote(){
		System.out.println("Required age in Brazil is-->"+age);
	}
	public void  checkValidityOfVoter(int a){
		if(a<age){
			throws new myException1("Invalid Voter for Brazil  Election  & Requred Age-->");
		}
	}
}
class ElectionCommission{
	public static void main(String args[])/*throws Exception*/{
		ElectionCommission obj1=new ElectionCommission();
		EcIndia eci=new EcIndia(18);
		eci.checkValidityOfVoter(23);
		EcBrazil ecb=new EcBrazil(21);
		//ecb.checkValidityOfVoter(33);

	}
}
class myException1 extends Exception{
	myException1(String error){
		super(error);
	}
}
/*class myException2 extends Exception{
	myException2(String error){
		super(error);
	}
}*/
