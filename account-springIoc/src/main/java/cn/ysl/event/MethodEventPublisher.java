package cn.ysl.event;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Description:MethodEventPublisher
 *
 * @Author Yang ShunLi
 */
public class MethodEventPublisher {

    private HashMap<MethodEvent, List<MethodEventListener>> listenerMap = new HashMap<>();

    public MethodEventPublisher publisher(MethodEvent event) {
        if (listenerMap.containsKey(event)){
            List<MethodEventListener> listeners = listenerMap.get(event);
            listeners.forEach(lister ->{
                lister.onMethodEvent(event);
            });
        }
        return this;
    }

    public void addListener( MethodEvent event,MethodEventListener methodEventListener) {
        if (!listenerMap.containsKey(event)){
            ArrayList<MethodEventListener> list = new ArrayList<>();
            list.add(methodEventListener);
            listenerMap.put(event, list);
        }else{
            listenerMap.get(event).add(methodEventListener);
        }

    }

    public static void main(String[] args) {
        MethodEventPublisher publisher = new MethodEventPublisher();
        MethodEvent event = new MethodEvent(publisher, "打招呼");
        MethodEventListener methodEventListener = new MethodEventListenerImpl();
        publisher.addListener(event,methodEventListener);

        publisher.publisher(event);
    }

}