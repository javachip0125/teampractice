package Calculator.minus;

import java.util.Scanner;

public class Minus {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    while (true) {
      System.out.println("============= 사칙 연산 계산기 =============");
      System.out.println();
      System.out.println("1. 덧셈");
      System.out.println("2. 뺄셈");
      System.out.println("3. 곱셈");
      System.out.println("4. 나눗셈");
      System.out.println("5. 나머지 구하기");
      System.out.println("6. 계산기 종료");
      System.out.println();
      System.out.print("사칙연산 메뉴 번호를 선택해주세요. : ");
      int menuNum = sc.nextInt();


      switch (menuNum) {
        case 1 :

          break;
        case 2 :
          subtract();
          break;
        case 3 :
          break;
        case 4 :
          break;
        case 5 :
          break;
        default :
          System.out.println("사칙연산 메뉴 번호를 잘못입력하셨습니다.");
          break;
      }

      if (menuNum == 6) {
        System.out.println("프로그램을 종료합니다.");
        break;
      }

    }
  }
  public static void subtract() {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫번째 숫자를 입력해주세요 : ");
    int firstNum = sc.nextInt();
    System.out.print("두번째 숫자를 입력해주세요 : ");
    int secondNum = sc.nextInt();

    System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
  }
}
