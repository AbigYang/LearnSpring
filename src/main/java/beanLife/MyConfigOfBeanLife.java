package beanLife;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyConfigOfBeanLife bean的生命周期
 * @Author YANG
 * @Date 2019/3/1 17:28
 * @Version 1.0
 *
 * 容器管理bean的生命周期
 * 构造：
 *  单实例：容器启动是创建对象
 *  多实例：每次获取对象时创建对象
 * 初始化：
 *  对象创建完成，并赋值，调用初始化方法
 * 销毁：
 *  容器关闭时销毁
 **/
@ComponentScan("beanLife")
@Configuration
public class MyConfigOfBeanLife {
  //自定义定义初始化方法及销毁方法
  @Bean(value = "Car",initMethod = "init",destroyMethod = "destory")
  public Car getCar() {
    return new Car();
  }
}
