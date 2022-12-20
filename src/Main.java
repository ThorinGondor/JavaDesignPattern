import core.entity.abstractFactoryPattern.AudiFactory;
import core.entity.abstractFactoryPattern.BMWFactory;
import core.entity.abstractFactoryPattern.Factory;
import core.entity.adapterPattern.NewModule;
import core.entity.builderPattern.Director;
import core.entity.builderPattern.User;
import core.entity.factoryPattern.ProduceFactory;
import core.entity.factoryPattern.Producer;
import core.entity.singletonPattern.Singleton;

public class Main {

    /**
     * (1) 工厂方法模式
     */
    private static void factoryPattern() {
        System.out.println("(1) 工厂方法模式 ===>");
        Producer audiProducer = ProduceFactory.audiProducer();
        audiProducer.produce();
        Producer bmwProducer = ProduceFactory.BMWProducer();
        bmwProducer.produce();
    }

    /**
     * (2) 抽象工厂模式
     * 在工厂模式的基础上，把 factory 工厂也给抽象化，然后创建两个不同的工厂实现类
     */
    private static void abstractFactoryPattern() {
        System.out.println("(2) 抽象工厂模式 ===>");
        Factory factory = new BMWFactory();
        Producer bmwProducer = factory.producer();
        bmwProducer.produce();

        factory = new AudiFactory();
        Producer audiProducer = factory.producer();
        audiProducer.produce();
    }

    private static void builderPattern() {
        System.out.println("(4) 建造者模式 builder ===>");
        Director director = new Director();
        User user = director.getUser("Kimi", 29);
        System.out.println(user.getName());
    }

    private static void adapterPattern() {
        System.out.println("(5) 适配器模式 adapter ===>");
        NewModule newModule = new NewModule();
        newModule.methodA(); //即可使用老接口的功能
        newModule.methodB();
    }

    private static void bridgePattern() {
        System.out.println("(6) 桥接设计模式 ===>");
    }

    public static void main(String[] args) {
        // (1) 工厂方法模式
        factoryPattern();
        // (2) 抽象工厂模式
        abstractFactoryPattern();
        // (3) 单例模式
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.toString());
        // (4) 建造者模式 builder
        builderPattern();
        // (5) 适配器模式 adapter
        adapterPattern();
        // (6) 桥接设计模式
        bridgePattern();
    }
}