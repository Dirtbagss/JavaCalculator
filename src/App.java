import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //Calculator 클래스 생성자
        Calculator calculator = new Calculator();

        // while문을 작동 or 종료시킬지 정할 전역변수
        boolean onOff = true;

        double result = 0;


        Scanner sc = new Scanner(System.in);

        // 계산기 작동 코드
        while (onOff) {

            System.out.print("첫번째 수를 입력 하세요. : ");
            int firstNum = sc.nextInt();


            System.out.print("연산자를 입력하세요.(+ , - , *, /) : ");
            char operator = sc.next().charAt(0);


            System.out.print("두번째 수를 입력 하세요. : ");
            int secondNum = sc.nextInt();

            //연산자에 따라서 실행결과가 달라지는 switch문
            switch (operator) {
                case '+':
                    calculator.setOperation(new AddOperation());  //Calculator 클래스의 메소드를 덧셈용으로 설정
                    result = calculator.calculate(firstNum, secondNum); // 결과값을 입력받은 변수들로 calculate 메소드를 이용하여 result 변수에 담는 과정
                    calculator.printResults(result); // 결과값을 입력받아 출력문을 작성해주는 메소드

                    onOff = calculator.onOff(sc.next()); // 문자를 입력받아 while문의 on/off 를 정하는 메소드

                    break;

                case '-':
                    calculator.setOperation(new SubstractOperation());
                    result = calculator.calculate(firstNum, secondNum);
                    calculator.printResults(result);

                    onOff = calculator.onOff(sc.next());

                    break;

                case '*':
                    calculator.setOperation(new MultiplyOperation());
                    result = calculator.calculate(firstNum, secondNum);
                    calculator.printResults(result);
                    onOff = calculator.onOff(sc.next());

                    break;

                case '/':
                    calculator.setOperation(new DivideOperation());
                    result = calculator.calculate(firstNum, secondNum);
                    calculator.printResults(result);
                    onOff = calculator.onOff(sc.next());

                    break;

            }


        }


    }


}

