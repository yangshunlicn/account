package cn.ysl.account.email;

/**
 * Description:
 *
 * @Author Yang ShunLi
 */
public interface AccountEmailService {

    /**
     * 发送邮件
     * @param to
     * @param subject
     * @param htmlText
     * @throws AccountEmailException
     */
    void sendMail( String to, String subject, String htmlText ) throws AccountEmailException;
}