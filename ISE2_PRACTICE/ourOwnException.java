interface vc{
	void castVote();
}
interface Ec{
	void validityForVoter(int age);
}

class ECIndia implements vc,Ec  {
	int age;
	ECIndia(int a){
		this.age=a;
	}
	public void  castVote(){
		System.out.println("Inside CastVote Of India");
	}
	public void validityForVoter(int ag)throws OwnException1{
		if(ag<age){
			try{
			OwnException1 ei=new OwnException1("Invalid Voter In India"+"required Age-->"+age);
			throw ei;
			}
			catch(OwnException1 e){
				System.out.println(e);
			}
		}
	}
}
class ECBrazil implements vc,Ec{
	int age;
	ECBrazil(int a){
		this.age=a;
	}
	public void castVote(){
		System.out.println("Inside CastVote Of Brazil");
	}
	public void validityForVoter(int ag){
		if(ag<age){
			try{
				OwnException2 eb=new OwnException2("Invalid Voter In Brazil"+"required Age-->"+age);
					//System.out.println("Invalid Voter In India"+"required Age-->"+age);
					throw eb;
			}
			catch(OwnException2 e){
					System.out.println();
			}
		}
	}
}

class Demo{
	public static void main(String args[])throws OwnException2{
		Demo demo=new Demo();
		ECBrazil brazil=new ECBrazil(21);
		ECIndia india=new ECIndia(18);
		brazil.validityForVoter(12);
		//india.validityForVoter(12);		
	
	}
}
class OwnException1 extends RuntimeException{
	OwnException1(String error){
		super(error);
	}
}
class OwnException2 extends RuntimeException{
	//OwnException2(){}
	OwnException2(String error){
		super(error);
	}
}

