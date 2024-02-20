package ch19_SortAlgorithm;

import java.util.Scanner;

public class Ch19_Ex01_BubbleSort {
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

        for(int i = 0; i < sortArr.length; i++){
            System.out.println(i + "번째 정렬");
            for(int j = 0; j < sortArr.length - i - 1; j++){
                if(sortArr[j] > sortArr[j+1]){
                    temp = sortArr[j];
                    sortArr[j] = sortArr[j+1];
                    sortArr[j+1] = temp;
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
