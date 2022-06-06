package singletonDP.example3;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 双重检查单例，支持并发
 * @author zhao wen
 * @since 2022-06-06
 **/
public class IdGenerator3 {
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator3 instance;

    public IdGenerator3() {
    }

    public static synchronized IdGenerator3 getInstance() {
        if(instance == null){
            // 此处为类级别的锁
            synchronized (IdGenerator3.class){
                if(instance == null){
                    instance = new IdGenerator3();
                }
            }
        }
        return instance;
    }

    public long getId(){
        return id.incrementAndGet();
    }
}
