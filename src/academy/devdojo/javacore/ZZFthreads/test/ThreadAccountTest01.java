package academy.devdojo.javacore.ZZFthreads.test;

import academy.devdojo.javacore.ZZFthreads.domain.Account;

public class ThreadAccountTest01 implements Runnable{
    private final Account account = new Account();
    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Hestia");
        Thread t2 = new Thread(threadAccountTest01, "Bell");
        t1.start();
        t2.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("FODEOO");
            }
        } 
    }
    private void withdrawal(int amount) {
        synchronized (account) {
            System.out.println(getThreadName() + " dentro do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " esta indo sacar dinheiro");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " completou o saque, valor atual da conta " + account.getBalance());
            } else {
                System.out.println("Saldo insuficiente " + getThreadName() + " para efetuar o saque " + account.getBalance());
            }
        }
    }

    private static String getThreadName() {
        return getName();
    }

    private static String getName() {
        return Thread.currentThread().getName();
    }


}
