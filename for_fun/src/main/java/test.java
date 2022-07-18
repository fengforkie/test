import com.google.gson.Gson;

import java.util.HashMap;

/**
 * 中文
 * @author fengforkie
 * @version 1.0
 * @since 17:07 2021/1/18
 */
public class test {

    private Integer one;

    private Integer age;

    private String name;

    private String address;

    public static void main(String[] args) {
        Gson gson = new Gson();
        try {
            gson.fromJson("+++", HashMap.class);
            System.out.println("true");
        }catch (Exception e){
            System.out.println("not json");
        }

    }
}
