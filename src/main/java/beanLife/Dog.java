package beanLife;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName DOG
 * @Author YANG
 * @Date 2019/3/14 16:10
 * @Version 1.0
 *
 * 使用JSR250
 *      @PostConstruct 对象创建并赋值之后调用
 *  	@PreDestroy 容器移除对象之前
 **/
@Component
public class Dog {
    @PostConstruct
    public void init() {
        System.out.println("dog init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("dog destroy");
    }
}
