package beanLife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Test01
 * @Author YANG
 * @Date 2019/3/7 14:52
 * @Version 1.0
 **/
public class Test01 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigOfBeanLife.class);
        //容器创建成功前就已经创建了bean并初始化
        System.out.println("容器创建成功。。。。。");
        //关闭容器
        ((AnnotationConfigApplicationContext) context).close();

    }
}
