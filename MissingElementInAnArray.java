package assignment;

import java.util.Arrays;

public class MissingElementInAnArray
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		int length=arr.length;

		Arrays.sort(arr);
		for(int i=1;i<length;i++)
		{
				if(i!=arr[i-1])
				{

					System.out.println(i);
					break;			 

				}
				

			}

			
		}

	}
