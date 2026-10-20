
public class Method {
    public static void main(String[] args) {
        taxCompute user = new taxCompute();

        user.calcTax(3980);// ここに入れたい値をいれる。
    }
}


class taxCompute {
        void calcTax(int price){
            /*intだけで10%加算する方法*/
            int result = price + (price * 10 / 100);

            System.out.println(result);
        }
    }