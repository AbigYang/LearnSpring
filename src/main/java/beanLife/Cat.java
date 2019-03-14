package beanLife;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @ClassName Cat
 * @Author YANG
 * @Date 2019/3/14 15:04
 * @Version 1.0
 *
 * 通过Bean实现InitializingBean、DisposableBean接口
 **/
@Component
public class Cat implements InitializingBean, DisposableBean {
    public void destroy() throws Exception {
        System.out.println("cat destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("cat init");
    }

    public Cat() {
        System.out.println("cat constructor");
    }
}
