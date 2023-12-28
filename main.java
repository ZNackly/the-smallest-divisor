import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a = scan.nextInt();
        int i = 2;
        while (a % i != 0){
            i += 1;
            if (a % i == 0){
                System.out.println(i);
            }
        }
    }
}
