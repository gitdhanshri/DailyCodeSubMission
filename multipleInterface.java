interface college2{
	//all Methods of interface are Bydefault Public and Abstract
	int age=21;
	String name="Shri-Mahesh";//bydefault final and Static
	void show();
	//System.out.println(name);
	public abstract void config();
}
interface sggs2{
	void run();
}
class first2 implements college2,sggs2{
	public void show(){
		System.out.println("Inside Class first:Inside Show Method ");
	}
	public void config(){
		System.out.println("Inside Class first:Inside Config  Method ");
		System.out.println(name);
	}
	public void run(){
	
	}
}
class Demo2{
	{
		System.out.println("Inside First Init Block  1");
	}
	static{
		System.out.println("Inside First Static  Block  2");
	}
	 public static void main(String args[]){
		college2 obj1;
		obj1=new first2();
		obj1.show();
		obj1.config();
	}	
}
