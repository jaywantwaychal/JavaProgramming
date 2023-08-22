package programming;

import javax.swing.*;

public class SingletonDesignPattern {

    private static SingletonDesignPattern singletonDesignPattern
         = new SingletonDesignPattern();
    private SingletonDesignPattern() {

    }

    public static SingletonDesignPattern getInstance() {
        if(singletonDesignPattern == null) {
            synchronized (SingletonDesignPattern.class) {
                if(singletonDesignPattern == null) {
                    singletonDesignPattern =  new SingletonDesignPattern();
                    return singletonDesignPattern;
                }
            }
        }
        return singletonDesignPattern;
    }
}

class helper {
     SingletonDesignPattern singletonDesignPattern;
    SingletonDesignPattern singletonDesignPattern2;
    public static void main(String[] args) {
        new helper().test();

    }

    private void test() {
        singletonDesignPattern = SingletonDesignPattern.getInstance();
        System.out.println(singletonDesignPattern.hashCode());

        singletonDesignPattern2 = SingletonDesignPattern.getInstance();
        System.out.println(singletonDesignPattern2.hashCode());
    }
    /**
     * 681842940
     * 681842940
     * both hash codes same
     * **/
}
