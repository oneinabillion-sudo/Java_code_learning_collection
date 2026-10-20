import java.util.Scanner;
import java.util.Arrays;


public class searchMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String array[] = line.split(",");
    
        String min_val_str = array[0];
        int min_val = Integer.parseInt(min_val_str);// 初期値を最小値として設定

        for(int i=1;i<array.length;i++){
            String value_str = array[i];
            int take_val = Integer.parseInt(value_str);

            if(take_val < min_val){// 受け取った値が設定された最小値より小さかったら更新
                min_val = take_val;                
            }
        }
        System.out.println(min_val);
    } 
    
}
