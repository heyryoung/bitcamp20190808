import java.util.Random;
import java.util.Scanner;

class RockScissorsPaper{
/**
 * 가위바위보에서 
 * Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다.
 * 컴퓨터가 만든 값이 1이면 가위를 낸 것이고
 * 2이면 바위를 낸 것이고
 * 3이면 보를 낸 것으로 할 때,
 * 사용자측이 가위, 바위, 보를 냈을 때
 * 승패를 결정하는 프로그램을 작성하시오
 */

    public static void main(String[] args) {
        
        int com = 0;         
        String user = "";
        String computer = "";

        Scanner sc = new Scanner(System.in);

        Random ran = new Random();
        com = ran.nextInt(3)+1;

        if(com==1){
            computer = "가위";
        }else if(com==2){
            computer = "바위";
        }else if(com==3){
            computer = "보";
        }
  
        

        System.out.print(">> 가위, 바위 보 중 하나를 입력하세요 : ");
        user = sc.nextLine();

        System.out.println(String.format("컴퓨터는 %s을 냈습니다.", computer));

        if(user.equals("가위")){
            if(com==1){
                System.out.println("비겼습니다.");
            }else if(com==2){
                System.out.println("졌습니다.");
            }else{
                System.out.println("이겼습니다.");
            }
        }else if(user.equals("바위")){
            if(com==1){
                System.out.println("이겼습니다..");
            }else if(com==2){
                System.out.println("비겼습니다.");
            }else{
                System.out.println("졌습니다.");
            }
        }else if(user.equals("보")){
            if(com==1){
                System.out.println("졌습니다.");
            }else if(com==2){
                System.out.println("이겼습니다.");
            }else{
                System.out.println("비겼습니다.");
            }
        }else{
            System.out.println("잘못입력하였습니다.");
        }



    }
}