/**
 * @author Matt Russotti
 *Date: Apr 8, 2020
 *Assignment: MARSearch.java
 */

/**
 * @author Russotti
 *
 */
public class MARSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] nums=new int [10];
		nums[0]=20;
		nums[1]=21;
		nums[2]=36;
		nums[3]=50;
		nums[4]=31;
		nums[5]=4;
		nums[6]=25;
		nums[7]=35;
		nums[8]=32;
		nums[9]=26;

		System.out.println("Unsorted List");
		for (int i=0;i<nums.length;i++) {
			   System.out.println(nums[i]);
		   }
		System.out.println();

		int [] nums2=new int [10];
		nums2[0]=4;
		nums2[1]=20;
		nums2[2]=21;
		nums2[3]=25;
		nums2[4]=26;
		nums2[5]=31;
		nums2[6]=32;
		nums2[7]=35;
		nums2[8]=36;
		nums2[9]=50;
	
		
		System.out.println();

		System.out.println("Sorted List");
		for (int i=0;i<nums2.length;i++) {
			   System.out.println(nums2[i]);
		   }
		
		
		System.out.println();

		
		System.out.println(50+" is at location "+binarySearch(nums2,50, 0, nums2.length-1)+", using binary search");
		System.out.println();
		System.out.println(25+" is at location "+linearSearch(nums,25)+", using linear search");
	}

	/**
	 * This method uses binary sort to organize the method in alhabetical order
	 * @param elements- list of numbers that is being organized
	 * @param start- start of the array
	 * @param end- end of the array
	 * @param target- the number we are looking for
	 * @return- the index of target
	
	 */
	public static int binarySearch(int[] elements, int target, int start, int end) {
		int left=0;
		int right=elements.length-1;
		System.out.println("Entering binary search from indexes "+start+" to "+end);

		while(left<=right) {
			
			int middle = (left+right)/2;
			System.out.println("Examining index "+ middle+" which contains "+elements[middle]);

			if(target==elements[middle]) {
				
				System.out.println("Exiting binary search");
				return middle;
		
		
			}else if (target<elements[middle]) {
				System.out.println("Recursing on the first half");
				right=middle-1;
				System.out.println("Entering binary search from indexes "+start+" to "+right);

			}else if (target>elements[middle]) {
				left=middle +1;
				System.out.println("Recursing on the last half");
				System.out.println("Entering binary search from indexes "+left+" to "+end);

			}
		}
		System.out.println("Exiting binary search");
		return -1;
		
	}
	
	
	
	
	/**
	 * This method uses linear sort to organize the method in alhabetical order
	 * @param arr- list of numbers that is being organized
	 * @param key- the number we are looking for
	 * @return- the index of target
	
	 */
	
	public static int linearSearch(int[] arr, int key) {
		System.out.println("Entering linear search");

		for (int i=0; i<arr.length; i++) {
			System.out.println("Examining index "+ i+" which contains "+arr[i]);
			if (arr[i]==key) {
				System.out.println("Exiting linear search");
				return i;
			}
		}
		System.out.println("Exiting linear search");
		return -1;
	}
	
	
	
	
	
	
	
	
	
}
/*
 * Bianary search works most efficiently on large sorted arrays, it is significantly more efficient than linear search but it has some
 * parameters to make it work. Linear search works on any array but is slower than bianary search.
 * 
 * 
 * 
 */
