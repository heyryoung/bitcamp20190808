import java.util.Random;
import java.util.Scanner;

class Dice{
// 주사위를 던져서 홀수인지 짝수인지 맞추는 게임입니다. 
// 일단 컴퓨터가 던져서 얻은 값은 3입니다. 
// 사용자가 '홀' , '짝' 중에 선택 한다고 할때 정답인지 아닌지 결과를 출력하세요. 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String answer = "";
        int dice = 0;
        String dap = "";

        Random rd = new Random();      
        dice = rd.nextInt(6)+1;             //dice = (int) (1+6*Math.random());

        System.out.println(">>>>dice: " + dice);

        System.out.print(">> '홀' , '짝' 중에 선택하세요 : ");
        answer = sc.nextLine();


        if(dice%2==0){
            dap = "짝";
        }else {
            dap = "홀";
        }

        

        if (answer.equals(dap)) {
                System.out.println(" 정답입니다.");
             
        } else {
            System.out.println("틀렸습니다.");
        }

    }

}