/**
 * Created by Raman Kryvasheyeu on 13.09.2016.
 */
public class TrimTrail/* extends Obstacle*/{
    private TrimTrail[] trails;

    public void TrimTrail(Obstacle[] obstacles) {
        this.obstacles = obstacles;

    }
    //@Override
    public void doIt(Team team) {
            for (Obstacle o : obstacles) {
                o.doIt(team.getTeam());
             //   if (!s.isOnDistance()) break;
            }
        }
    }
}
