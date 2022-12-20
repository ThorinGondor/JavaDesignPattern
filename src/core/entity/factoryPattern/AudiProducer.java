package core.entity.factoryPattern;

public class AudiProducer implements Producer{
    @Override
    public void produce() {
        System.out.println("Audi vehicle has been built!");
    }
}
