package org.bobo.algorithm.sort;

import java.util.Arrays;

/**
 * @author tian.xubo
 * @created 2019 - 05 - 07 11:14
 */
public class MergeSort extends BaseSort {
    public MergeSort(int[] array) {
        super(array);
    }

    @Override
    protected void sort() {
       mergeSort(0,array.length-1);
    }
    private void mergeSort(int start,int end){
        if(end - start < 1){
            return ;
        }
        int midIndex = (end + start) / 2;
        mergeSort(start,midIndex);
        mergeSort(midIndex+1,end);
        merge(start,midIndex,end);
    }
    private void merge(int start,int mid,int end){

        int length = end - start + 1;
        int[] result = new int[length];
        int resultIndex = 0;
        int leftFirst = start;
        int rightFirst = mid + 1;
        while (leftFirst <= mid && rightFirst <= end){
            result[resultIndex++] = array[leftFirst]<= array[rightFirst]?array[leftFirst++]:array[rightFirst++];
        }
        while (leftFirst <= mid ){
            result[resultIndex++] = array[leftFirst++];
        }
        while (rightFirst <= end){
            result[resultIndex++] = array[rightFirst++];
        }
        System.out.println(Arrays.toString(result));
        for (int  i = 0;i < length;i++){
            array[start+i] = result[i];
        }
    }

    public static void main(String[] args) {
        int length = 15;
        int[] tmparr = generalArray(length);
        MergeSort mergeSort = new MergeSort(tmparr);
        mergeSort.sort();
        System.out.println("sorted array :");
        mergeSort.printArray();
    }

}
