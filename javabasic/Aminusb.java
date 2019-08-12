import java.util.Scanner;

class Aminusb{

public static void main(String[] args) {
    
    int a =0;
    int b= 0;
    int hap=0;

    Scanner sc = new Scanner(System.in);

    System.out.print(">>a : ");
    a = sc.nextInt();

    System.out.print(">>b : ");
    b = sc.nextInt();

    hap = a-b;

    System.out.println(String.format(">>>> %d - %d = %d", a , b , hap  ) );
}


}