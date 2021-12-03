package Chapter3._3C;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final String MENU =
                "시작화면"
                + System.lineSeparator()
                + System.lineSeparator() + "[메뉴선택]"
                + System.lineSeparator() + "1. 회원 관리"
                + System.lineSeparator() + "2. 과목 관리"
                + System.lineSeparator() + "3. 수강 관리"
                + System.lineSeparator() + "4. 결제 관리"
                + System.lineSeparator() + "5. 종료"
                + System.lineSeparator() + "입력 → ";

        boolean isContinue = true;

        while( isContinue ) {

            System.out.print(MENU);
            int caseNumber = scanner.nextInt();

            switch( caseNumber ) {
                case 1 :
                    System.out.println("회원 관리 메뉴를 선택했습니다.");
                    break;
                case 2 :
                    System.out.println("과목 관리 메뉴를 선택했습니다.");
                    break;
                case 3 :
                    System.out.println("수강 관리 메뉴를 선택했습니다.");
                    break;
                case 4 :
                    System.out.println("결제 관리 메뉴를 선택했습니다.");
                    break;
                case 5 :
                    System.out.println("프로그램을 종료합니다.");
                    isContinue = false;
                    break;
            }
        }
    }
}
