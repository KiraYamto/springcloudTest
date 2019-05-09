package org.bobo.algorithm.sort.swap;

import org.bobo.algorithm.sort.BaseSort;

/**
 * @author tian.xubo
 * @created 2019 - 05 - 05 15:53
 */
public class BubbleSort extends BaseSort {

    public BubbleSort(int[] array) {
        super(array);
    }

    @Override
    public void sort(){
        if(array == null){
            System.out.println("array is null,sort exit");
            return;
        }
        if(array.length == 1){
            return;
        }
        for(int i = 0;i < array.length;i++){
            for(int j = 0;j < array.length - i - 1;j++){
                if(array[j] > array[j+1]){
                    swap(j,j+1);
                }
            }
        }
    }

    @Override
    public void sortImprove(){
        if(array == null){
            System.out.println("array is null,sort exit");
            return;
        }
        if(array.length == 1){
            return;
        }

        for(int i = 0;i < array.length;i++){
            boolean singal = false;
            for(int j = 0;j < array.length - i - 1;j++){
                if(array[j] > array[j+1]){
                    swap(j,j+1);
                    singal = true;
                }
                if(!singal){
                    System.out.println("break");
                    break;
                }
            }
        }
    }



    public static void main(String[] args) {
        System.out.println();
        int length = 20;
        int[] tmparr = BubbleSort.generalArray(length);
        BubbleSort bubbleSort = new BubbleSort(tmparr);
        bubbleSort.sort();
        System.out.println("sorted array :");
        bubbleSort.printArray();
    }
}
