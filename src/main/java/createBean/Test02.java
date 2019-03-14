package createBean;

import createBean.config.MyConfig;
import createBean.entity.MyColorBeanFactory;
import createBean.entity.Person;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName createBean.Test02  （注解方式获取bean）
 * @Author YANG
 * @Date 2019/3/1 15:22
 * @Version 1.0
 **/
public class Test02 {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

    //默认单例
    Person bean = applicationContext.getBean(Person.class);
    //改变对象而不是引用
    bean.setAge("35");
    bean.setName("54");
    System.out.println(bean);

    System.out.println(applicationContext.getBean(Person.class));
    System.out.println(applicationContext.getBean("Person")==bean);

    Map<String, Person> beansOfType = applicationContext.getBeansOfType(Person.class);
    System.out.println(beansOfType);

    String[] names = applicationContext.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(name);
    }

    //得到Color
    System.out.println(applicationContext.getBean("getColorFactory"));
    //加&前缀得到MyColorBeanFactory本身
    System.out.println(applicationContext.getBean("&getColorFactory"));
    System.out.println(applicationContext.getBean(MyColorBeanFactory.class));
  }

}
