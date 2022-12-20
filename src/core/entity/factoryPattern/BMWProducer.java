package core.entity.factoryPattern;

public class BMWProducer implements Producer {
    @Override
    public void produce() {
        System.out.println("BMW vehicle has been built!");
    }
}
