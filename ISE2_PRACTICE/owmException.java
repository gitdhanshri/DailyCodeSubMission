class Demo{
	public static void main(String args[]){
		Demo Obj1=new Demo();
		try{
			System.out.println(args[0]);
		}
		catch(Exception e){
			//System.out.println(e);
		for(StackTraceElement ele:e.getStackTrace()){
		//System.out.println(ele);
	//	System.out.println(ele.getClassName()+""+ele.getMethodName()+"("+ele.getFileName()+":"+ele.getLineNumber()+")");
		System.out.println("Class Name-->"+ele.getClassName());
		System.out.println("\nMethod Name-->"+ele.getMethodName());
		System.out.println(ele.getFileName());
		System.out.println(ele.getLineNumber());
		}
		}
	}
}
