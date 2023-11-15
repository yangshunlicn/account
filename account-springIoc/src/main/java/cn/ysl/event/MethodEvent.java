package cn.ysl.event;

import java.util.EventObject;

/**
 * Description:MethodEvent
 *
 * @Author Yang ShunLi
 */
public class MethodEvent extends EventObject {

    private String methodName;

    public MethodEvent(Object source, String methodName) {
        super(source);
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}