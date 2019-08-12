import java.util.Scanner;

class CalSwitch{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b, c , op =0;

        System.out.print(">>연산 종류를 선택하시오  1.덧셈 2.뺄셈 3.곱하기 4.나누기  :  ");
        op = sc.nextInt();
        System.out.print(">> a를 입력하세요 : ");
        a = sc.nextInt();
        System.out.print(">> b를 입력하세요 : ");
        b = sc.nextInt();

        switch (op) {
            case 1:
                c = a + b;
                break;
            case 2:
                c = a - b;
                break;
            case 3:
                c = a * b;
                break;            
            case 4:
                c = a / b;
                break;

            default: c = 0;
                break;
        }

        System.out.println(String.format(">>>>>a와 b의 연산 결과는 : %d입니다.", c));
        
    }

}