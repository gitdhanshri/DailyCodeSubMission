import java.io.*;
class Sample{
	public static void main(String args[])throws IOException{
		Sample obj1=new Sample();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("Enter Number of you Wants to Enter-->");
		int n=Integer.parseInt(br.readLine());
		
		//System.out.println("value of n-->"+n);
		String str[]=new String[n];
		for(int i=0;i<n;i++){
			System.out.print("Enetr a String-->:");
			str[i]=br.readLine();
		}
		
		System.out.println("Enetre the String to be Search...");
		String stringSearch=br.readLine();
		boolean res=false;
		
		for(int i=0;i<n;i++){
			if(stringSearch.equalsIgnoreCase(str[i])){
				System.out.println("String found at position  "+(i+1));
				res=true;
			}
		}
		if(!res){
			System.out.println("String is not Found");	
		}
	}
}
