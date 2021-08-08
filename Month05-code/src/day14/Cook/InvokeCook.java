package day14.Cook;

/**
 * *
 * * @Description：实现cook
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年08月08日 12:01
 * *
 */
public class InvokeCook {
  public static void main(String[] args) {
    //TODO 请在此Lambda【标准格式】调用invokeCook方法
      invokeCook(()->{System.out.println("Food Done!");
            });
  }

  private static void invokeCook(Cook cook){
      cook.makeFood();
  }
}
