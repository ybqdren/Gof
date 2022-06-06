package singletonDP.example3;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 懒汉单例，支持延迟加载
 * @author zhao wen
 * @since 2022-06-06
 **/
public class IdGenerator2 {
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator2 instance;

    public IdGenerator2() {
    }

    public static synchronized IdGenerator2 getInstance() {
        if(instance == null){
            instance = new IdGenerator2();
        }
        return instance;
    }

    public long getId(){
        return id.incrementAndGet();
    }
}
