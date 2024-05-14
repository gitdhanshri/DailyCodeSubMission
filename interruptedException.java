class Top1{
	long findSquareRootOfNumber(long num){
		for(int i=1;i*i<=num;i++){

			if(i*i==num){
				//System.out.println(i);
				return i;
			}
		}
		return -1;
	}
	void printArray(long[] arr){
	//Here RunTimeError can occurs
	/*
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
	at Top1.printArray(interruptedException.java:15)
	at Top1.main(interruptedException.java:23)
*/		
		try{
			for(int i=0;i<=arr.length;i++){
				System.out.println(arr[i]);
			}
		}
		catch( ArrayIndexOutOfBoundsException e){
			System.out.println("Exception Occured IS->");
			System.out.println(e);
		}
		System.out.println("The Function ends!!");
	
	}
	void interruptedException()throws InterruptedException{
		System.out.println("java");
		Thread.sleep(1000);
		Thread.currentThread().interrupt();
		if(Thread.interrupted()){
			throw new InterruptedException();
		}
		//Thread.currentThread().getName();
		//Thread.currentThread().toString();
		System.out.println("Programming lang");
	}
	public static void main(String args[]) throws Exception{
		Top1 t1=new Top1();
		//long res=t1.findSquareRootOfNumber(-25);
		//System.out.println("Square root of Number is->"+res);
		//long[] arr={1,2,3,4};
		//t1.printArray(arr);
		t1.interruptedException();
	}
}
