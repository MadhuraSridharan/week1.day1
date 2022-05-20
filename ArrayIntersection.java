package Assignment;

public class ArrayIntersection {

	public static void main(String[] args) {
		int[] arr= {3,2,11,4,6,7};
		int[] arr1={1,2,8,4,9,7};
		int length=arr.length;
		int len=arr1.length;
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(arr[i]==arr1[j])
					System.out.println(arr[i]);
			}
		}

	}

}
