

public class FizzBuzz {
    public static void main(String[] args) {

        /*
         100回カウントするから
         3の倍数ならFizz、5の倍数ならBuzz、15の倍数ならFizzBuzzを
         出力していく
        */

        int Buzz = 5;
        int Fizz = 3;

        int index = 1;
        while(index <= 100){

            if(index % Buzz == 0 && index % Fizz == 0){
                System.out.println("FizzBuzz");
            }else if(index % Buzz == 0){
                System.out.println("Buzz");
            }else if(index % Fizz == 0){
                System.out.println("Fizz");
            }else{
                System.out.println(index);
            }
            index++;
        }

    }
    
}