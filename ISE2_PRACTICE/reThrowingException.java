class SGGS{
	void dhanu(){
		//Thread.sleep(1000);
		int[] args={};
		try{
			System.out.println(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Array index aukat k bahar");
			throw ae;
		}
		finally{
			System.out.println("Inside sggs Class:inside dhanu method");
		}
	}
	
}
class college{
	public static void main(String args[])throws InterruptedException{
		SGGS gc =new SGGS();
		gc.dhanu();
		/*
		try{
			gc.dhanu();
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("catching rethrow exception");
		}*/
	}
}

