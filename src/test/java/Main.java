public class Main {
    public static void main(String[] args){
            int num1 = 0, num2 = 1, fibonnaci, flag = 0;
            while (flag == 0){
                fibonnaci = num1 + num2;
                if(fibonnaci > 100){
                    break;
                }
                System.out.println(fibonnaci);
                num1 = num2;
                num2 = fibonnaci;
            }

    }
}
