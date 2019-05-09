package org.bobo.algorithm.sort.select;

import org.bobo.algorithm.sort.BaseSort;

/**
 * @author tian.xubo
 * @created 2019 - 05 - 06 10:09
 */
public class HeapSort extends BaseSort {
    public HeapSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        buildInitMaxHeap();
        for(int i = 0;i < array.length ;i++){
            int heapSize = array.length - i - 1;
            swap(0,heapSize);
            heapAdjust(0,heapSize);
        }

    }
    public void buildInitMaxHeap(){
        for(int i = array.length/2 - 1;i >= 0 ;i--){
            heapAdjust(i,array.length);
        }
        System.out.println("build max heap is:");
        printArray();
    }
    public void heapAdjust(int adjIndex,int length){
        if(array == null){
            return;
        }
        if(array.length == 1){
            return;
        }
        int leftChildIndex = 2 * adjIndex + 1;
        int rightChildIndex = 2 * adjIndex + 2;
        int maxIndex = adjIndex;
        if(leftChildIndex < length && array[maxIndex] < array[leftChildIndex]){
            maxIndex = leftChildIndex;
        }
        if(rightChildIndex < length && array[maxIndex] < array[rightChildIndex]){
            maxIndex = rightChildIndex;
        }
        if(adjIndex != maxIndex){
            swap(adjIndex,maxIndex);
            heapAdjust(maxIndex,length);
        }
    }

    public static void main(String[] args) {
        int length = 10;
        int[] tmparr = HeapSort.generalArray(length);
        HeapSort heapSort = new HeapSort(tmparr);
        heapSort.sort();
        System.out.println("sorted array :");
        heapSort.printArray();
    }
}
