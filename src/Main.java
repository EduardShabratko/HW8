import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
      int s = 100; // number of spaceships
        for (int i = 0; i <= s; i++){
            String stringCouunter = String.valueOf(i);
            if (!stringCouunter.contains("4") && !stringCouunter.contains("9")){
                System.out.println(stringCouunter);
            }
        }
    }
}