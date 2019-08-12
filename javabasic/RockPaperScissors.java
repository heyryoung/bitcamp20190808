import java.util.Scanner;

class RockPaperScissors{
    public static void main(String[] args){

        String op ="";
        Scanner sc = new Scanner(System.in);
        System.out.println(" 가위 바위 보 게임을 시작하지 : ");
        System.out.print("1.가위 2.바위 3.보  : ");
        //컴퓨터는 바위를 냈다고 가정.

        op = sc.nextLine();
        
        if (op.equals("가위")) {
            System.out.println("당신이 졌습니다.");
        }else if(op.equals("바위")){
            System.out.println("비겼습니다.");
        }else if(op.equals("보")){
            System.out.println("당신이 이겼습니다.");
        }else{
            System.out.println("잘못 입력 하였습니다.");
        }



    }
}