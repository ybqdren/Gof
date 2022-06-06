package singletonDP.example3;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 枚举单例
 *
 * @author zhao wen
 * @since 2022-06-06
 **/

public enum IdGenerator5 {
    INSTANCE;

    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}
