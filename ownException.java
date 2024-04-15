class ownExceptionff extends Exception{
	ownExceptionff(String msg){
		super(msg);
		//System.out.println("error in thrown by Exception");

	}
}
class DemoClass {
	void Method1(){
	int i=20;
	int arr[]={1};
		int j=0;
		try{
			j=18/i;
			if(j==0){
				throw new ownExceptionff("Error thrown by me");
			}
		}
		catch(ownExceptionff e){
			System.out.println("Our Own Created Exception");
			System.out.println(e);
		}
		catch(ArithmeticException w){
			j=18/i;
			//System.out.println("the default error in catch 1"+w);	
			w.getMessage();
		}
		//System.out.println(j);
		//finally{
			System.out.println("Second Exception Here!!!");
			try{
				System.out.println(arr[1]);
				throw new ownExceptionff("Error thrown by me");
			}
			catch(ownExceptionff e){
				System.out.println("Our Own Created Exception");
				System.out.println(e);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("In array Second Exception occured here-->");
				//System.out.println(e);
			}
			catch(Exception e){
				System.out.println("Second Exception occured here-->");
				System.out.println(e);
			}
		//}
	}
	public static void main(String args[]){
		DemoClass obj1=new DemoClass();
		obj1.Method1();
        }
}
/*class Demo{
	public static void main(String args[]){
		int i=0;
		int j=0;
		try{
			j=18/i;
		}
		catch(Exception e){
			//System.out.println(j);
			//System.out.println("Bye");
			System.out.println(e);
		}
			//System.out.println("Outside of catch->"+j);
		try{
			System.out.println(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException w){
			//System.out.println("In second Catch Block");
			System.out.println(w);
		}
	}
}*/
