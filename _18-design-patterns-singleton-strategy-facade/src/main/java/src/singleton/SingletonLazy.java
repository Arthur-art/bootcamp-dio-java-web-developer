package src.singleton;

public class SingletonLazy {
    private static SingletonLazy instance;

    public SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
