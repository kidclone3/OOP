package menu;

import java.lang.reflect.Method;

public interface RunMethod {
  static void runMethod(String className) {
    try {
      Class<?> tmp = Class.forName(className);
      Method method = tmp.getDeclaredMethod("main", String[].class);
      method.invoke(null, new Object[] {null});
    } catch (Throwable e) {
      System.err.println(e);
    }
  }
}
