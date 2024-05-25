class Demo{
	void pattern1(int rows,int colms){
		System.out.println("pattern1a");
		for(int i=0;i<rows;i++){
			for(int j=1;j<=colms;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		/*
		1 2 3 4 
		1 2 3 4 
		1 2 3 4 
		1 2 3 4
		*/
	}
	void pattern1_Star(int rows,int colms){
		System.out.println("pattern1b");
		for(int i=0;i<rows;i++){
			for(int j=1;j<=colms;j++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		/*
		* * * * * * 
		* * * * * * 
		* * * * * * 
		* * * * * * 
		* * * * * * 
		* * * * * *
		*/
	}
	void pattern2(int rows,int colms){
		System.out.println("pattern2a");
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		/*
		1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5 
		1 2 3 4 5 6 
		*/
	}
	void pattern2_star(int rows,int colms){
		System.out.println("pattern2b");
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		/*
		* 
		* * 
		* * * 
		* * * * 
		* * * * * 
		* * * * * * 
		*/
	}
	void pattern3(int rows,int colms){
		System.out.println("pattern3");
		for(int i=0;i<rows;i++){
			for(int j=1;j<=colms;j++){
				System.out.print((colms*i+j)+"   ");
			}
			System.out.println();
		}
		/*
		1   2   3   4   
		5   6   7   8   
		9   10   11   12   
		13   14   15   16
		*/
	}
	void pattern4(int rows,int colms){
		System.out.println("pattern4");
		for(int i=0;i<rows;i++){
			for(int j=(i+1);j>0;j--){
				System.out.print((j)+"  ");
				//k=k+1;
			}
			System.out.println();
		}
		/*
		1  
		1  2  
		1  2  3  
		1  2  3  4  
		1  2  3  4  5  
		1  2  3  4  5  6  
		1  2  3  4  5  6  7  
		1  2  3  4  5  6  7  8  
		1  2  3  4  5  6  7  8  9  
		1  2  3  4  5  6  7  8  9  10  
		*/
		
	}
	void pattern5(int rows,int colms){
		System.out.println("pattern5");
		int k=1;
		for(int i=0;i<rows;i++){
			for(int j=0;j<=i;j++){
				System.out.print((k)+"  ");
				k=k+1;
			}
			System.out.println();
		}
		/*
		1  
		2  3  
		4  5  6  
		7  8  9  10  
		11  12  13  14  15  
		16  17  18  19  20  21  
		22  23  24  25  26  27  28  
		29  30  31  32  33  34  35  36
		*/
	}
	void pattern6(int rows,int colms){
		System.out.println("pattern-->6");
		int k=1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		/*
		1  
		2  3  
		4  5  6  
		7  8  9  10  
		11  12  13  14  15  
		16  17  18  19  20  21  
		22  23  24  25  26  27  28  
		29  30  31  32  33  34  35  36
		*/
	}
	void pattern7(int rows,int colms){
		System.out.println("pattern-->7");
		int k=1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=colms;j++){
				if((i+j)<(colms+1)){
					System.out.print("*");
				}
				else{
					System.out.print(j);	
				}
			}
			System.out.println();
		}
		/*
		*****6
		****56
		***456
		**3456
		*23456
		123456

		*/
	}
	void pattern8(int rows,int colms){
		System.out.println("pattern-->8");
		//int k=1;
		for(int i=1;i<=rows;i++){
			int k=1;
			for(int j=1;j<=colms;j++){

				if((i+j)<(colms+1)){
					System.out.print("*");
				}
				else{
					System.out.print(k);
					k=k+1;	
				}
			}
			System.out.println();
		}
		/*pattern-->8
		*****1
		****12
		***123
		**1234
		*12345
		123456
		*/
	}
	void pattern10(int rows,int colms){
		System.out.println("pattern-->10");
		for(int i=0;i<rows;i++){
			int k=1;
			for(int j=0;j<colms;j++){//j=0 to j=3
				if((i+j)<=2){
					System.out.print("* ");
				}
				else{
					System.out.print(k+" ");	
					k=k+1;	
				}
			}
			for(int j=colms;j>1;j--){
				int m=0;
				if(i+j>4){
					System.out.print(m+" ");
					m=m+1;
				}
				else{
					System.out.print("* ");		
				}

				
			}
			System.out.println();
		}
	}
	void pattern9(int rows,int colms){
		System.out.println("pattern-->9");
		//int k=1;
		for(int i=1;i<=rows;i++){
			int k=1;
			for(int j=1;j<=colms;j++){
				if((i+j)<(colms+1)){
					System.out.print(" ");
				}
				else{
					System.out.print(k);
					k=k+1;	
				}
			}
			for(int j=(i+1);j>1;j--){
				if(((i+1)+j)>=3){
					System.out.print((j-1));
				}
				else if((i+j)<3){
					System.out.print("*");		
				}
			}
			System.out.println();
		}
		/*
		      1
		     12 1
		    123 21
		   1234 321
		  12345 4321
		 123456 54321
		1234567 654321
		*/
	}

	void pattern11(int rows,int colms){
		for(int i=1;i<=(rows+1);i++){
			for(int j=(i+1);j>1;j--){
				if((i+j)>=3){
					System.out.print((j-1));
				}
				else if((i+j)<3){
					System.out.print("*");		
				}
			}
			System.out.println();
		}
		/*
		1
		21
		321
		4321
		54321
		*/
	}
	public static void main(String args[]){
		 Demo obj1=new Demo();
		/* obj1.pattern1(6,6);
		 obj1.pattern1_Star(6,6);
		 obj1.pattern2(6,6);
		 obj1.pattern2_star(6,6);
		 obj1.pattern3(6,6);
		 obj1.pattern4(6,6);
		 obj1.pattern5(6,6);
		 obj1.pattern6(6,6);
		 obj1.pattern7(6,6);*/
		 //obj1.pattern8(6,6);
		 //obj1.pattern9(7,7);
		 //obj1.pattern10(4,4);
		 obj1.pattern9(4,4);
	}
}
