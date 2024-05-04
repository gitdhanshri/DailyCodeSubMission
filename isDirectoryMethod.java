import java.io.*;
class CheckIsDirectory{
	int countFile=0;
	int countFolder=0;
	int count=0;
	int isDirectoryMethod(String path)throws Exception{
	try{
		File f_name=new File(path);
		File[] listOfAllFile=f_name.listFiles();
	  	//System.out.println("\nList Of all Files");
		for(int i=0;i<listOfAllFile.length;i++){
			boolean res=listOfAllFile[i].isDirectory();
			boolean isfile=listOfAllFile[i].isFile();
			if(res==true){
				System.out.println((count++)+"->Directory-:>"+listOfAllFile[i]);
				String name=listOfAllFile[i].getPath();
				countFolder=countFolder+1;
				isDirectoryMethod(name);
			}
			else if(isfile==true){
				System.out.println((count++)+"->File-:>"+listOfAllFile[i]);
				countFile+=1;	
			}
			else {
				return 0;
			}
		}
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
		return countFolder;
}
	public static void main(String args[])throws Exception{
		CheckIsDirectory obj1=new CheckIsDirectory();	
		obj1.isDirectoryMethod("/home/dhanshri/java/java_practice/file");
		System.out.println("Number of Folder-->"+obj1
		.countFolder);
	}
}
