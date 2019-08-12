import java.util.Scanner;

class Wherelive{

    public static void main(String[] args) {
        
        String address = "";

        System.out.println("넌 어디에 사니? ");
        Scanner sc = new Scanner(System.in);
        System.out.print(" >> 주 소 : ");

        address = sc.nextLine();

        System.out.println("나는 " + address + "에 살아");



    }


}