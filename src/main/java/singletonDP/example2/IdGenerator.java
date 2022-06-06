package singletonDP.example2;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 唯一递增 ID 号码生成器
 *
 * @author zhao wen
 * @since 2022-06-06
 **/
public class IdGenerator {
    // AtomicLong 是一个 Java 并发库中提供的一个原子变量类型
    // 它讲一些线程不安全需要加锁的符合操作封装为了线程安全的原子操作
    // 比如下面会用到的 incrementAndGet()
    private AtomicLong id = new AtomicLong(0);
    private static final IdGenerator instance = new IdGenerator();

    public IdGenerator() {
    }

    public IdGenerator(AtomicLong id) {
        this.id = id;
    }

    public static IdGenerator getInstance(){
        return instance;
    }

    public long getId(){
        return id.incrementAndGet();
    }
}
