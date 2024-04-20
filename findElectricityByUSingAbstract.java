/*abstract class plan {
	protected double rate;
	public abstract void getRate();
	public void calculateBill(int units){
		System.out.print("Bill Amounts for ->"+units+" units  : ");
		System.out.print(rate*units);
	}
}
class commercialplan extends plan{
	public void getRate(){
		this.rate=5.00;
	}
}
class DomesticPlan extends plan{
	public void getRate(){
		this.rate=2.60;
	}
}
class calculate{
	public static void main(String args[]){
		plan p;
		commercialplan c1 =new commercialplan();
		p=c1;
		p.getRate();
		p.calculateBill(250);
		System.out.println("\nFor Domestic use-->");
		DomesticPlan d1=new DomesticPlan();
		p=d1;
		p.getRate();
		p.calculateBill(250);
	}
}*/
abstract class plan {
	protected double rate;
	plan(double rate){
		this.rate=rate;
	}
	public abstract void getRate();
	public void calculateBill(int units){
		System.out.print("Bill Amounts for ->"+units+" units  : ");
		System.out.print(rate*units);
	}
}
class commercialplan extends plan{
	commercialplan(double m){
		super(m);
	}
	public void getRate(){
		this.rate=5.00;
	}
}
class DomesticPlan extends plan{
	DomesticPlan(double p){
		super(p);
	}
	public void getRate(){
		this.rate=2.60;
	}
}
class calculate{
	public static void main(String args[]){
		plan p;
		commercialplan c1 =new commercialplan(5);
		System.out.println("\nFor Domestic use-->");
		p=c1;
		p.calculateBill(250);
		
		
		System.out.println("\nFor Domestic use-->");
		DomesticPlan d1=new DomesticPlan(2.6);
		p=d1;
		p.getRate();
		p.calculateBill(250);
		System.out.println("\n");
	}
}
