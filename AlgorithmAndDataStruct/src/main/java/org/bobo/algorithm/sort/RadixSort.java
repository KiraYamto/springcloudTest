package org.bobo.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tian.xubo
 * @created 2019 - 05 - 09 15:44
 */
public class RadixSort extends BaseSort {
    public RadixSort(int[] array) {
        super(array);
    }

    @Override
    protected void sort() {
        int max = findMax();
        int bucketNum = reflectIndex(max) + 1;
        List<Integer>[] bukets = new ArrayList[bucketNum];
        for(int i = 0;i < array.length; i++){
            int index = reflectIndex(array[i]);
            if(bukets[index] == null){
                bukets[index] = new ArrayList<Integer>();
            }
            bukets[index].add(array[i]);
        }
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i = 0 ;i<bukets.length;i++){
            if(bukets[i] != null){
                bukets[i].sort(null);
                System.out.println(bukets[i]);
                tmp.addAll(bukets[i]);
            }

        }
        Object[] tmparr = tmp.toArray(new Integer[tmp.size()]);
        for(int i = 0 ;i < array.length;i++){
            array[i] =(int)tmparr[i];
        }

    }
    protected int findMax(){
        int max = 0;
        for (int i = 0 ;i < array.length;i++){
            max = array[i] >max?array[i]:max;
        }
        return max;
    }
    private int reflectIndex(int element){
        int radix = 0;
        element = element/10;
        while(element > 0){
            radix++;
            element = element/10;
        }
        return radix;
    }

    public static void main(String[] args) {
        int length = 20;
        int[] tmparr = RadixSort.generalArray(length);
        RadixSort radixSort = new RadixSort(tmparr);
        radixSort.sort();
        System.out.println("sorted array :");
        radixSort.printArray();
    }
}
