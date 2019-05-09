package org.bobo.algorithm.sort.insert;

import org.bobo.algorithm.sort.BaseSort;

/**
 * @author tian.xubo
 * @created 2019 - 05 - 07 9:49
 */
public class ShellSort extends BaseSort {

    public ShellSort(int[] array) {
        super(array);
    }

    @Override
    protected void sort() {
        int  h = 0;
        //希尔增量，各种形式都可以
        while (h < array.length){
            h = 3 * h + 1;
        }
        while (h >= 1){
            for(int  i = h;i < array.length; i++ ){
                int j = i - h;
                int temp = array[i];
                while (j >= 0 && array[j] > temp){
                    array[j+h] = array[j];
                    j = j - h;
                }
                array[j+h] = temp;
            }
            h = (h - 1)/3;
        }
    }

    public static void main(String[] args) {
        int length = 30;
        int[] tmparr = ShellSort.generalArray(length);
        ShellSort shellSort = new ShellSort(tmparr);
        shellSort.sort();
        System.out.println("sorted array :");
        shellSort.printArray();
    }
}
