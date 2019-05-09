package org.bobo.sort;

import java.util.Random;

/**
 * @author tian.xubo
 * @created 2019 - 05 - 05 16:46
 */
public class BaseSort {

    protected int[] array;

    public BaseSort(int[] array) {
        this.array = array;
    }

    protected void sort(){

    }
    protected void sortImprove(){

    }
    protected void swap(int first,int second){
        int tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }
    protected void printArray(){
        for(int i = 0;i < array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    protected static int[] generalArray(int length){
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
        return tmparr;
    }
    protected static int[] generalArrayWithMax(int length,int max){
        int[] tmparr = new int[length];
        Random random = new Random();
        for(int i = 0;i < length;i++){
            tmparr[i] = random.nextInt(max);
        }
        System.out.println("origin array :");
        for(int i = 0;i < length;i++){
            System.out.print(tmparr[i]+" ");
        }
        System.out.println();
        return tmparr;
    }
}
