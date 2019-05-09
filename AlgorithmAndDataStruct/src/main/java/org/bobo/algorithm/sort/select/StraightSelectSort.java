package org.bobo.algorithm.sort.select;

import org.bobo.algorithm.sort.BaseSort;

import java.util.Random;

/**
 * @author tian.xubo
 * @created 2019 - 05 - 06 9:48
 */
public class StraightSelectSort extends BaseSort {

    public StraightSelectSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for(int i = 0;i < array.length; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int j = i;j < array.length;j++){
                if(array[j] < min){
                    min = array[j];
                    minIndex = j;
                }
            }
            swap(i,minIndex);
        }
    }

    public static void main(String[] args) {
        int length = 20;
        int[] tmparr = new int[length];
        Random random = new Random();
        for(int i = 0;i < length;i++){
            tmparr[i] = random.nextInt(100);
        }
        System.out.println("origin array :");
        for(int i = 0;i < length;i++){
            System.out.print(tmparr[i]+" ");
        }
        System.out.println();
        StraightSelectSort selectSort = new StraightSelectSort(tmparr);
        selectSort.sort();
        System.out.println("sorted array :");
        selectSort.printArray();
    }
}
