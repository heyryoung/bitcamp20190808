import java.util.Scanner;

class Cal{


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a, b = 0;
        int c = 0;
        String op ="";
       

        System.out.print(">> a를 입력하시오 : ");
        a = sc.nextInt();

        System.out.print(">> b를 입력하시오 : ");
        b = sc.nextInt();

        System.out.print(">>원하는 연산을 선택하시오 + , - , * , /  : ");
        op = sc.next();

        if(op.equals("+")){
            c = a + b;
        }else if(op.equals("-")){
            c = a - b;
        }else if(op.equals("*")){
            c = a * b;            
        }else if(op.equals("/")){
            c = a/b;
        }else{
            c = 0;
        }

        if(c == 0){
            System.out.println("잘못된 선택입니다.");
        }else{
            System.out.println(String.format(">>>>> a %s b = %d 입니다", op, c));
        }
        

    }

}