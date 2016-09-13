/**
 * Created by FlameXander on 09.09.2016.
 */
public class Trail extends Obstacle {
    private float distance;

    public Trail(float distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Sportsman s) {
        s.run(distance);
    }
}
