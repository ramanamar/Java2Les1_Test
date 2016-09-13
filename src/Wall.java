/**
 * Created by FlameXander on 09.09.2016.
 */
public class Wall extends Obstacle {
    private float height;

    public Wall(float height) {
        this.height = height;
    }

    @Override
    public void doIt(Sportsman s) {
        s.jump(height);
    }
}
