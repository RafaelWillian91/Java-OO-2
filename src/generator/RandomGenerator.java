package generator;

import java.util.Random;

public class RandomGenerator implements Generator{
    private Random r = new Random();
    @Override
    public int next() {
        return r.nextInt(1, 10);
    }
}
