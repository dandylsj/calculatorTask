package Lv2_calculator;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;
/**
 *- [ ]  **App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)**
 *     - [ ]  간접 접근을 통해 필드에 접근하여 **가져올** 수 있도록 구현합니다. (Getter 메서드)
 *     - [ ]  간접 접근을 통해 필드에 접근하여 **수정할** 수 있도록 구현합니다. (Setter 메서드)
 *     - [ ]  위 요구사항을 모두 구현 했다면 App 클래스의 main 메서드에서 위에서 구현한 메서드를 활용 해봅니다.
 */
public class App {
    public static void main(String[] args) {
        Calculator calculator= new Calculator(); // Calculator 클래스를  calculator 변수에 집어넣는다.
        Scanner scanner  = new Scanner(System.in); //Scanner 클래스를 scanner 에 넣는다.

        while (true) {  //반복문을 사용하여 계속 계산
            // 첫번째 계산할 숫자 저장하기
            System.out.println("첫번째로 입력할 숫자를 넣으세요: ");
            int getFirstNumber = scanner.nextInt(); // 문자열 getFirstNumber 에 넣은 값을 정수형 firstNumber 변수에 넣는다.
            //사칙연산 기호 입력하고 저장하기
            System.out.println("계산할 사칙연산 기호를 입력하세요(ex:+, -, *, /): ");
            String setGetCalculation = scanner.next(); //calculation 변수의 값을 getCalculation 에 넣는다.
            // 두번째 계산할 숫자 저장하기
            System.out.println("두번째로 입력할 숫자를 넣으세요: ");
            int getSecondNumber = scanner.nextInt();//문자열 gerSecondNumber 에 넣은 값을 정수형 secondNumber 변수에 넣는다.
            switch (setGetCalculation) {
                case ("+"):
                    //Calculator 클래스의 addCalculate 메서드를 불러오고 저장한 첫번째 변수와 두번째 변수를 가져온다.
                    calculator.addCalculate(getFirstNumber, getSecondNumber);
                    break;
                case ("-"):
                    //Calculator 클래스의 substringCalculate 메서드를 불러오고 저장한 첫번째 변수와 두번째 변수를 가져온다.
                     calculator.substringCalculate(getFirstNumber, getSecondNumber);
                    break;
                case ("*"):
                    //Calculator 클래스의 multiplierCalculate 메서드를 불러오고 저장한 첫번째 변수와 두번째 변수를 가져온다.
                    calculator.multiplierCalculator(getFirstNumber, getSecondNumber);
                    break;
                case ("/"):
                    //두번째 정수의 값이 0 이면 입력할 수 없다는 경고가 뜬다.
                    if (getSecondNumber == 0) {  //try catch문을 사용하여 예외처리도 가능하다.
                        System.out.println("0은 입력할 수 없습니다.");
                        break;
                    } else {
                        //Calculator 클래스의 divisionCalculate 메서드를 불러오고 저장한 첫번째 변수와 두번째 변수를 가져온다.
                        calculator.divisionCalculator(getFirstNumber, getSecondNumber);
                        break;
                    }
                default:
                    System.out.println("잘못된 입력값 입니다.");
            }

            System.out.println("연산결과: " + calculator.getResult()); //결과값 출력 Calculator 클래스의 result 변수를 가져온다.

            System.out.println("저장된 리스트: "+ calculator.getResultList()); //저장한 값들을 출력하기

            scanner.nextLine();
            System.out.println("삭제하시려면 데이터의 배열 숫자를 입력하고 ex.0,1,2...,다음단계로 넘어가려면 n을 눌러주세요");
            String deleteResult = scanner.next();
                if (deleteResult.equals("n")) { //"n" 을 입력하면 if문을 빠져나오고 그외의 숫자는 삭제
                } else {calculator.deleteResultList(Integer.parseInt(deleteResult)); //parseInt 는 string 타입을 int 로 변환
            }
            System.out.println(calculator.getResultList()); //calculator 클래스의 getResultList 값을 출력
            scanner.nextLine();
            System.out.println("더 계산하시려면 아무키나 ,종료하려면 exit 를 입력하세요");
            String getContinue = scanner.nextLine(); //입력값을 getContinue에 집어넣는다.

            if("exit".equals(calculator.setGetContinue(getContinue))){ //exit를 입력하면 calculator의 setGetContinue에 저장된 것을 불러온다.
                System.exit(0); //exit 를 입력하면 시스템 종료
            }
        }
    }
}
