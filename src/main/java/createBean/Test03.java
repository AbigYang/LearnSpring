package createBean;

import createBean.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @ClassName createBean.Test03
 * @Author YANG
 * @Date 2019/3/1 15:47
 * @Version 1.0
 **/
public class Test03 {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
    //获取操作系统
    Environment environment = applicationContext.getEnvironment();
    String property = environment.getProperty("os.name");
    System.out.println(property);
  }

}
