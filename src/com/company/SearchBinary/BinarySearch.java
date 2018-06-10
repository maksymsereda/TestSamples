package com.company.SearchBinary;

public class BinarySearch {
    // Returns index of x if it is present in arr[l..r], else return -1
    int binarySearch(int arr[], int low, int high, int x) {
        if (high>=low)
        {
            int mid = low + (high - low)/2;

            // If the element is present at the middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, low, mid-1, x);
                //return high=mid -1;

            // Else the element can only be present in right subarray
            return binarySearch(arr, mid+1, high, x);
            //return low=mid +1;
        }

        // We reach here when element is not present in array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch search = new BinarySearch();
        int arr[] = {2,3,4,10,40,44};
        int n = arr.length;
        int x = 44;
        int result = search.binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " +
                    result);
    }
}