package core.entity.factoryPattern;

public class ProduceFactory {

    public static Producer audiProducer(){
        return new AudiProducer();
    }

    public static Producer BMWProducer() {
        return new BMWProducer();
    }

}
