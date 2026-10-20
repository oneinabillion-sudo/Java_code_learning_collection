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

    public double area(){
        double rs = Math.PI * radius * radius;
        BigDecimal bd1 = new BigDecimal(Double.toString(rs));
        bd1 = bd1.setScale(2, RoundingMode.HALF_UP);
        double result = bd1.doubleValue();

        return result;

    }
}

public class test {
    public static void main(String[] args) {
        
        Circle cl = new Circle(5);

        System.out.println(cl.area());

        
    }
    
}