public class testMath {

    public static void main(String[] args) {
        double fateAndQuality = Double.valueOf("56");
        double fateD = Math.floor(fateAndQuality);

        if(fateD != fateAndQuality){
            //配置了元核品质
            Double quality = fateAndQuality % 1 * 10;

        }

        long temp = Double.valueOf(fateD).longValue();

    }
}
