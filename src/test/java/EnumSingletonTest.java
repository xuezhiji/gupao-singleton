import com.gupaotask.pattern.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumSingletonTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        EnumSingleton enumSingleton=EnumSingleton.getInstance();


        Class c=EnumSingleton.class;
        Constructor constructor=c.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        Object e1=constructor.newInstance("Tom",777);
        Object e2=constructor.newInstance();

        System.out.println(e1==e2);

    }

}
