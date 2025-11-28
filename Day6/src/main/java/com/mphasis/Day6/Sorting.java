package com.mphasis.Day6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	public static final Scanner sc = new Scanner(System.in);

	public static void linearSearch(int[] arr) {
		System.out.println("Enter element to be searched :");
		int ele = sc.nextInt();
		int i = 0;
		for (; i < arr.length; i++) {
			if (arr[i] == ele) {
				System.out.println("Element found at index " + i);
				break;
			}
		}
		if (i == arr.length)
			System.err.println("Element does not exist in the array!!");
	}

	public static void binarySearch(int arr[]) {
		int low = 0, high = arr.length - 1;
		System.out.println("Enter element to be searched :");
		int ele = sc.nextInt();

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == ele) {
				System.out.println("Element found at index " + (mid + 1));
				break;
			} else if (arr[mid] > ele)
				high = mid - 1;
			else
				low = mid + 1;
		}

		if (low > high)
			System.err.println("Element does not exist in the array!!");
	}

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int mini = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] > arr[mini]) {
					mini = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[mini];
			arr[mini] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int mini = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > mini) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = mini;

		}
		System.out.println(Arrays.toString(arr));
	}
	static void merge(int[] nums, int low, int mid, int high) {
         ArrayList<Integer> temp= new ArrayList<Integer>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high){
            if(nums[left]<=nums[right]){
                temp.add(nums[left++]);
            }else{
                temp.add(nums[right++]);
            }
        }
        while(left<=mid){
            temp.add(nums[left++]);
        }
        while(right<=high){
            temp.add(nums[right++]);
        }
        for(int i=low;i<=high;i++){
            nums[i]=temp.get(i-low);
        }
    }
	static void mergeSort(int[] nums, int low, int high) {
        if (low == high)
            return;
        int mid = (low + high) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
        
    }

	public static void main(String[] args) {
		int[] arr = { 2, 9, 7, 3, 6, 4, 1, 59, 465, 32, 78, 4658, 34658, 465, 65, 467, 483 };
//		linearSearch(arr);
//		Arrays.sort(arr);
//		binarySearch(arr);
//		bubbleSort(arr);
//		selectionSort(arr);
//		insertionSort(arr);
		 mergeSort(arr, 0, (arr.length-1));
		 System.out.println(Arrays.toString(arr));
	}

}
