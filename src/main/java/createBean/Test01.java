package createBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import createBean.service.MessageService;

/**
 * @ClassName createBean.Test01 （xml配置获取bean）
 * @Author YANG
 * @Date 2019/2/23 10:11
 * @Version 1.0
 **/
public class Test01 {

  public static void main(String[] args) {


    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");

    MessageService messageService = context.getBean(MessageService.class);

    System.out.println(messageService.getMessage());
  }

}
