package com.example.sort;

public class InsertSort {
    public static int[] insertSort(int[] src){
        int[] target=new int[src.length+1];
        System.arraycopy(src,0,target,1,src.length);//arraycopy
        int j=0;
        for (int i = 2; i < src.length+1; i++) {
            target[0]=target[i];
            if(target[i]<target[i-1]){
                for (j=i-1;target[j]>target[0];j--){
                    target[j+1]=target[j];
                }
                target[j+1]=target[0];
            }
        }

        return target;
    }//
    public static void main(String[] args) {
        for(int i : insertSort(new int[]{1,2,4,1,6,3,5})){
            System.out.println(i);
        }
    }
}
