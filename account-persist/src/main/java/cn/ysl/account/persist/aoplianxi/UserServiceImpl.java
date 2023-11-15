package cn.ysl.account.persist.aoplianxi;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Description:UserServiceImpl
 *
 * @Author Yang ShunLi
 */
public class UserServiceImpl implements UserService {
    static HashMap<String, String> map = new HashMap<>();
    static{
        map.put("ysl","123456");
        map.put("rw","654321");
    }
    @Override
    public boolean login(User user) {
        //int i = 1/0;
        String value = map.get(user.getUsername());
        return user.getPassword().equals(value);
    }

}