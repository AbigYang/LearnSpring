package createBean.config;

import createBean.entity.Color;
import createBean.entity.MyColorBeanFactory;
import createBean.entity.MyImportSelector;
import createBean.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

/**
 * @ClassName MyConfig
 * @Author YANG
 * @Date 2019/3/1 15:19
 * @Version 1.0
 **/
/**
 * 给容器中注册组件
 * 1）、@Service、@Controller等
 * 2）、@Bean【导入第三方包里面的组件】
 * 3）、@Import【快速给容器中导入组件】
 *  1、@Import
 *  2、实现ImportSelector，返回类的全类名数组 *****
 *  3、实现ImportBeanDefinitionRegistrar 手动注册bean导容器中
 * 4）、实现FactoryBean
 */
//满足条件生效
//@Conditional()
@Configuration
//快速导入组件 默认值为全类名 可以导多个
@Import({Color.class, MyImportSelector.class})
public class MyConfig {

  /**
   * 单实例：ioc容器启动会调用方法创建对象到容器中 以后每次获取就是从容器中获取
   * 多实例：IOC启动并不调用方法创建对象到容器，而是获取时创建对象，获取几次则创建几次
   *
   * 单实例：懒加载 第一次获取时才加载
   * @return
   */
  //多实例
//  @Scope("prototype")
  //懒加载
  @Lazy
  @Bean("Person") //不指定则bean取方法名
  public Person getPerson() {
    return new Person("lili", "22");
  }

  /**
   * bean的名字为方法名（默认），bean的类型为getObject()创建的对象
   * 给id前加一个&则得到工厂Bean本身
   * @return
   */
  @Bean
  public MyColorBeanFactory getColorFactory() {
    return new MyColorBeanFactory();
  }
}
