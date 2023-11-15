package cn.ysl.springioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Description:Adress
 *
 * @Author Yang ShunLi
 */
@Component
public class Address {
    @Value("学生家庭地址")
    String description;

    public void setDescription(String description) {
        this.description = description;
    }
}