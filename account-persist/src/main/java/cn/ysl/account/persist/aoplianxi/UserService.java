package cn.ysl.account.persist.aoplianxi;

import org.springframework.stereotype.Component;

/**
 * Description:User
 *
 * @Author Yang ShunLi
 */
public interface UserService {
    /**
     *  login
     * @param user
     * @return
     */
    boolean login(User user);
}