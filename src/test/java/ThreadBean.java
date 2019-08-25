import com.gupaotask.pattern.singleton.lazy.LazyDoubleCheckSingleton;

public class ThreadBean implements Runnable {
    public void run() {
//        LazySimpleSingleton lazySimpleSingleton=LazySimpleSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName()+":"+lazySimpleSingleton);

        LazyDoubleCheckSingleton doubleCheckSingleton= LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+doubleCheckSingleton);

    }
}
