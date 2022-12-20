package core.entity.builderPattern;

// 导演类，用于调用建造者创建对象
public class Director {

    private Builder builder = new BuilderImpl();

    public User getUser(String name, Integer age) {
        builder.createUser(name, age);
        return builder.getUser();
    }

}
