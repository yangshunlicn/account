package cn.ysl.account.email;

import com.icegreen.greenmail.util.GreenMail;
import com.icegreen.greenmail.util.GreenMailUtil;
import com.icegreen.greenmail.util.ServerSetup;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.mail.Message;

import static org.junit.Assert.*;

/**
 * Description:AccountEmailServiceTest
 *
 * @Author Yang ShunLi
 */
public class AccountEmailServiceTest {
    private GreenMail greenMail;
    @Before
    public void setUp() throws Exception {
        greenMail=new GreenMail(ServerSetup.SMTP );
        greenMail.setUser("yangsl@ysl.com","123456");
        greenMail.start();
    }

    @Test
    public void sendMail() throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext( "classpath:account-email.xml");
        AccountEmailService accountEmailService = (AccountEmailService) ctx.getBean( "accountEmailService");
        String subject = "Test Subject";
        String htmlText ="<h1>你好啊，我是测试邮件！</h1>";
        accountEmailService.sendMail( "raowei@yslmail.com",subject,htmlText);
        greenMail.waitForIncomingEmail (2000, 1 );
        Message[] msgs = greenMail.getReceivedMessages();
        assertEquals (1, msgs.length );
        assertEquals ( subject, msgs[0].getSubject ());
        //assertEquals (htmlText, GreenMailUtil.getBody(msgs[0]));
    }
}