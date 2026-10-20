/*
 ➀　値引き額の計算と出力
 ➁　５冊のBookインスタンスを配列で管理
 ➂　全書籍の合計と、全書籍の合計から平均値を出力
*/

import java.util.ArrayList;
import java.util.List;

class Book{// 設計図クラス
    private String title;
    private String author;
    private int price;
    int rate;// privateにすると、getDiscountPrice()で値を取得できないので、privateを外す

    Book(String title, String author,int price){// ("Java入門", "中山清喬",2970)といれるため
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    void getInfo(){
        System.out.println(title+" / "+author+" / "+price+"円");
    }
    int getPrice(){
        return  price;
    }

    //引数％引きにした、価格を返すメソッド(クラスの変数自体に影響が出ないように別の変数で出力)
    void getDiscountPrice(int rate){
        this.rate = rate;
        int disPrice = price - (price * rate / 100);

        System.out.println("割引価格は" + disPrice + "円です。");
    }
}   

public class discntBook {// 実行用クラス
    public static void main(String[] args) {
        

        // 追加する情報があったときのためListを採用
        List<Book> books = new ArrayList<>();

        // 配列の一つの箱にUsers("Java入門", "中山清喬",2000)の情報が入ってる。それを人数分↓で設定してる。
        books.add(new Book("Java入門", "中山清喬",2000));
        books.add(new Book("SQL入門", "田中邦衛",3000));
        books.add(new Book("Spring入門", "佐々木雄太",4000));
        books.add(new Book("Docker入門", "渡辺義人",1000));
        books.add(new Book("AWS入門", "佐々木希",5000));


        //➀　値引き額の計算と出力
        books.get(0).getDiscountPrice(20);


        System.out.println();

        //➁　５冊のBookインスタンスを配列で管理 -> 全ての書籍情報を出力
        for(Book element : books){
            element.getInfo();
        }

        System.out.println();

        //➂　全書籍の合計と、全書籍の合計から平均値を出力
        int total = 0;
        int books_cnt = 0;
        int ave = 0;
        for(int i=0;i<books.size();i++){
            int tmp = books.get(i).getPrice();// 価格を順に取得
            
            total += tmp;
            books_cnt++;
        }

        ave = total / books_cnt;
        
        System.out.println("合計：" + total + "円");
        System.out.println("平均：" + ave + "円");

        
    }
    
    
}

