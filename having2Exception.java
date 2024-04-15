class Demo{
	void having2Exception(String[] arr){
		int i=12,j=0;
		//arr={1};
		try{
			int length=arr.length;
			int res=i/length;
			System.out.println("Result Value-->"+res);
			System.out.println(arr[4]);
			
		}
		catch(ArithmeticException e){
			System.out.println("Here Arithmetic Exception-->");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Exception-->");
			System.out.println(e);
		}
		finally{
			System.out.println("Closing an files!!");
		}
	
	}
	public static void main(String args[]){
		Demo obj1=new Demo();
		obj1.having2Exception(args);
	}
}
