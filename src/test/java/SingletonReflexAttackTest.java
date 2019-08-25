import com.gupaotask.pattern.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonReflexAttackTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class lazyInnerClassSingleton= LazyInnerClassSingleton.class;
        Constructor c=lazyInnerClassSingleton.getDeclaredConstructor(null);
        c.setAccessible(true);
        Object t=c.newInstance();

        Object t1=c.newInstance();

        Object t2=LazyInnerClassSingleton.getInstance();

        System.out.println(t==t1);

        System.out.println(t==t2);


    }



}
