import java.io.*;
class CountFile_Folder{
	int countFile=0;
	int countFolder=0;
	int countPng=0;
	int countWeb=0;
	int countJpg=0;
	int countEndsWithJava=0;
	int countEndsWithClass=0;
	int countTxtFile=0;
	int countWithC=0;
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
						boolean endsWithTxt=s.endsWith(".txt");
						boolean endsWithPng=s.endsWith(".png");
						boolean endsWithWeb=s.endsWith(".web");
						boolean endsWithJpg=s.endsWith(".jpg");
						boolean endsWith_C=s.endsWith(".c");
						if(endsjava==true){
							countEndsWithJava++;
							System.out.println(listOfAllFile[i]);
							countFile++;
						}
						else if(endsClass==true){
							countEndsWithClass++;														
							countFile++;
						}
						else if(endsClass==true){
							countEndsWithClass++;														
							countFile++;
						}
						else if(endsWithPng==true){
							countPng++;														
							countFile++;
						}
						else if(endsWithWeb==true){
							countWeb++;														
							countFile++;
						}
						else if(endsWithJpg==true){
							countJpg++;														
							countFile++;
						}
						else if(endsWithTxt==true){
							countTxtFile++;														
							countFile++;
						}
						else if(endsWith_C==true){
							countWithC++;														
							countFile++;
						}
				}
				 else if(isDir==true){
					System.out.println(listOfAllFile[i]);
					countFolder++;
					int p=0;
					endsWithFiles(s);
				}
				else{
					countFile++;
				}

			}
	 }
	 catch(Exception e){
		System.out.println("errMsg");
	 }	
}
	public static void main(String args[])throws Exception{
		CountFile_Folder obj1=new CountFile_Folder();
		obj1.endsWithFiles("/home/dhanshri/CountFileFolder");
		System.out.println("Number of Folder-->"+obj1.countFolder);
		System.out.println("Number of  Total Files-->"+obj1.countFile);
		System.out.println("Number of  java Files-->"+obj1.countEndsWithJava);
		System.out.println("Number of  Class Files-->"+obj1.countEndsWithClass);
		System.out.println("Number of  Class Files-->"+obj1.countEndsWithClass);
		System.out.println("Number of png Image-->"+obj1.countPng);
		System.out.println("Number of  Web Image-->"+obj1.countWeb);
		System.out.println("Number of Jpg Image-->"+obj1.countJpg);
		System.out.println("Number of  C files-->"+obj1.countWithC);
	}
}
class ownException extends Exception{
	public ownException(String error){
		super(error);
	}
}
