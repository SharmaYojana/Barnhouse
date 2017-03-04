package nyc.c4q.Yojana.animals;

/**
 * Created by yojanasharma on 9/3/16.
 */
public class Siamese extends Cat {
    @Override
    public String vocalise() {
        return super.vocalise() + super.vocalise() + super.vocalise();
    }
}
