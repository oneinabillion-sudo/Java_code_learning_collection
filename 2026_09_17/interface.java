import java.math.BigDecimal;
import java.math.RoundingMode;


interface Shape{
    double area();
}

class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void double area(){
        double rs = radius * radius * PI
    }
}

public class test {
    public static void main(String[] args) {
        
    }
    
}