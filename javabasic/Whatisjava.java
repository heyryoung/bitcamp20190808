import java.util.Scanner;

class Whatisjava{

    public static void main(String[] args) {
        System.out.println("안녕");
        System.out.println("너의 이름이 뭐니?");

        String name = "";
        int age = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 : ");
        name = scanner.nextLine();
        System.out.print("나이 : ");
        age = scanner.nextInt();

        System.out.println("내 이름은 " + name + "이고, 나이는 " + age + "세 란다" ); 




    }

}