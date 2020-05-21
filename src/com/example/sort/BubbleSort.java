package com.example.sort;
public class BubbleSort {
    public static int[] sort(int[] src){
        int[] target=src;
        int tmp;
        int j;
        for (int i = 0; i <=target.length-1 ; i++) {
            j=target.length-1;//the end of the array
            while(j!=i){
                if(target[j]<target[j-1]){
                    tmp=target[j];
                    target[j]=target[j-1];
                    target[j-1]=tmp;//swap
                    j--;
                }
                else {
                    j--;
                }
            }
        }//idaibiao maopao n ci
        return target;
    }
    public static void main(String[] args) {
        for(int i:sort(new int[]{1,6,3,6,2,8,4})){
            System.out.println(i);
        }
    }
}
