package cn.ysl.event;

/**
 * Description:MethodEventListenerImpl
 *
 * @Author Yang ShunLi
 */
public class MethodEventListenerImpl implements MethodEventListener {
    @Override
    public void onMethodEvent(MethodEvent methodEvent) {
        System.out.println("method:"+methodEvent.getMethodName()+"execution");
    }
}