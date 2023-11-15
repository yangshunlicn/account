package cn.ysl.springevent.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Description:MethodEventListenerImpl
 *
 * @Author Yang ShunLi
 */
@Component
public class MethodEventListenerImpl implements ApplicationListener<ApplicationEvent> {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof MethodEvent) {
            System.out.println("method:" + ((MethodEvent)event).getMethodName() + "execution");
        }
        if(event instanceof ContextRefreshedEvent){
            System.out.println("ioc init...");
        }
    }
}