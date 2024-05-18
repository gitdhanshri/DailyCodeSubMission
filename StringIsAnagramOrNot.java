import java.io.*;
import java.util.Arrays;
import java.util.Collections;
class Anagram{
public static boolean isAnagram(char[] str1,char[] str2){
int n1=str1.length;
int n2=str2.length;
boolean res=false;
		if(n1!=n2){
		return false;
		}
Arrays.sort(str1);
Arrays.sort(str2);
		for(int i=0;i<n1;i++){
		if(str1[i]!=str2[i]){
		res= false;
		}
		res= true;
		}
return res;		
}
public static void main(String args[]){
char str1[]={'h','e','l','l','o'};

char str2[]={'h','e','l','o','l'};
if(isAnagram(str1,str2)){
System.out.println("yes");
}
else{
System.out.println("No");
}
}



}
