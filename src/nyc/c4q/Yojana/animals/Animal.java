package nyc.c4q.Yojana.animals;

/**
 * Created by yojanasharma on 9/3/16.
 */
public abstract class Animal {
    public abstract String vocalise();
    public void move(){
        System.out.println(getClass().getName() + "I just moved.");
    }
}
