package org.bobo.algorithm.sort;

/**
 * @author tian.xubo
 * @created 2019 - 05 - 08 13:48
 */
public class CountingSort extends BaseSort {
    public CountingSort(int[] array) {
        super(array);
    }

    @Override
    protected void sort() {
        int max = findMax()+1;
        int[] countArr = new int[max];
        int[] targetArr = new int[array.length];
        //计数
        for (int i = 0;i < array.length;i++){
            countArr[array[i]]++;
        }
        //统计 小于i的数总共有多少个，
        for(int i = 1;i < countArr.length;i++){
            countArr[i] = countArr[i-1] + countArr[i];
        }
        //填充 每个array[i]的排序后的位置。
        for (int i = array.length - 1;i >= 0;i--){
            countArr[array[i]] -- ;
            targetArr[countArr[array[i]]] = array[i];
        }
        //复制
        for(int i = 0;i<array.length;i++){
            array[i] = targetArr[i];
        }
    }
    private int findMax(){
        int max = 0;
        for (int i = 0 ;i < array.length;i++){
            max = array[i] >max?array[i]:max;
        }
        return max;
    }

    public static void main(String[] args) {
        int length = 20;
        int[] tmparr = generalArray(length);
        CountingSort countingSort = new CountingSort(tmparr);
        countingSort.sort();
        System.out.println("sorted array :");
        countingSort.printArray();
    }
}
