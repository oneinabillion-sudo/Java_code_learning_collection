
public class Book {
    public static void main(String[] args) {
        
        Users user1 = new Users("Java入門", "中山清喬",2970);
        Users user2 = new Users("SQL入門", "中山清喬",3080);
        Users user3 = new Users("Spring入門", "山田太郎",3500);
        
        user1.getInfo();
        user2.getInfo();
        user3.getInfo();
    }
    
    
}

class Users{
    String title;
    String author;
    int price;

    Users(String title, String author,int price){// ("Java入門", "中山清喬",2970)といれるため
        this.title = title;
        this.author = author;
        this.price = price;
    }
    

    void getInfo(){
        System.out.println(title+" / "+author+" / "+price+"円");
    }
}