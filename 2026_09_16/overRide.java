/*
 目標のプログラムのポイント

 ＜オーバーライドが正しく機能する。＞

 継承・オーバーライドが正しく使えてかつ、理解できているか。
 */
public class overRide {
    public static void main(String[] args) {
        
        Cat tama = new Cat();
        tama.setName("タマ");
        tama.catBark();

        Dog pochi = new Dog();
        pochi.setName("ポチ");
        pochi.dogBark();

    }
}
class Cat extends baseAnimal{
    void catBark(){
        System.out.println(getName() + "：ニャー");
    }
}

class Dog extends baseAnimal{
    void dogBark(){
        System.out.println(getName() + "：ワンワン");
    }
}


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