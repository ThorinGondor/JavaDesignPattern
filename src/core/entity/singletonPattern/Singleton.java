package core.entity.singletonPattern;

/**
 * 这是一个典型的懒汉模式
 */
public class Singleton {
    // volatile可见性保证了初始化对象的过程中不会有其他线程重复创建对象
    private static volatile Singleton instance = null;

    // 私有化构造器，防止创建对象
    private Singleton() {
    }

    // 获取唯一对象
    public static Singleton getInstance() {
        System.out.println("(3) 单例模式 ===>");
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
