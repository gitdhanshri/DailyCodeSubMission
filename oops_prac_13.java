class ExceptionHandler{
	void divideByZero()throws ownException{
		int num1=12;
		int num2=0;
	
		if(num2==0){
			throw 	new ownException("Number Cannot divide By zero");
		}
		else{
		int res=num1/num2;
		}
	}
	void arrayIndexOutOfBound(String arr[])throws ownException2{
		System.out.println(arr[0]);
	}
	public static void main(String args[]){
		ExceptionHandler obj1=new ExceptionHandler();
		try{
			obj1.divideByZero();
		}
		catch(ownException e){
			System.out.println("Exception handled");
			//System.out.println(e);
		}
		try{
			obj1.arrayIndexOutOfBound(args);
		}
		catch(ownException2 e){
			System.out.println("Array size is Greater than Required");
		//System.out.println(e);
		}
		
	} 
}
class ownException extends Exception{
	public ownException(String error){
		super(error);
	}
}
class ownException2 extends Exception{
	public ownException2(String error){
		super(error);
	}
}
