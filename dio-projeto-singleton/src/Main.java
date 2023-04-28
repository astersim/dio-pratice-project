import com.digitalinnovation.singleton.SingletonEager;
import com.digitalinnovation.singleton.SingletonLazy;
import com.digitalinnovation.singleton.SingletonLazyHolder;

public class Main {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();

        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();

        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();

        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
    }
}