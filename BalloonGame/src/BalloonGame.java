/**
 * Created by DevM on 13-Jan-17.
 */
import com.badlogic.gdx.Game;
public class BalloonGame extends Game {
    public void create()    {
        BalloonLevel bl = new BalloonLevel(this);
        setScreen( bl );
    }
}