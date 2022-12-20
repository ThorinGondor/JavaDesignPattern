package core.entity.builderPattern;

public class BuilderImpl implements Builder {

    private User user = null;

    @Override
    public void createUser(String name, Integer age) {
        user = new User();
        user.setName(name);
        user.setAge(age);
    }

    @Override
    public User getUser() {
        return user;
    }
}
