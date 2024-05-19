class Test{
	int x;
	String  name="Dhanshri";
	/*Test(String s){
		name=s;
	}*/
        static void setName(String n1){
      		name=n1;
      	}
	public static void main(String args[]){
		Test obj1=new Test();
		System.out.println(obj1.name);
		setName("Bhaghyashri");
		System.out.println(obj1.name);
	}

}
