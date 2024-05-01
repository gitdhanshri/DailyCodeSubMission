import java.io.*;
//method 1
/*class Rethrow{
	void methos1(int arr[]){
		try{
			File name=new File("struti.java");
			name.createNewFile();
			System.out.println("sggs");
			//System.out.println(arr[5]);		
		   }
		   catch(Exception ex){
		   	System.out.println(ex);
		   }	
	}
	public static void main(String args[]){
		Rethrow obj1=new Rethrow();
		int[] arr={2,5,12};
		try{
			obj1.methos1(arr);
			System.out.println("File is Created");
		}
		catch(Exception e){
			System.out.println("Catching rethrowed Exception");
		}		
	}
}*/
//method 2
/*class Rethrow{
	void methos1(int arr[])throws IOException{
		//try{
			File name=new File("struti.java");
			name.createNewFile();
			System.out.println("sggs");
			//System.out.println(arr[5]);		
		 //  }
		  // catch(Exception ex){
		   	//System.out.println(ex);
		   	//throw ex;
		   //}	
	}
	public static void main(String args[]){
		Rethrow obj1=new Rethrow();
		int[] arr={2,5,12};
		try{
			obj1.methos1(arr);
			System.out.println("Exception is not Occured");
		}
		catch(Exception e){
			System.out.println("Catching rethrowed Exception");
		}		
	}
}*/
//method 3
/*class Rethrow{
	void methos1(int arr[]){
		try{
			File name=new File("struti.java");
			//name.createNewFile();
			System.out.println("sggs");
			System.out.println(arr[5]);		
		  }
		  catch(Exception ex){
		   	System.out.println("RunTime Exception thown in methos1");
		   	throw ex;
		 }	
	}
	public static void main(String args[]){
		Rethrow obj1=new Rethrow();
		int[] arr={2,5,12};
		try{
			obj1.methos1(arr);
			System.out.println("Exception is not Occured");
		}
		catch(Exception e){
			System.out.println("Catching rethrowed Exception");
		}		
	}
}*/
//method 4
class Rethrow{
	void methos1(int arr[])/*throws ArrayIndexOutOfBoundsException*/{
		try{
			File name=new File("struti.java");
			//name.createNewFile();
			System.out.println(arr[5]);		
		  }
		  catch(Exception ex){
		   //	System.out.println("Catch Block is excecuted");
		   	throw ex;
		 }	
	}
	public static void main(String args[]){
		Rethrow obj1=new Rethrow();
		int[] arr={2,5,12};
		try{
			obj1.methos1(arr);
			System.out.println("Exception is not Occured");
		}
		catch(Exception e){
			//System.out.println("Catching rethrowed Exception");
			System.out.println(e);
		}		
	}
}
