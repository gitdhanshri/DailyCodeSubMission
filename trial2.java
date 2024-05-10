import IsValidResNumber.*;
import java.util.Scanner;
import java.util.*;

class BasicInputOperations {
    long mobNumber;
    String statusOfBookIssuer;
    String nameOfBookIssuer;

    void setMobNumber(long num) {
        this.mobNumber = num;
    }

    void setStatusOfBookIssuer(String status) {
        this.statusOfBookIssuer = status;
    }

    void setNameOfBookIssuer(String name) {
        this.nameOfBookIssuer = name;
    }
    long[] createArrayToStoreBookNumber() {
        long[] arr = new long[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
    String getStatusOfBookIssuer(){
    	return statusOfBookIssuer;
    }
    void displayInfo() {
        System.out.println("Mobile Number:         " + mobNumber);
        System.out.println("Status of Book Issuer: " + statusOfBookIssuer);
        System.out.println("Name of Book Issuer:   " + nameOfBookIssuer);
    }
}

class Faculty {
    String name;
    String idNumber;
    String department;
    String facultyList[]={"A","a","B","b","C","c","D","d"};
    boolean isRegisteredFaculty(String name){
		for(int i=0;i<facultyList.length;i++){
			if(facultyList[i].equals(name)){
				return true;
			}
		}
		return false;
    }
    void setNameFaculty(String name) {
        this.name = name;
    }

    void setIdNumber(String id) {
        this.idNumber = id;
    }

    void setDepartment(String dept) {
        this.department = dept;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Department: " + department);
    }
}

class Student {
    String name;
    String registrationNumber;
    String branch;
    int year;
    String address;
String[] StudentList={"Dhanshri","Shruti","Mahesh","Satwik","ShivShankar","Ram","Pallvi","Anushka","Avika","Kiran"};
    void setName(String name) {
        this.name = name;
    }

    void setRegistrationNumber(String regNumber) {
        this.registrationNumber = regNumber;
    }

    void setStudentBranch(String branch) {
        this.branch = branch;
    }

    void setyearOfStudent(int year) {
        this.year = year;
    }

    void setAddressOfStudent(String address) {
        this.address = address;
    }
  boolean isRegistredStudent(String name){
		for(int i=0;i<StudentList.length;i++){
			if(StudentList[i].equals(name)){
				return true;
			}
		}
		return false;
   }
    boolean isValisRegistrationNumber(String num){
IsValidResNumber.IsValidRegistrationNumber obj1=new IsValidResNumber.IsValidRegistrationNumber();
		boolean res =obj1.validString(num);
		if(res==true){
			return true;
		}
		else{
			return false;
		}
    }
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Branch: " + branch);
        System.out.println("Year: " + year);
        System.out.println("Address: " + address);
    }
}

class Book {
    String name;
    String author;
    long publication;
    long edition;
    long bookNumber;
    long numberOfPages;
    long prize;
    String[] booksList={"python","c++","c","maths-4","DS","DAA","NT","OS","DBMS","ML","DL","MPI","DSD","GRAPHICS","CORE JAVA","M-1","M-2","M-3","M-4"};
    void setBookName(String bookName) {
        this.name =bookName;
    }
    void setAuthorName(String author) {
        this.author = author;
    }

    void setPublication(long publication) {
        this.publication = publication;
    }

    void setEdition(long edition) {
        this.edition = edition;
    }

    void setBookNumber(long bookNumber) {
        this.bookNumber = bookNumber;
    }

    void setNuberOfPages(long numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    void setPrizeOfBook(long prize) {
        this.prize = prize;
    }
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
    void displayInfo(){
  	System.out.println("\nBook Deatail....");
        System.out.println("Name: " +name);
        System.out.println("Author: " + author);
        System.out.println("Publication: " + publication);
        System.out.println("Edition: " + edition);
        System.out.println("Book Number: " + bookNumber);
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Prize: " + prize);
    }
}

class LibraryStaff {
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
    	void isBookIssued(Student s1,BasicInputOperations p1,Book b1,Faculty f1){
		if(b1.isAvaiableBook(b1.name)){	
			String s=p1.getStatusOfBookIssuer();
			if(s.equals("faculty")){
				System.out.println("Book  Having ->:");
				b1.displayInfo();
				System.out.println("\nIssued to ->:");
				f1.displayInfo();
			
			 }
			 else if(s.equals("student")){
				System.out.println("Book  Having ->:");
				b1.displayInfo();
				System.out.println("\nIssued to ->:");
			 	s1.displayInfo();			
			 }
			 else {
			 	System.out.println("Book canot be Issued to Outsider!!");
			 	
			 }
		  }
		  else{
		  	System.out.println("bye bye");
		  }
	}
	String[] returnBook(Student s1,BasicInputOperations p1,Book b1){
		Scanner pt1=new Scanner(System.in);
		System.out.println("Eneter Book Name->");
		String b_Name=pt1.nextLine();
		System.out.println("\nBook Returned  is ->:");
		String[] arr=b1.booksList;
		
		System.out.println(arr.length);
		int length=(arr.length)+1;
		
		String s[] =new String[length];
		System.out.println(length);
		for(int i=0;i<length-1;i++){
			s[i]=arr[i];
		}
			s[length-1]=b_Name;
			p1.getStatusOfBookIssuer();
			b1.displayInfo();
			System.out.println("\nReturned From->");

	        return s;		
	}
}
class inputRequireForDifferentMethod extends Book{
	Book b1			=new Book();
	Faculty f1		=new Faculty();
	Student s1		=new Student();
	LibraryStaff ls	        =new LibraryStaff();
	BasicInputOperations p1 =new BasicInputOperations();
	void inputForStudent(){
				p1.setStatusOfBookIssuer("student");
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter  name of Student:");
				String name1=sc.nextLine();
				s1.setName(name1);
				
				System.out.print("Enter registration/ID number->:");
				String regnum=sc.nextLine();
				s1.setRegistrationNumber(regnum);
				
				System.out.print("Enter DepartMent:");
				String branch=sc.nextLine();
				s1.setStudentBranch(branch);
				
				System.out.print("Enter Address ->:");
				String address=sc.nextLine();
				s1.setAddressOfStudent(address);
				
				System.out.print("Enter mobile Number->:");
				long mobnum=Long.parseLong(sc.nextLine());
				p1.setMobNumber(mobnum);

				System.out.print("Enter year student ->:");
				int year=Integer.parseInt(sc.nextLine());
				s1.setyearOfStudent(year);
				try{
					if(s1.isRegistredStudent(name1)==false){
						throw new NotRegisteredStudent("Student is Not Registered in Library...");
					}
					else if(s1.isValisRegistrationNumber(regnum)==false){
						throw new inValidRegNumber("Invalid Registration Number of Student...");
					}					
				}
				catch(NotRegisteredStudent |inValidRegNumber a){
					System.out.println(a);
				}
				
				/*try{
					if(s1.isValisRegistrationNumber(regnum)==false){
						throw new inValidRegNumber("Invalid Registration Number of Student...");
					}
				}
				catch(inValidRegNumber e){
					e.getMessage();
					System.out.println(e);
				}*/
							
	}
	void inputForBook(){
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter Book Name->:");
				String bookName=sc.nextLine();
				b1.setBookName(bookName);
				
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
				
				boolean res=b1.isAvaiableBook(bookName);
				try{
					if(res==false){
						throw new EnteredBookNotPresent("This Book is Not Present In Library...");	
					}
				}catch(EnteredBookNotPresent e){
					e.getMessage();
					System.out.println(e);
				}	
	}
	void inputForFaculty(){
				Scanner sc1=new Scanner(System.in);
				p1.setStatusOfBookIssuer("faculty");
				
				System.out.print("Enter  name of Faculty:");
				String facultyName=sc1.nextLine();
				f1.setNameFaculty(facultyName);
				
				System.out.print("Enter registration/ID number->:");
				String regnum=sc1.nextLine();
				s1.setRegistrationNumber(regnum);
				
				boolean validFaculty=f1.isRegisteredFaculty(facultyName);
				try{
					if(validFaculty==false){
						throw new NotRegisteredFaculty("Not Registered Faculty....");
					}
				}
				catch(NotRegisteredFaculty e){
					e.getMessage();
					System.out.println(e);
				}
	
	}
	void inputForStaff(){
				Scanner sc1=new Scanner(System.in);
				p1.setStatusOfBookIssuer("staff");
				
				System.out.print("Enter  name of Staff Member:");
				String staffName=sc1.nextLine();
				ls.setNameOfStaff(staffName);
				
				System.out.print("Enter registration/ID number->:");
				String id_ofStaff=sc1.nextLine();
				ls.setIdOfStaff(id_ofStaff);

	}	
}
class TransactionOfBook{
	Book b1			=new Book();
	Faculty f1		=new Faculty();
	Student s1		=new Student();
	LibraryStaff ls	        =new LibraryStaff();
	BasicInputOperations p1 =new BasicInputOperations();
	inputRequireForDifferentMethod  i_p=new inputRequireForDifferentMethod();
	
	void bookIssueByStudent(){
	//	i_p.inputForStudent();
		i_p.inputForBook();
		ls.isBookIssued(s1, p1,b1,f1);
		System.out.println("msg of Book issue");
		
	}
	void bookIssueByfaculty(){
		i_p.inputForFaculty();
		i_p.inputForBook();
		ls.isBookIssued(s1, p1,b1,f1);
		System.out.println("msg of Book issue");
	}
	void bookIssueByStaff(){
		
	
	}
	void returnBook(){
		i_p.inputForStudent();
		i_p.inputForBook();
		//ls.returnBook(s1, p1,b1);
	}
	void reNewTheBook(){
	
	
	
	}
}
class LibraryManagementSystem {
    public static void main(String[] args) {
        TransactionOfBook TOfB=new TransactionOfBook();
       	Scanner sc=new Scanner(System.in);
	Book b1= new Book();	
	LibraryStaff Ls=new LibraryStaff();
	Student s1=new Student();
	Faculty f1=new Faculty();
	BasicInputOperations p1=new BasicInputOperations();
	inputRequireForDifferentMethod inp=new inputRequireForDifferentMethod();
		//1.String choice="ReturnBook";
		String choice="IssueBookByStudent";
		//inp.inputForBook();
		//b1.displayInfo();		
		//inp.inputForStudent();
		//s1.displayInfo();
	        //Ls.isBookIssued(s1,p1, b1,f1);	
		//String choice="IssueBookByfaculty";
		//String choice="IsAvailableBook";
		switch (choice){
			case "IssueBookByStudent":
				TOfB.bookIssueByStudent();
				break;
			case "IssueBookByfaculty":
			 	TOfB.bookIssueByfaculty();
				break;
			case "ReturnBook":
				TOfB.returnBook();
				break;
			case "IsAvailableBook":
				b1.isAvaiableBook("DSD");
				break;
			default:
				System.out.println("Invalid choice");		
		}
        
		System.out.println(b1.isValidBooK("DSD"));
		System.out.println(b1.isAvaiableBook("DSD"));
		System.out.println(b1.isAvaiableBook(b1.name));	
		System.out.println("Book Name->"+b1.name);
        //sc.close();
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
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
      
