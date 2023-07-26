package Sorting;

public class BubbleSort {

	public static int bubbleSort(int[] arr) {
		int i,j,temp;
		for(i=0;i<arr.length;i++) {
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		int[]arr= {10,20,80,50,40,30};
		
		System.out.println("Before Sort : ");
		for(int num: arr) {
			System.out.println(num + " ");
		}
		
		System.out.println("Array After Sort : ");
	     bubbleSort(arr);
	     for(int num:arr) {
	    	 System.out.println(num + " ");
	     }
		
	}

}
