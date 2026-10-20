/*
このコードのポイント
・例外処理の基本を理解する
・例外時とそうでないときで出力が得られるか確認する。


このプログラムの説明：文字列型で"123"を受け取ったらInteger.parseInt()でint型に変換するプログラム
例外時："abc" はInteger.parseInt()で変換できないので例外処理
そうでないとき："123"は変換できる

*/


import java.util.Scanner;

public class exceptionTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String takeWord = sc.next();
        // 入力値が数値に変換できなかったら例外とする。
        try{
            int wordCngToValue = Integer.parseInt(takeWord);

            System.out.println("変換成功：" + wordCngToValue);
        } catch(NumberFormatException e){// ＜－ここをExceptionから具体的にどんな例外でしたの処理をさせるか

            // NumberFormatExceptionが発生したら　ー＞　エラーメッセージを出力する
            System.out.println("数値変換エラー： For Input string: " + takeWord);

        }
    }
}