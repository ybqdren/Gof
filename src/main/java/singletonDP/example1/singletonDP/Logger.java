package singletonDP.example1.singletonDP;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zhao wen
 * @since 2022-06-06
 **/
public class Logger {
    private FileWriter writer;
    private static final Logger instance = new Logger();

    public Logger() {
        File file = new File("/Users/wangzheng/log.txt");
        try {
            writer = new FileWriter(file, true); //true表示追加写入
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance(){
        return instance;
    }

    public void log(String msg) {
        try {
            writer.write(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
