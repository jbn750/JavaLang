package ch19_SortAlgorithm;

import java.util.Scanner;

public class Ch19_Ex02_InsertSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] sortArr = new int[10];
        int temp = 0;

        for(int i = 0; i < sortArr.length; i++){
            sortArr[i] = scan.nextInt();
        }

        System.out.println("정렬 전");
        for(int i = 0; i < sortArr.length; i++){
            System.out.print("[" + sortArr[i] + "]" + " ");
        }
        System.out.println();
        System.out.println();

        for(int i = 1; i < sortArr.length; i++){
            System.out.println(i + "번째 정렬");
            for(int j = i; j > 0; j--){
                if(sortArr[j-1] > sortArr[j]){
                    temp = sortArr[j-1];
                    sortArr[j-1] = sortArr[j];
                    sortArr[j] = temp;
                }
            }
            for(int k = 0; k < sortArr.length; k++){
                System.out.print("[" + sortArr[k] + "]" + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("정렬 후");
        for(int i = 0; i < sortArr.length; i++){
            System.out.print("[" + sortArr[i] + "]" + " ");
        }
    }
}
