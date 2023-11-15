package cn.ysl.event;

import java.util.EventListener;

/**
 * Description:EventListenler
 *
 * @Author Yang ShunLi
 */
public interface MethodEventListener extends EventListener {
    void onMethodEvent(MethodEvent methodEvent);
}