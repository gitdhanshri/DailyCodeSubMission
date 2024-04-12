import java.util.Arrays;
class ArraysFillMethod{
	//it will treate it as normal method which return String
	public String toString(int[] arr1){
		for(int i=0;i<arr1.length;i++){
			System.out.print(" "+arr1[i]);
		}
		return " hiSggs";
	}
	//Explicitly given toString Method
	public String toString(){
		return "shrutiByToStringMethod";
	}
	
	public static void main(String args[]){
		ArraysFillMethod a =new ArraysFillMethod();
		//System.out.println(a);
		int arr1[]={11,12,23,24,25,34,36,45,56,67};
		Arrays.fill(arr1,10);
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ,");
		}
		//System.out.println("All array elements are completely filled with Value 10->");
		//System.out.println(Arrays.toString(arr1));
		//System.out.println(a.toString(arr1));
		//a.toString(arr1);
		//System.out.println(a);
	}
}
