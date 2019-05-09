package org.bobo.algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tian.xubo
 * @created 2019 - 05 - 08 15:17
 */
public class BucketSort extends BaseSort {
    //思想：确定多少个桶，确定每个桶的边界，把所有数值分别丢到各个桶里
    private int bucketNum = 10;
    public BucketSort(int[] array) {
        super(array);
    }

    public BucketSort(int[] array, int bucketNum) {
        super(array);
        this.bucketNum = bucketNum;
    }

    @Override
    protected void sort() {
        int max = findMax();
        int bucketRange = max/bucketNum;//500 /20 =25
        List<Integer> [] bukets = new ArrayList[bucketNum];
        for(int i = 0;i < array.length; i++){
            int index = array[i]/bucketRange >= bucketNum?bucketNum - 1 : array[i]/bucketRange;
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

    public static void main(String[] args) {
        int length = 20;
        int[] tmparr = generalArrayWithMax(length,100);
        BucketSort bucketSort = new BucketSort(tmparr);
        bucketSort.sort();
        System.out.println("sorted array :");
        bucketSort.printArray();


    }
}
