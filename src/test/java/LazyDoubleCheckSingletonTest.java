public class LazyDoubleCheckSingletonTest {

    public static void main(String[] args) {

        Thread thread1=new Thread(new ThreadBean());
        Thread thread2=new Thread(new ThreadBean());
        thread1.start();
        thread2.start();

    }

}
