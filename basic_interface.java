interface college{
	//all Methods of interface are Bydefault Public and Abstract
	int age=21;
	String name="Dhanshri";//bydefault final and Static
	void show();
	public abstract void config();
}

class first implements college{
	public void show(){
		System.out.println("Inside Class first:Inside Show Method ");
	}
	public void config(){
		System.out.println("Inside Class first:Inside Config  Method ");
		System.out.println(name);
	}
	//System.out.println(name);
}
class Demo{
	{
		System.out.println("Inside First Init Block  1");
	}
	static{
		System.out.println("Inside First Static  Block  2");
	}
	 public static void main(String args[]){
		//A obj1=new A();
		college obj1;
		//obj1=new college();
		obj1=new first();
		obj1.show();
		obj1.config();
		/*first obj2=new first();
		obj2.show();
		obj2.config();
		Demo obj3=new Demo(); */
	}	
}
