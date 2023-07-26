package Sorting;

public class SelectionSort {

	public static int sSort(int[] arr) {
		int i,j,temp;
		
		for(i=0;i<arr.length-1;i++) {
			int minI=i;
			for(j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minI]) {
					minI=j;
				}
			}
			temp=arr[minI];
			arr[minI]=arr[i];
			arr[i]=temp;
		}
		return -1;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int[] arr= {1,5,8,3,2,7,0};
				
				System.out.println("Array Before Sort : ");
				for(int num: arr) {
					System.out.println(num);
				}
				
				System.out.println("Array After sort :");
				sSort(arr);
				for(int num: arr) {
					System.out.println(num);
				}
	}

}
