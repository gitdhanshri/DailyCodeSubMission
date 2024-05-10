class res{
public static void main(String[]  args){

 int num=valid();
 System.out.println(num);
}
	static int valid(){
		 String res="2022BIT049";
		 String s1="BIT";
		 
		 String s2="BCS";
		 String s3="BCH";
		 String s4="BME";
		 String s5 = res.substring(4,7);
		 System.out.print(s5);
		 System.out.print("\n");
		// String s5=res.subString(4,7);
		if(s5.equals(s1)||s5.equals(s2)||s5.equals(s3)||s5.equals(s4)){
		 return 1;
		 
		 }
		 else
		 {
		 return -1;
		 }
	  }	

}
