package org.bobo.algorithm.sort.insert;

import org.bobo.algorithm.sort.BaseSort;

/**
 * @author tian.xubo
 * @created 2019 - 05 - 06 15:59
 */
public class StraightInsertSort extends BaseSort {

    public StraightInsertSort(int[] array) {
        super(array);
    }

    @Override
    protected void sort() {
        for(int i = 1;i<array.length;i++){
            int curElement = array[i];
            for(int j = i-1;j>=0; j--){
                if(curElement < array[j]){
                    swap(j+1,j);
                }else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int  length = 20;
        int[] tmparr = StraightInsertSort.generalArray(length);
        StraightInsertSort insertSort = new StraightInsertSort(tmparr);
        insertSort.sort();
        System.out.println("sorted array :");
        insertSort.printArray();
    }
}
