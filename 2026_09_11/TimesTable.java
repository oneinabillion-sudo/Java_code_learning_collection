


public class TimesTable{
    public static void main(String[] args) {
        /*九九を出力するプログラム
    
        
        */
       int[][] timesTable = new int[9][9];
       for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
            
                System.out.print(i * j);
                if(j < 9){// 見栄えよくするために半角入れる
                    System.out.print(" ");
                }
            }
            System.out.println();// 改行
       }

    }
}
