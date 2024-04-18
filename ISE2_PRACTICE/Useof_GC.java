class GC_Counter{
	void dhanu(){
	//Thread.sleep(1000);
	int[] args={};
	try{
		System.out.println(args[0]);
	}
	catch(ArrayIndexOutOfBoundsException ae){
		System.out.println("Array index aukat k bahar");
		throw ae;
	}/*
		GC_Counter obj1=new GC_Counter();
		String s=null;
		System.out.println(s);
		System.gc();
		System.out.println(s);
		Integer i = new Integer(4);
		System.out.println(i);
		*/
	}
	
}
class dhanshri{
	public static void main(String args[])throws InterruptedException{
		GC_Counter gc =new GC_Counter();
		try{
			gc.dhanu();
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("catching rethrow exception");
		}
	}
}
/*
Calling the gc method suggests that the Java Virtual Machine expend effort toward recycling unused objects in order to make the memory
 they currently occupy available for quick reuse.
*/
/*
Garbage collection in Java is the process by which Java programs perform automatic memory management. Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program. Eventually, some objects will no longer be needed. The garbage collector finds these unused objects and deletes them to free up memory.
*/
/*
Java garbage collection is an automatic process. Automatic garbage collection is the process of looking at heap memory, identifying which objects are in use and which are not, and deleting the unused objects. An in-use object, or a referenced object, means that some part of your program still maintains a pointer to that object. An unused or unreferenced object is no longer referenced by any part of your program. So the memory used by an unreferenced object can be reclaimed. The programmer does not need to mark objects to be deleted explicitly. The garbage collection implementation lives in the JVM. 
*/
