package src.singleton;

public class SingletonLazyHolder {

    private static class Holder{
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    public SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return Holder.instance;
    }
}
