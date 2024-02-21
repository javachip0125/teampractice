package Calculator.divide;

import java.util.Scanner;

public class Divide {




    public int divide () {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        System.out.println("0을 넣으면 프로그램이 강제종료 됩니다.");
        System.out.print("정수를 입력하세요 : ");
        int num1 = sc.nextInt();
    if (num == 0 || num1 == 0) {
        throw new IllegalArgumentException("0을 넣을수 없습니다.");
    }


        return num/num1;


    }
}
