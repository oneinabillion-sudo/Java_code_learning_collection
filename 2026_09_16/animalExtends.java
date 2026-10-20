
/*
このコードでおさえる要点
・継承・オーバーライド（メソッドの上書きを）が正しく機能しているか確認
*/



class Animal {
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
class Dog extends Animal{
    void dogBark(){
         System.out.println(getName()+"：ワンワン");
    }
}
class Cat extends Animal{
    void catBark(){
         System.out.println(getName()+"：ニャー");
    }
}
public class animalExtends{
    public static void main(String[] args) {

       
        Dog pochi = new Dog();
        pochi.setName("ポチ");
        pochi.setAge(3);

        Cat tama = new Cat();
        tama.setName("タマ");
        tama.setAge(1);

        pochi.dogBark();
        tama.catBark();
    

        
        
    
    }
    
}


