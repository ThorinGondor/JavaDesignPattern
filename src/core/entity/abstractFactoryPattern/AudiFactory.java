package core.entity.abstractFactoryPattern;

import core.entity.factoryPattern.AudiProducer;
import core.entity.factoryPattern.Producer;

public class AudiFactory implements Factory {
    @Override
    public Producer producer() {
        return new AudiProducer();
    }
}
