package generator;

public class SequenceGenerator implements Generator{

    private static int idSequence;
    @Override
    public int next() {
        return ++idSequence;
    }
}
