package beanLife;

/**
 * @ClassName Car
 * @Author YANG
 * @Date 2019/3/1 17:29
 * @Version 1.0
 **/
public class Car {
  public Car() {
    System.out.println("构造方法");
  }

  private void init() {
    System.out.println("初始化Bean");
  }

  private void destory() {
    System.out.println("销毁Bean");
  }
}
