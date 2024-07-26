import java.lang.Thread;

public class Carneirinhos {
    public static void main(String[] args) throws InterruptedException {
//        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
//            int wait = 0;
//            System.out.printf("%d %s...\n", carneirinhos, carneirinhos > 1 ? "carneirinhos" : "carneirinho");
//            Thread.sleep(1000 + wait);
//            wait += 200;
//        }

        int numeros[] = {1,2,3,4,5,6,7,8,9,10};

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
