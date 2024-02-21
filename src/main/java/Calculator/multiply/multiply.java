package Calculator.multiply;

import java.util.Scanner;

public class multiply {
    public int mult(){

        Scanner sc = new Scanner(System.in);

        System.out.print("수를 입력해주세요. : ");
        int num1 = sc.nextInt();
        System.out.print("곱할 수를 입력해주세요. : ");
        int num2 = sc.nextInt();

        return num1 * num2;
    }
}
