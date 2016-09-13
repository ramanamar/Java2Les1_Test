/**
 * Created by FlameXander on 09.09.2016.
 */
public class Pool extends Obstacle {
    private float distance;

    public Pool(float distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Sportsman s) {
        s.swim(distance);
    }
}
