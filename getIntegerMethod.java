class Sample{
	public static void main(String args[]){
		Sample obj1=new Sample();
		System.out.println(obj1);
		char arr[]={'s','g','g','s','c','l','g'};
		//String s1=new String(arr);
		String s1=new String(arr,2,3);
		//String s1=new String("sggsclg");
		String s2="sggsclg";
		System.out.println(s1);
		System.out.println(s2.endsWith("mm"));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
	public String toString(){
		//return "sggs"+"@"+Integer.toHexString(129873);
		long num=hashCode();
		System.out.println(num);
		return "sggs"+"@"+Integer.toHexString(hashCode());
	}
}
