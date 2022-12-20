package core.entity.abstractFactoryPattern;

import core.entity.factoryPattern.AudiProducer;
import core.entity.factoryPattern.BMWProducer;
import core.entity.factoryPattern.Producer;

public class BMWFactory implements Factory {
    @Override
    public Producer producer() {
        return new BMWProducer();
    }
}
