package singletonDP.example3;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 饿汉模式
 *
 * @author zhao wen
 * @since 2022-06-06
 **/
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static final IdGenerator instance = new IdGenerator();

    public IdGenerator() {
    }

    public static IdGenerator getInstance() {
        return instance;
    }

    public long getId(){
        return id.incrementAndGet();
    }
}
