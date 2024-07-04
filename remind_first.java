import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.*;


public class remind_first {
    public static int e = 0;
    public static int f = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScheduledExecutorService d = Executors.newScheduledThreadPool(1);
        System.out.println("초심찾자 오늘부터");
        for(int i = 0; i <10; i++) {
            Random random = new Random();
            int b = random.nextInt(1, 10);
            int c = random.nextInt(1,10);
            System.out.println(b + "x" + c + "=");
            Callable<Integer> task = () -> {
                if (scanner.hasNextInt()) {
                    return scanner.nextInt();
                }
                return null;
            };
            Future<Integer> future = d.submit(task);

            try {
                Integer answer = future.get(3, TimeUnit.SECONDS);
                if (answer != null && answer == b * c) {
                    e++;
                } else {
                    f++;
                }
            } catch (TimeoutException ex) {
                System.out.println("시간 초과! 다음 문제로 넘어갑니다.");
                f++;
                future.cancel(true);
            } catch (InterruptedException | ExecutionException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(e + "점!");
        scanner.close();
        d.close();
        }
    }

