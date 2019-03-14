package createBean.entity;

import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName MyColorBeanFactory
 * @Author YANG
 * @Date 2019/3/1 16:36
 * @Version 1.0
 **/
public class MyColorBeanFactory implements FactoryBean<Color> {

  public Color getObject() throws Exception {
    return new Color();
  }

  public Class<?> getObjectType() {
    return Color.class;
  }

  public boolean isSingleton() {
    return true;
  }
}
