package com.example.sort;

public class SimpleSort {
    public static int[] sort(int[] src){
        //find the minuim value fangzai diyiwei
        int min=0;
        int tmp;
        for (int i = 0; i < src.length; i++) {
            min=i;
            for (int j = src.length-1; j > i ; j--) {
                if(src[j]<src[min]){
                    min=j;
                }
            }
            if(src[i]!=src[min]){
                tmp=src[i];
                src[i]=src[min];
                src[min]=tmp;
            }
        }
        return src;
    }
    public static void main(String[] args) {
        int[] a={1,5,6,8,2,1};

        for(int i:sort(a)){
            System.out.println(i);
        }
    }
}
