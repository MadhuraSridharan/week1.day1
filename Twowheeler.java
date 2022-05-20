package Assignment;

public class Twowheeler {

	int noOfWheels=4;
	short noOfMirrors=2;
	long chassisNumber=86264930;
	boolean isPunctured=false;
	String bikeName="RoyalEnfield";
	double runningKM=24.5;

	public static void main(String[] args) {
		
		Twowheeler obj=new Twowheeler();
		System.out.println(obj.noOfWheels);
		System.out.println(obj.noOfMirrors);
		System.out.println(obj.chassisNumber);
		System.out.println(obj.isPunctured);
		System.out.println(obj.bikeName);
		System.out.println(obj.runningKM);
		
	}

}
