package core.entity.adapterPattern;

// 继承老接口，实现适配器的新功能
public class NewModule extends OldModule implements Adapter {
    @Override
    public void methodB() {
        System.out.println("This is methodB in new module");
    }
}
