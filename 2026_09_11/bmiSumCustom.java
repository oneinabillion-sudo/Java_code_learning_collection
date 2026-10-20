import java.util.Scanner;

import java.math.BigDecimal;// このインポートは初めて使う 2026-09-11
import java.math.RoundingMode;//このインポートは初めて使う 2026-09-11 
public class bmiSumCustom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 身長、体重を入力値でうけとりBMI値を返すプログラム

        System.out.println("身長を入力してください。");
        double height = sc.nextDouble();
        System.out.println("体重を入力してください。");
        double weight = sc.nextDouble();
        // 身長：160
        // 体重：54 とする

        // 身長をメートルに直す 160cm -> 1.6m
        double chgMeter = height / 100;


        // 身長を2乗して（1.6m * 1.6m = 2.56）＋ 2.56000005を -> 2.56に修正
        double m_squere = chgMeter * chgMeter;
        BigDecimal bd = new BigDecimal(Double.toString(m_squere));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        double fixed_value = bd.doubleValue();

        // 体重を身長の2条で割る 54kg / 2.56 = BMI:約21.1
        double value = weight / fixed_value;
        BigDecimal bd2 = new BigDecimal(Double.toString(value));
        bd2 = bd2.setScale(2, RoundingMode.HALF_UP);
        double result = bd2.doubleValue();

        System.out.println(result);
        

    }
    
}