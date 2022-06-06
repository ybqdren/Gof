package singletonDP.example1.singletonDP;

/**
 * 往文件里面打印日志
 *
 * @author zhao wen
 * @since 2022-06-06
 **/
public class OrderController {

    public void create(OrderVo order){
        // ... 省略业务逻辑代码
        Logger.getInstance().log("Create an order:" + order.toString());
    }
}
