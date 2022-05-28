package com.kiran.test.mt;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
 
// Class 1
// helper class
class MyForkJoin extends RecursiveTask<Integer> {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = -6840048942246110939L;
	// Global variables
    int array[];
    int start, end;
    int searchElement;
 
    // Constructor for initialising globals
    public MyForkJoin(int array[], int start, int end,
                      int searchElement)
    {
 
        // This keyword refers to current object itself
        this.array = array;
        this.start = start;
        this.end = end;
        this.searchElement = searchElement;
    }
 
    // Method
    // @Override
    protected Integer compute()
    {
 
        // Returns the count computed by processSearch
        return processSearch();
    }
 
    // Method
    // To count the the count of searched element
    private Integer processSearch()
    {
 
        // Initially count os set to zero
        int count = 0;
 
        // iterating using for loop
        for (int i = start; i <= end; i++) {
 
            // if element is present in array
            if (array[i] == searchElement) {
 
                // Increment the count
                count++;
            }
        }
 
        // Returning the count of searched element
        return count;
    }
    
    
    public static void main(String args[])
    {
 
        // Custom input array elements
        int array[] = { 1, 2, 6, 3,  4,  5,  6,
                        7, 8, 9, 10, 11, 12, 6 };
 
        // Custom element to be searched in array
        int searchElement = 6;
 
        // initializing starting and ending indices
        int start = 0;
        int end = array.length - 1;
 
        // Creating object of ForkJoinPool class
        ForkJoinPool pool = ForkJoinPool.commonPool();
 
        // Now creating object of above class
        MyForkJoin task = new MyForkJoin(array, start, end,
                                         searchElement);
        int result = pool.invoke(task);
 
        // Print and display the searched element
        // If found do display out the number of times it is
        // found
        System.out.println(searchElement + " found "
                           + result + " times ");
    }

}
