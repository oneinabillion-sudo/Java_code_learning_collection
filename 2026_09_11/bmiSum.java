import java.util.Scanner;

import java.math.BigDecimal;// このインポートは初めて使う 2026-09-11
import java.math.RoundingMode;//このインポートは初めて使う 2026-09-11 
public class bmiSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 身長、体重を入力値でうけとりBMI値を返すプログラム

        System.out.println("身長を入力してください。");
        double height = sc.nextDouble();
        System.out.println("体重を入力してください。");
        double weight = sc.nextDouble();
        // 身長：160
        // 体重：54 とする

        // 身長を2乗して（1.6m * 1.6m = 2.56）＋ 2.56000005を -> 2.56に修正
        double m_squere = height * height;
        BigDecimal bd = new BigDecimal(Double.toString(m_squere));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double fixed_value = bd.doubleValue();

        // 体重を身長の2条で割る 54kg / 2.56 = BMI:約21.1
        double value = weight / fixed_value;
        BigDecimal bd2 = new BigDecimal(Double.toString(value));
        bd2 = bd2.setScale(2, RoundingMode.HALF_UP);
        double result = bd2.doubleValue();
        
        /*
        if文で25以上だったら「肥満」
        if文で18.5以上 && 25未満だったら「標準」
        if文で18.5未満だったら「低体重」
        */
        
        double min = 18.5;
        double max = 25.0;
        
        if(min <= result && result < max){
            System.out.println("標準");
        }else if(result < min){
            System.out.println("低体重");
        }else if(max <= result){
            System.out.println("肥満");
        }
    

    }
    
}