import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.*;

public class upgrade {
    public static int attack = 5;
    public static int try_limit = 3;
    public static int boss = 100;
    public static boolean upgrade = true;
    public static boolean play = true;

    public static void main(String[] args) {
        System.out.println("무기를 강화하세요. 보스의 체력은 100입니다.");
        System.out.println("현재 무기 데미지" + attack + "강화하시겠습니까?");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String answer = scanner.next();
        while (upgrade) {
            if (answer.equals("y")) {
                if (try_limit > 0){
                    int damage = random.nextInt(1, 10);
                    attack += damage;
                    try_limit--;

                    System.out.println(damage + "강화되었습니다.");
                    System.out.println("현재 무기 데미지는" + attack + "입니다. 더 강화 하시겠습니까? 남은 횟수는" + try_limit + "번입니다.");
                }
                else {
                    System.out.println("강화 횟수가 소멸되었습니다.");
                }
                String answer_second = scanner.next();
                if (answer_second.equals("n"))
                    break;
                if (answer_second.equals("o")) {
                    while (play && boss >0) {
                        for (int i = 0; i < 5; i++) {
                            int b = random.nextInt(1, 10);
                            int c = random.nextInt(1, 10);
                            ScheduledExecutorService e = Executors.newScheduledThreadPool(1);
                            System.out.println(b + "x" + c + "=");
                            Callable<Integer> task = () -> {
                                if (scanner.hasNextInt()) {
                                    return scanner.nextInt();
                                }
                                return null;
                            };
                            Future<Integer> future = e.submit(task);

                            try {
                                Integer answer_third = future.get(3, TimeUnit.SECONDS);
                                if (answer_third != null && answer_third == b * c) {
                                    boss -= attack;
                                    System.out.println("공격! 보스의 체력은" + boss + "남았습니다.");
                                } else {
                                    System.out.println("틀렸습니다!");
                                }
                            } catch (TimeoutException ex) {
                                System.out.println("시간 초과! 다음 문제로 넘어갑니다.");
                                System.out.println("보스의 체력은" + boss);

                                future.cancel(true);
                            } catch (InterruptedException | ExecutionException ex) {
                                ex.printStackTrace();
                            }
                            if (boss <= 0) {
                                System.out.println("보스를 물리쳤습니다!");
                                play = false;
                                break;
                            }
                        }
                        if (boss <= 0) {
                            System.out.println("축하합니다! 이겼습니다.");
                        }

                        if (boss > 0) {
                            System.out.println("보스의 체력이 남아있습니다. 다시 도전하세요.");
                        }
                    }

                    if (boss > 0) {
                        System.out.println("게임 오버! 보스를 물리치지 못했습니다.");
                    }
                        }
                    }

                }
            }
        }
