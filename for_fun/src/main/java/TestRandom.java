import java.util.Random;

public class TestRandom {

    public static void main(String[] args) {
        Random random = new Random(33);

        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
    }
}
