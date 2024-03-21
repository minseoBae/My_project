package day05;

import java.util.Scanner;

public class SeqSearch {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("요솟수를 입력해주세요 : ");
        int input = scanner.nextInt();
        int[] arr = new int[input];

        for(int i = 0; i < input; i++){
            System.out.print("배열 x[" + i + "] : ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("배열에서 검색할 값을 입력해주세요 : ");
        int searchInput = scanner.nextInt();
        int index = findArr(arr, searchInput);

        if (index == -1) System.out.println("찾으시는 값은 배열에 존재하지 않습니다.");
        else System.out.println("찾으시는 값은 배열 x[" + index + "]에 존재합니다.");
    }

    public static int findArr(int[] arr, int searchInput) {
        for (int i = 0; i < arr.length; i++) if (arr[i] == searchInput) return i;
        return -1;
    }
}