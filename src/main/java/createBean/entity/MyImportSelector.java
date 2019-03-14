package createBean.entity;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName MyImportSelector （根据全类名注册Bean）
 * @Author YANG
 * @Date 2019/3/1 16:18
 * @Version 1.0
 **/
public class MyImportSelector implements ImportSelector {

  public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    //importingClassMetadata可以得到注解信息
    return new String[]{"createBean.entity.Blue","createBean.entity.Red"};
  }
}
