/*class ISE_2{
	public static void main(String args[]){
		ISE_2 Obj1=new ISE_2();
		System.out.println("sggs");
		Thread.sleep(1213);
		
	}
}*/
/*
The Above Given Program Will throw Following error

ISE_2.java:5: error: unreported exception InterruptedException; must be caught or declared to be thrown
		Thread.sleep(1213);
		            ^
1 error
[1]+  Done                    gedit ISE_2.java

*/
//After Resolving Program 
//Solution By using try Catch Block ,by Particular Given Exception 
class ISE_2{
	public static void main(String args[]){
		ISE_2 Obj1=new ISE_2();
		System.out.println("sggs");
		try{
			Thread.sleep(1213);
		}
		catch(InterruptedException e){
			System.out.println("Error");
		}
		catch(Exception e){
			
		}
		
	}
}
