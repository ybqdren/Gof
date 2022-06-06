package singletonDP.example1.singletonDP;

import java.io.IOException;

/**
 * @author zhao wen
 * @since 2022-06-06
 **/
public class UserController {

    public UserController(String username, String password) throws IOException {
        Logger.getInstance().log(username + "logined!");
    }
}
