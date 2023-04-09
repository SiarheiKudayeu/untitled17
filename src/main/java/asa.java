import java.util.Scanner;

public class asa {

        public int division(int x){
            Scanner in = new Scanner(System.in);
            int znam = in.nextInt();
            try {
                int result = x/znam;
                return znam;
            }catch (ArithmeticException e){
                System.out.println("На ноль делить нельзя");
                return 0;
            }
        }
}
