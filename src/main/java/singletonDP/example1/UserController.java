package singletonDP.example1;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zhao wen
 * @since 2022-06-06
 **/
public class UserController {
    private Logger logger;

    public UserController(String username, String password) throws IOException {
        logger.log(username + "logined!");
    }
}
