package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요 : ");
        int size = sc.nextInt();
        sc.nextLine(); 

        String[] arr = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + "번째 문자열 : ");
            arr[i] = sc.nextLine();
        }

        while (true) {
            System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
            String answer = sc.next();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.print("더 입력하고 싶은 개수 : ");
                int ac = sc.nextInt();
                
                String[] newArr = Arrays.copyOf(arr, arr.length + ac);

                for (int i = arr.length; i < newArr.length; i++) {
                    System.out.print((i + 1) + "번째 문자열 : ");
                    newArr[i] = sc.next();
                }
                arr = newArr; 

            } else if (answer.equalsIgnoreCase("N")) {
                for (String s : arr) {
                    System.out.println(s);
                }
                break; 
            } else {
                System.out.println("입력할 수 없는 값입니다.");
            }
            System.out.println(); 
        }

        sc.close();
    }
}