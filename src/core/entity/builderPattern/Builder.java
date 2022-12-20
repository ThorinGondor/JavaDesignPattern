package core.entity.builderPattern;

/**
 * 抽象建造者
 */
public interface Builder {

    void createUser(String name, Integer age);

    User getUser();

}
