import java.util.Scanner;

public class checkage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("年齢を入力してください。");
        int age = sc.nextInt();

        if(age >= 20){
            System.out.println("成人");
        }else{
            System.out.println("未成年");
        }
    }
    
}