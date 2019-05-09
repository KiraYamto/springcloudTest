package org.bobo.sort.swap;

import org.bobo.sort.BaseSort;

import java.util.Random;

/**
 * @author tian.xubo
 * @created 2019 - 05 - 05 16:45
 */
public class QuickSort extends BaseSort {

    public QuickSort(int[] array) {
        super(array);
    }

    public int partition(int left,int right){
        int pivot = array[right];
        int tail = left - 1;
        //除标准pivot外的所有元素，把所有比pivot小的丢到左边，然后把基准放到这些数的后一个
        //right前面的元素，小于right的都丢到数组前面，然后把right放到这些值的后一位，返回该下标
        for(int i = left; i < right && i >= left;i++){
            if(array[i] < pivot){
                tail++;
                swap(tail,i);
            }
        }
        swap(++tail,right);
        return tail;
    }
    @Override
    public void sort() {
        int left = 0;
        int right = array.length - 1;
        recursion(left,right);
    }
    public void recursion(int left,int right){
        if(array == null){
            System.out.println("array is null,sort exit");
            return;
        }
        if(array.length == 1){
            return;
        }
        if(left > right){
            return;
        }
        int pivotIndex = partition(left,right);

        recursion(left,pivotIndex-1);
        recursion(pivotIndex+1 ,right);
    }

    @Override
    public void sortImprove() {
        if(array == null){
            System.out.println("array is null,sort exit");
            return;
        }
        if(array.length == 1){
            return;
        }
    }
    public static void main(String[] args) {
        int length = 10000;
        int[] tmparr = new int[length];
        Random random = new Random();
        for(int i = 0;i < length;i++){
            tmparr[i] = random.nextInt(10000);
        }
        System.out.println("origin array :");
        for(int i = 0;i < length;i++){
            System.out.print(tmparr[i]+" ");
        }
        System.out.println();
        QuickSort quickSort = new QuickSort(tmparr);
        long a = System.currentTimeMillis();
        quickSort.sort();
        System.out.println("cost time :"+(System.currentTimeMillis()-a) +" ms");
        System.out.println("sorted array :");
        for(int i = 0;i < length;i++){
            System.out.print(quickSort.array[i]+" ");
        }
    }
}
