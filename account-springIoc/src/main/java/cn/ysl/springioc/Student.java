package cn.ysl.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Description:Student
 *
 * @Author Yang ShunLi
 */
@Component
public class Student {
    Address address;

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }
}