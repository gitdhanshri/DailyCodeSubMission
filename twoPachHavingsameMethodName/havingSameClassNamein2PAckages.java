import pack1.createPack1;
import pack2.createPack2;
class  havingSameName{
	public static void main(String args[]){
		//havingSameName obj1=new havingSameName();
		createPack1 ref1=new createPack1(22,12);
		createPack2 ref2=new createPack2(22,12);
		ref1.sum();
		ref2.sum();
	}
}
