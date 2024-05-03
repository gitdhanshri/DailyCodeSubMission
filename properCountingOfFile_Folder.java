import java.io.*;
class CountFile_Folder{
	int countFile=0;
	int countFolder=0;
	int countEndsWithJava=0;
	int countEndsWithClass=0;
/*int countFolder(String path)throws ownException{
	try{
		File f_name=new File(path);
		File[] listOfAllFile=f_name.listFiles();
		for(int i=0;i<listOfAllFile.length;i++){
			boolean res=listOfAllFile[i].isDirectory();
			boolean res2=listOfAllFile[i].isFile();
			if(res==true){
			//System.out.println(i+"->Directory-:>"+listOfAllFile[i]);
			String s=listOfAllFile[i].getPath();

				 countFolder=countFolder+1;
				countFolder(s);
			}
			else if(res2==true){
				//System.out.println(i+"->File-:>"+listOfAllFile[i]);
				countFile++;	
			}
			else{
				return 0;	
			}
		}
		}
		catch(Exception e){
			//System.out.println("Exception Occured");
			//System.out.println(e.getMessage());
			//throw new ownException("msg");
			System.out.println("error msg");
		}
return countFolder;
}*/
/*int countFiles(String path)throws ownException{
	try{
		File f_name=new File(path);
		File[] listOfAllFile=f_name.listFiles();
		for(int i=0;i<listOfAllFile.length;i++){
			boolean res=listOfAllFile[i].isDirectory();
			boolean res2=listOfAllFile[i].isFile();
			if(res2==true){
				//System.out.println(i+"->Directory-:>"+listOfAllFile[i]);
				String s=listOfAllFile[i].getPath();
				 countFile=countFile+1;
			}
			else if(res==true){
				countFolder++;
				String s=listOfAllFile[i].getPath();
				countFiles(s);
			}
			else{
				return 0;	
			}
		}
		}
		catch(Exception e){
			System.out.println("error msg");
		}
return countFile;
}*/
void endsWithFiles(String path)throws Exception{
	try{
		File f_name=new File(path);
		File[] listOfAllFile=f_name.listFiles();
		for(int i=0;i<listOfAllFile.length;i++){
			boolean isFile=listOfAllFile[i]. isFile();
			boolean isDir=listOfAllFile[i].isDirectory ();			

			String s=listOfAllFile[i].getPath();
				if(isFile==true){
						String filePath=listOfAllFile[i].getPath();
						boolean endsjava=filePath.endsWith(".java");
						boolean endsClass=s.endsWith(".class");
						if(endsjava==true){
							countEndsWithJava++;
							System.out.println(listOfAllFile[i]);
						}
						else if(endsClass==true){
							//System.out.println(listOfAllFile[i]);
							countEndsWithClass++;
						}
	

				 else if(isDir==true){
					System.out.println(listOfAllFile[i]);
					countFolder++;
					endsWithFiles(s);
				}

			}
		}
	}
	catch(Exception e){
		System.out.println("errMsg");
	}
}
	public static void main(String args[])throws Exception{
		CountFile_Folder obj1=new CountFile_Folder();
	//	obj1.countFolder("/home/dhanshri/java/java_practice/file");
		obj1.endsWithFiles("/home/dhanshri/java/java_practice/file");
		//System.out.println("Number of Files-->"+obj1.countFile);
		System.out.println("Number of  java Files-->"+obj1.countEndsWithJava);
		System.out.println("Number of  Class Files-->"+obj1.countEndsWithClass);
		//System.out.println("Number of Folder-->"+obj1.countFolder);
		/*obj1.endsWithJava("/home/dhanshri/java/java_practice/file");
		System.out.println("Number of Files Ends With java-->"+obj1.countEndsWithJava);
		System.out.println("Number of Files Ends With-->"+obj1.countEndsWithClass);*/
	}
}
class ownException extends Exception{
	public ownException(String error){
		super(error);
	}
}
