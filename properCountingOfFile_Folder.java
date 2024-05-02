import java.io.*;
class CountFile_Folder{
	int countFile=0;
	int countFolder=0;
void countMethod1(String path)throws ownException{
	try{
		File f_name=new File(path);
		File[] listOfAllFile=f_name.listFiles();
	  	//System.out.println("\nList Of all Files");
		for(int i=0;i<listOfAllFile.length;i++){
			boolean res=listOfAllFile[i].isDirectory();
			if(res==true){
			//System.out.println(i+"->Directory-:>"+listOfAllFile[i]);
				countMethod1("listOfAllFile[i]");
				countFolder++;
			}
			else{
				//System.out.println(i+"->File-:>"+listOfAllFile[i]);
				countFile++;	
			}
		}
		//System.out.println("Number of Files-->"+countFile);
		//System.out.println("Number of Folder-->"+countFolder);
		}
		catch(Exception e){
			//System.out.println("Exception Occured");
			//System.out.println(e.getMessage());
			//throw new ownException("msg");
			//System.out.println("error msg");
		}
}
	public static void main(String args[])throws ownException{
		CountFile_Folder obj1=new CountFile_Folder();
		obj1.countMethod1("/home/dhanshri/java/java_practice/file");
		System.out.println("Number of Files-->"+obj1.countFile);
		System.out.println("Number of Folder-->"+obj1.countFolder);
	}
}
class ownException extends Exception{
	public ownException(String error){
		super(error);
	}
}
