
/*
このコードでおさえる要点
・継承・オーバーライド（メソッドの上書きを）が正しく機能しているか確認
*/



class baseAnimal {
    private String name;//　main内でpochi.name = "次郎"と変更できないようにするため
    private int age;//   　 main内でtama.age = 100と変更できないようにするため


    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }

    // 「～が鳴きます」をプロンプト上で出力
    void cry(){

        System.out.println(name+"が鳴きます");
    }

    String getName(){
        return  name;
    }
    int getAge(){
        return  age;
    } 
    
}
public class Animal {
    public static void main(String[] args) {

       
        baseAnimal pochi = new baseAnimal();
        pochi.setName("ポチ");
        pochi.setAge(3);

        baseAnimal tama = new baseAnimal();
        tama.setName("タマ");
        tama.setAge(2);

        pochi.cry();
        tama.cry();

        
        
    
    }
    
}


