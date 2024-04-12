class Tostring{
	//1 st Method
	public String toString(){
		return "Output-of-ToString-Method";
	}
	//2 nd method 
	String chararryToString(char[] arr){
		String str=new String(arr,6,2);
		return str;
	}
	//3 rd method
	String concat(String s1){
		String s=s1.concat("-Baswade");
		return s;
	}
	//4 th method
	int lengthOfString(String str){
		return str.length();
	}
	//5 th method
	int compare2(String s1,String s2){
		int res=s1.compareTo(s2);
		return res;
	}
	//6 th method
	int compare2IgnoreCase(String s1,String s2){
		int res=s1.compareToIgnoreCase(s2);
		return res;
	
	}
	// 7th method
	boolean equals(String s1,String s2){
		boolean res=s1.equals(s2);
		return res;
	}
	//8 th method
	boolean equalsIgnoreCase(String s1,String s2){
		boolean res=s1.equals("sggs");
		return res;
	}
	//9 th method
	boolean startWith(String s2){
		String s1="DhanshriBaswade";
		boolean res=s2.startsWith(s1);
		return res;
	}
	boolean endsWith(String s2){
		String s1="DhanshriBaswade";
		boolean res=s1.endsWith(s2);
		return res;
	}
	int indexOf(String s2){
		String name="is";
		int res=s2.indexOf(name);
		return res;
	}
	int lastIndexOf(String s2){
		String name="is";
		int res=s2.lastIndexOf(name);
		return res;
	
	}
	String replace(char c1,char c2,String s1{
	
	 String res=s1.replace(c1,c2);
	 return res;
	}
	public static void main(String args[]){
		Tostring s1=new Tostring();
		//System.out.println(s1);
		char[] arr={'s','g','g','s','c','l','w','s','a','d'};
		/*String res=s1.chararryToString(arr);
		System.out.println(res);
		String res2=s1.concat("Dhanshri");
		System.out.println(res2);
		String s3="Dhanshri"+"  Vitthalrao  Baswade";
		System.out.println(s3);
		System.out.println("Length of String is-->"+s1.lengthOfString(s3));
		System.out.println(s1.compare2("DHANSHRI","Dhanshri"));
		System.out.println(s1.compare2IgnoreCase("DHANSHRI","dhanshri"));*/
		//System.out.println(s1.equals("shri","shri"));
		//String name1="shri";
		//String name2="Shri";
		//System.out.println(s1.equalsIgnoreCase("SHRI","shri"));
		//System.out.println(s1.startsWith("Dhanshri"));
		//System.out.println(s1.endsWith("Baswade"));
		//System.out.println(s1.indexOf("This is My Book"));
		//System.out.println(s1.lastIndexOf("This is My Book"));
		
	}
}
