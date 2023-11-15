package cn.ysl.account.email;

import javax.mail.MessagingException;

/**
 * Description:
 *
 * @Author Yang ShunLi
 */
public class AccountEmailException extends Exception {
    public AccountEmailException(String s, MessagingException e) {
        super(s,e);
    }
}