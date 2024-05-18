class Sample2{
	public static void main(String args[]){
		Sample2 obj1=new Sample2();
		String s1="Box";
		String s2="box";
		//System.out.println(s1.compareTo(s2));
		String name="This is my new is Book";
		String name2="is";
		//System.out.println(name.indexOf(name2,3));
		System.out.println(name.lastIndexOf("s"));
		String q="Shruti";
		System.out.println(q.replace('S','M'));
		String pp="This is Book on java";
		char arr[]=new char[20];
		pp.getChars(7,20,arr,0);
		System.out.println(arr);
	}
}
