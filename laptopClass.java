interface computer{
	public abstract void code();
}
/*abstract class computer{
	public abstract void code();
}*/
class laptop implements computer{
	public void code(){
		System.out.println("First Write the Code,Compile and Run");
	}
}
class Desktop implements computer{
	public void code(){
		System.out.println("Faster than LapTop....First Write the Code,Compile and Run");
	}
}
class Developer{
	public void devApp(computer desk){
		desk.code(); 
		System.out.println("\nCoding ....\nIn Class Developer");
	}
}
class Demo{
	public static void main(String args[]){
		computer lab=new laptop();
		computer desk=new Desktop();
		
		Developer D1=new Developer();
	//	D1.devApp(lab);
		D1.devApp(desk);
	}
}
