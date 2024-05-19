class Test{
	int x;
	Test(){
		this(55);
		this.access();
	}
	Test(int x){
		this.x=x;
	}
	void access(){
		System.out.println("x=  "+x);
	}
	public static void main(String args[]){
		Test obj1=new Test();
	}
}
