import IsValidResNumber.*;
import java.util.Scanner;
import java.util.*; 
class BasicInputToAllClass{
	long mobNumber;
	String StatusOfBookIssuer;
	String nameOfBookIssuer;
	
	void setMobNumber(long num){
		this.mobNumber=num;
	}
	void setStatusOfBookIssuer(String status){
		this.StatusOfBookIssuer=status;
	}
	void setnameOfBookIssuer(String name){
		this.nameOfBookIssuer=name;
	}
	void printArray(long[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	void printStringArray(String[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	long[] createArraytoStoreBookNumber(){
		int num=1;
		long[] arr=new long[100];
		for(int i=0;i<100;i++){
			arr[i]=num;
			num++;
		}
		return arr;
	}
	void getMobNum(){
		System.out.println("Mobile Number is->           "+mobNumber);
	}
	String getStatusOfBookIssuer(){
		System.out.println("Status of Book Issuer is ->  "+StatusOfBookIssuer);
		return StatusOfBookIssuer;
		
	}
	void displayNameIssuer(){
		System.out.println("Name of Book Isuser is ->     "+nameOfBookIssuer);
	}
}
//	class 1
class Faculty{
	String nameOfProfessor;
	String IdNumber;
	String dept;
	String facultyList[]={"A","a","B","b","C","c","D","d"};
	
	boolean isRegisteredFaculty(String name){
		for(int i=0;i<facultyList.length;i++){
			if(facultyList[i].equals(name)){
				return true;
			}
		}
		return false;
	}
	void setNameFaculty(String name){
		this.nameOfProfessor=name;
	}
	void setDeptName(String name){
		this.dept=name;
	}
	void setIdNumber(String num){
		this.IdNumber=num;
	}
	void getNameOfFaculty(){
		System.out.println("Name of Faculty-->       "+nameOfProfessor);
	}
	void getIdNumber(){
		System.out.println("Id Number of Faculty --> "+IdNumber);
	}
	void getDeptName(){
		System.out.println("Name of Department-->     "+dept);
	}	
}
//class 2
class Student{
	String nameOfStudent;
	String branchCode;
	int yearOfStudent;
	String addressOfStudent;
	String resNumberOfStudent;
	IsValidResNumber.IsValidRegistrationNumber obj1=new IsValidResNumber.IsValidRegistrationNumber();
	String[] StudentList={"Dhanshri","Shruti","Mahesh","Satwik","ShivShankar","Ram","Pallvi","Anushka","Avika","Kiran"};
	void setStudentName(String name){
		this.nameOfStudent=name;
	}
	boolean isValidStudent(String name){
		for(int i=0;i<StudentList.length;i++){
			if(StudentList[i].equals(name)){
				return true;
			}
		}
		return false;
	}
	boolean isValisRegistrationNumber(String num){
		boolean res =obj1.validString("num");
		if(res==true){
			return true;
		}
		else{
			return false;
		}
	}
	void setStudentBranch(String branch){
		this.branchCode=branch;
	}
	void setAddressOfStudent(String address){
		this.addressOfStudent=address;
	}
	void setyearOfStudent(int y){
		this.yearOfStudent=y;
	}
	void setRegistrationNumber(String resNum){
		this.resNumberOfStudent=resNum;
	}
	
	void getStudentName(){
		System.out.println("Name of Student-->       "+nameOfStudent);
	}
	void getStudentBranch(){
		System.out.println("Branch Name of Student->  "+branchCode);
	}
	void getyearOfStudent(){
		System.out.println("Year Of Student-->        "+yearOfStudent);
	}
	void getRegistrationNumber(){
	System.out.println("Registration Number Of Student->   "+resNumberOfStudent);
	}
	void getAddressOfStudent(){
	System.out.println("Address  Of Student->              "+addressOfStudent);
	}
	
}
//class 3
class Book{
	String BookName;
	String BookAuthor;
	long publication;
	long Edition;
	long BookNum;
	long NumberOfPages;
	long bookPrize;
String[] booksList={"python","c++","c","maths-4","DS","DAA","NT","OS","DBMS","ML","DL","MPI","DSD","GRAPHICS","CORE JAVA","M-1","M-2","M-3","M-4"};
	
	boolean isValidBooK(String BookName){
		for(int i=0;i<booksList.length;i++){
			if(booksList[i].equals(BookName)){
				return true;
			}
		}
		return false;
	}
	boolean isAvaiableBook(String bookName){
		boolean isBookInLab=isValidBooK(bookName);
		if(isBookInLab==true){
			return true;
		}		
		else{
			return false;
		}
	}
	//1
	void setBookName(String bookName){
		this.BookName=bookName;
	}
	void setBookNumber(long bookNum){
		this.BookNum=bookNum;
	}
	// 2 nd
	void setAuthorName(String A_name){
		this.BookAuthor=A_name;
	}
	// 3 rd
	void setPublication(long publica_tion){
		this.publication=publica_tion;
	}
	// 4th
	void setEdition(long edition){
		this.Edition=edition;
	}  
	//5 th
	void setNuberOfPages(long pages){
		this.NumberOfPages=pages;
	}  
	void setPrizeOfBook(long prize){
		this.bookPrize=prize;
	} 
	String[] _Store_Book_After_Issue(String[]  arr,String bookName){
		System.out.println("length original->"+arr.length);
		int length=arr.length-1;
		String[] store_book_after_issue=new String[length];
		int index=-1;
		for(int i=0;i<arr.length;i++){
			String s=arr[i];
			if(s.equals(bookName)){
				index=i;
			}
		}
		System.out.println("index-"+index);
		for(int i=0;i<index;i++){
			store_book_after_issue[i]=arr[i];
		}
		for(int i=index;i<length;i++){
			store_book_after_issue[i]=arr[i+1];
		}
	
		System.out.println("List of books after issued \n");
		for(String x:store_book_after_issue){
			System.out.println(x);
		}
	System.out.println("length result->"+store_book_after_issue.length);
	return store_book_after_issue;
	}
	void getNameOfBook(){
		System.out.println("Name of Book->           "+BookName);
	}
	void getBookNumber(){
		System.out.println("Book Number is->         "+BookNum);
	}
	void getEdition(){
		System.out.println("Edition  of Book->        "+Edition);
	}
	void getPublication(){
		System.out.println("Pubication Of Book->      "+publication);
	}
	void getBookAuthor(){
		System.out.println("Name of Book Author->     "+BookAuthor);
	}
	void getNumberOfPagesInBook(){
		System.out.println("Number of pages in Book->  "+NumberOfPages);
	}
	void getPrizeOfBook(){
		System.out.println("Prize of Book  ->            "+bookPrize);
	}
	
}
//class  4
class LibraryStaff{
	String NameOfStaff;
	String id;
	void setNameOfStaff(String name){
		this.NameOfStaff=name;
	}
	void setIdOfStaff(String name){
		this.NameOfStaff=name;
	}
	void displayInfo(){
		System.out.println("Staff Name is-->"+NameOfStaff);
		System.out.println("Id Number Of Staff"+id);
	}
	void isBookIssued(Student s1,BasicInputToAllClass p1,Book b1,Faculty f1){
		if(b1.isAvaiableBook(b1.BookName)){	
			String s=p1.getStatusOfBookIssuer();
			if(s.equals("faculty")){
				System.out.println("Book  Having ->:");
				b1.getBookNumber();	
				//b1.getBookAuthor();
				//b1.getPublication();
				//b1.getNumberOfPagesInBook();
				//b1.getPrizeOfBook();
				System.out.println("\nIssued to ->:");
				f1.getIdNumber();
				f1.getDeptName();
				f1.getNameOfFaculty();
				p1.getMobNum();
			
			 }
			 else if(s.equals("student")){
				System.out.println("Book  Having ->:");
				//b1.getBookNumber();	
				b1.getBookAuthor();
				/*b1.getPublication();
				b1.getNumberOfPagesInBook();
				b1.getPrizeOfBook();*/	
				System.out.println("\nIssued to ->:");
			 	s1.getRegistrationNumber();
				s1.getStudentName();	
				s1.getyearOfStudent();
				p1.getMobNum();
				b1.getNameOfBook();
				//s1.getAddressOfStudent();			
			 }
			 else {
			 	System.out.println("Book canot be Issued to Outsider!!");
			 	
			 }
		  }
	}
	String[] returnBook(Student s1,BasicInputToAllClass p1,Book b1,String bookName){
		System.out.println("\nBook Returned  is ->:");
		String[] arr=b1.booksList;
		System.out.println(arr.length);
		int length=(arr.length)+1;
		String s[] =new String[length];
		System.out.println(length);
		for(int i=0;i<length-1;i++){
			s[i]=arr[i];
		}
			s[length-1]=bookName;
			p1.getStatusOfBookIssuer();
			b1.getBookNumber();	
			b1.getBookAuthor();
			b1.getPublication();
			b1.getNameOfBook();
			b1.getNumberOfPagesInBook();
			b1.getPrizeOfBook();	
			System.out.println("\nReturned From->");
			p1.getStatusOfBookIssuer();
	        return s;		
	}	
}
class printOtherMethod{
	Book b1			=new Book();
	Faculty f1		=new Faculty();
	Student s1		=new Student();
	LibraryStaff l1		=new LibraryStaff();
	BasicInputToAllClass p1 =new BasicInputToAllClass();
	void commonInputToSomeMethods(){
				Scanner sc=new Scanner(System.in);
				/*System.out.print("Enter registration/ID number->:");
				String regnum=sc.nextLine();
				s1.setRegistrationNumber(regnum);*/
				
				System.out.print("Enter DepartMent:");
				String branch=sc.nextLine();
				s1.setStudentBranch(branch);
				System.out.print("Enter Address ->:");
				String address=sc.nextLine();
				s1.setAddressOfStudent(address);
				
				System.out.print("Enter mobile Number->:");
				long mobnum=Long.parseLong(sc.nextLine());
				p1.setMobNumber(mobnum);
				
		
	}
	void EnterBookDetails(){
				Scanner sc=new Scanner(System.in);
				/*System.out.print("Enter Book Name->:");
				String bookName=sc.nextLine();
				b1.setBookName(bookName);
				*/
				System.out.print("Enter Author of book->:");
				String bookAuthor=sc.nextLine();
				b1.setAuthorName(bookAuthor);
				
				System.out.print("Enter Book Publication->: ");
				long publictn=Long.parseLong(sc.nextLine());
				b1.setPublication(publictn);
				
				System.out.print("Enter Book Number->: ");
				long bookNum=Long.parseLong(sc.nextLine());
				b1.setBookNumber(bookNum);
				
				System.out.print("Enter Number of Pages In Book->:");
				long numOfPages=Long.parseLong(sc.nextLine());
				b1.setNuberOfPages(numOfPages);
				
				System.out.print("Enter Price of Book->:");
				long prizeOfBook=Long.parseLong(sc.nextLine());
				b1.setPrizeOfBook(prizeOfBook);
	}
	void bookIssuedByStudent(){
				Scanner sc=new Scanner(System.in);
				p1.setStatusOfBookIssuer("student");
				System.out.print("Enter  name of Student:");
				String name1=sc.nextLine();
				s1.setStudentName(name1);
				
				System.out.print("Enter registration/ID number->:");
				String regnum=sc.nextLine();
				s1.setRegistrationNumber(regnum);
				
				commonInputToSomeMethods();
				System.out.print("Enter year student ->:");
				int year=Integer.parseInt(sc.nextLine());
				s1.setyearOfStudent(year);
				
				EnterBookDetails();  
				try{
					if(s1.isValisRegistrationNumber(regnum)==false){
						throw new inValidRegNumber("Invalid Registration Number...");
					}
				}
				catch(inValidRegNumber e){
					//e.printStackTrace();
					//e.getMessage();
					System.out.println(e);
				}			
				System.out.println("Msg of BOOk Issue");
				l1.isBookIssued(s1,p1,b1,f1);
	}
	void bookIssuedByFaculty(){
				Scanner sc1=new Scanner(System.in);
				p1.setStatusOfBookIssuer("faculty");
				
				System.out.print("Enter  name of Faculty:");
				String facultyName=sc1.nextLine();
				
				//s1.setNameFaculty(facultyName);
				System.out.print("Enter registration/ID number->:");
				String regnum=sc1.nextLine();
				s1.setRegistrationNumber(regnum);
				
				boolean validFaculty=f1.isRegisteredFaculty(facultyName);
				commonInputToSomeMethods();
				EnterBookDetails();
				System.out.println("Msg of BOOk Issue");
				l1.isBookIssued(s1,p1,b1,f1);
				try{
					if(validFaculty==false){
						throw new NotRegisteredFaculty("Not Registered Faculty....");
					}
				}
				catch(NotRegisteredFaculty e){
					//e.printStackTrace();
					//e.getMessage();
					System.out.println(e);
				}
		
	}
	void bookReturn(){
				Scanner sc2=new Scanner(System.in);
				System.out.println("enter  Status of Book issuer");
				String name1=sc2.nextLine();
				p1.setStatusOfBookIssuer(name1);
				EnterBookDetails();
				System.out.println("Msg of BOOK return");
				l1.returnBook(s1,p1,b1,b1.BookName);
	}
	void isAvailabeBookMethod(){
				Scanner sc3=new Scanner(System.in);
				System.out.println("Enter  Status of Book issuer");
				String name1=sc3.nextLine();
				p1.setStatusOfBookIssuer(name1);
				System.out.println("Enter Book Name");
				String bookName=sc3.nextLine();
				boolean res=b1.isAvaiableBook(bookName);
				System.out.println(res);
				EnterBookDetails();
				try{
					if(res==false){
						throw new EnteredBookNotPresent("This Book is Not Present In Library...");	
					}
					else{
						System.out.println("This Book is Available in Library...");	
					}
				}catch(EnteredBookNotPresent e){
					e.printStackTrace();
					e.getMessage();
					System.out.println(e);
				}	
	}
}
class AccesOtherMethods{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		printOtherMethod pr=new printOtherMethod();
		//1.String choice="ReturnBook";
		String choice="IssueBookByStudent";
		//String choice="IssueBookByfaculty";
		//String choice="IsAvailableBook";
		switch (choice){
			case "IssueBookByStudent":
				pr.bookIssuedByStudent();
				break;
			case "IssueBookByfaculty":
			 	pr.bookIssuedByFaculty();
				break;
			case "ReturnBook":
				pr.bookReturn();
				break;
			case "IsAvailableBook":
				pr.isAvailabeBookMethod();
				break;
			default:
				System.out.println("Invalid choice");		
		}
	}
} 
class NotValidUserForLabraryUse extends Exception{
        public NotValidUserForLabraryUse(String error){
                super(error);
        }
}
class EnteredBookNotPresent extends Exception{
        public EnteredBookNotPresent(String error){
                super(error);
        }
}

class invalidStatusOfIssuer extends Exception{
        public invalidStatusOfIssuer(String error){
                super(error);
        }
}

class NotRegisteredStudent extends Exception{
        public NotRegisteredStudent(String error){
                super(error);
        }
}
class NotRegisteredFaculty extends Exception{
        public NotRegisteredFaculty(String error){
                super(error);
        }
}

class inValidRegNumber extends Exception{
        public inValidRegNumber(String error){
                super(error);
        }
}










