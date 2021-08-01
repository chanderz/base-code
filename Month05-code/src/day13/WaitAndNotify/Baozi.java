package day13.WaitAndNotify;

/**
 * *
 * * @Description：resource class
 * *
 * * @Author：Zhaozheng
 * *
 * * @CreateTime：2021年08月01日 13:18
 * *
 */
public class Baozi {
    private String Pi;
    private String Xian;
    public boolean condition;

    public Baozi(String pi, String xian, boolean condition) {
        Pi = pi;
        Xian = xian;
        this.condition = condition;
    }

    public Baozi() {
    }

    public String getPi() {
        return Pi;
    }

    public void setPi(String pi) {
        Pi = pi;
    }

    public String getXian() {
        return Xian;
    }

    public void setXian(String xian) {
        Xian = xian;
    }

}
