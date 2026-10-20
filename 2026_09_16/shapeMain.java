/**
このプログラムの目的
➀インターフェース・ポリモーフィズムの基本の理解
 */
import java.math.BigDecimal;
import java.math.RoundingMode;



// Shapeインターフェース：面積を計算できることを約束する
interface Shape {
    double area(); // 中身はない。「戻り値がdoubleのarea()を持つ」という契約だけ
}

// CircleはShapeを実装する
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {// 引数ありのコンストラクタ
        this.radius = radius;
    }

    @Override
    public double area() {
        double sum = Math.PI * radius * radius; // π × r²
        BigDecimal bd = new BigDecimal(String.valueOf(sum));
        BigDecimal result = bd.setScale(2, RoundingMode.HALF_UP);
        double resultDouble = result.doubleValue();

        return resultDouble;
    }
}

// RectangleもShapeを実装する
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {// 引数ありのコンストラクタ
        this.width = width;
        this.height = height;
    }

    
    @Override//    ↓をArea() としてしまったときコンパイルエラーでエラーをだしてくれるため追記
    public double area() {

        double sum2 = width * height;
        BigDecimal bd2 = new BigDecimal(String.valueOf(sum2));
        BigDecimal result2 = bd2.setScale(2, RoundingMode.HALF_UP);
        double result2Double = result2.doubleValue();

    
        return result2Double;
    }
}



// 実行用クラス
public class shapeMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

    
        // ポリモーフィズム：Shape型としてまとめて扱える
        Shape[] shapes = { circle, rectangle };
        for (Shape s : shapes) {
            System.out.println("面積: " + s.area());
        }
    }
}