class college{
college(){
	//System.out.println("Name in College is-->"+name);
	System.out.println("Inside College  Default Constructor-->");
}
college(String name){
	System.out.println("Name in College is-->"+name);
	System.out.println("Inside College  Parameterized Constructor-->");
}
}
class Student extends college{
	Student(String name){
		super("Dhanshri");
		//super();
		System.out.println("Name  In Class Student is-->"+name);
		System.out.println("Inside Student Constructor-->");
	}
	public String toString(){
		return "MyOwmClass"+getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
	public static void main(String args[]){
		Student obj1=new Student("sggs");
		System.out.println(obj1);
	}
}
