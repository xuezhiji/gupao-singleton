import com.gupaotask.pattern.singleton.hungry.HungrySingleton;
import com.gupaotask.pattern.singleton.lazy.LazySimpleSingleton;

import java.io.*;

//反序列化攻击，破坏单例模式
public class SingletonSerialAttackTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungrySingleton s1=null;
        HungrySingleton s2=HungrySingleton.getInstance();

        FileOutputStream fileOutputStream=new FileOutputStream("LazySimpleSingleton.obj");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(s2);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream=new FileInputStream("LazySimpleSingleton.obj");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        s1=(HungrySingleton)objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);

    }

}
