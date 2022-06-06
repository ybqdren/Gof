package singletonDP.example2;

/**
 * 使用 id 递增生成器
 *
 * @author zhao wen
 * @since 2022-06-06
 **/
public class GeneratorUseage {
    public static void main(String[] args) {
        long id = IdGenerator.getInstance().getId();
    }
}
