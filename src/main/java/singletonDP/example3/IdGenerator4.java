package singletonDP.example3;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 内部类单例，有点类似饿汉，也做到了延迟加载
 *
 * @author zhao wen
 * @since 2022-06-06
 **/
public class IdGenerator4 {
    private AtomicLong id = new AtomicLong(0);

    public IdGenerator4() {
    }

    public static class SingletonHolder {
        private static final IdGenerator4 instance = new IdGenerator4();
    }

    public static synchronized IdGenerator4 getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
