package Assignment;

public class Fibonnaciseries {

	public static void main(String[] args) {
		int a=0,b=1,c,num=8;
		System.out.print(a+" "+b);
		for(int i=0;i<num-2;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
