import java.util.Scanner;

class Amultib{

    public static void main(String[] args){
        int a = 0;
        int b = 0;
        int mul = 0;

        Scanner sc = new Scanner(System.in);
        
        System.out.print(">>a : ");
        a = sc.nextInt();
        System.out.print(">>a : ");
        b = sc.nextInt();

        mul = a * b;

        System.out.println(String.format(">>>> %d x %d = %d", a ,b , mul ) );

    }

}