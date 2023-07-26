package Sorting;

public class InsertionSort {

	
	public static void  InsertionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
		
			while(j >0 && arr[j]>key) {
				arr [j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=key;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,3,7,8,4,6,4};
		
		System.out.println("Array before sort :");
		for(int num : arr) {
			System.out.println(num +" ");
		}
		
		System.out.println("Array After sort :");
		InsertionSort(arr);
		for(int num:arr) {
			System.out.println(num +" ");
		}
	}

}
