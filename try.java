import java.io.*;
class Dhanshri{
	static String readFirstLineFromFile(String path) throws IOException {
	    try (FileReader fr = new FileReader(path);
	         BufferedReader br = new BufferedReader(fr)) {
	        return br.readLine();
	    }
	}
	public static void main(String args[])throws RuntimeException{
	Dhanshri obj1=new Dhanshri();
	try{
		int num=5/0;
	}
	//finally{
	//	System.out.println("Shruti");
	//}
	//Dhanshri.readFirstLineFromFile("/home/dhanshri/java/java_practice/try.java");
	}
}
