import java.util.ArrayList;

public class Calculator {

    private AbstractOperation operation;

    private ArrayList<Double> results = new ArrayList<>();


    public Calculator(){}


    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(int firstNum, int secondNum) {
        double answer = operation.operate(firstNum, secondNum);
        results.add(answer);
        return answer;
    }



    public void printResults(double result) {

        System.out.println("--------------------------------------------------------------------");
        System.out.println("계산결과 : " + result);
        System.out.println("--------------------------------------------------------------------");
        System.out.print("더 계산하시겠습니까? (exit를 입력시 종료, remove를 입력시 가장 먼저 계산된 계산결과 삭제) : ");


    }

    public boolean onOff(String stop){


        if (stop.equals("exit")) {

            System.out.println("계산기를 종료합니다.");
            return false;

        } else if (stop.equals("remove")) {
            System.out.println("가장먼저 계산된 [" + results.get(0) + "] 이 삭제되었습니다.");
            results.remove(0);
            System.out.println("남은 계산결과들을 출력합니다.");
            for (int i = 0; i < results.size(); i++) {
                System.out.println("[" + (i + 1) + "] " + results.get(i));
            }
            return true;
        }
        else{
            System.out.println("계산을 계속진행합니다 .");
            return true;

        }


    }





}
