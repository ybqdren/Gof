package singletonDP.example1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 对象锁
 * @author zhao wen
 * @since 2022-06-06
 **/
public class Logger2 {
    private FileWriter writer;

    public Logger2() {
        File file = new File("/Users/wangzheng/log.txt");
        try {
            writer = new FileWriter(file, true); //true表示追加写入
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void log(String msg) {
        try {
            // 增加 synchronized 同步锁
            synchronized (this){
                writer.write(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
