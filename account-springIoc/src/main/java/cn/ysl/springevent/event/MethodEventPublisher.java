package cn.ysl.springevent.event;

import cn.ysl.event.MethodEventListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Description:MethodEventPublisher
 *
 * @Author Yang ShunLi
 */
@Component
public class MethodEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    public void publisher() {
        publisher.publishEvent(new MethodEvent(publisher,"打招呼"));
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("classpath:**/*.xml");
        MethodEventPublisher bean = cpx.getBean("methodEventPublisher", MethodEventPublisher.class);
        bean.publisher();
    }


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        publisher = applicationEventPublisher;
    }
}