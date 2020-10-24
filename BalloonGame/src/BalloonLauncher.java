/**
 * Created by DevM on 13-Jan-17.
 */
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class BalloonLauncher {
    public static void main (String[] args)    {
        BalloonGame myProgram = new BalloonGame();
        LwjglApplication launcher = new LwjglApplication( myProgram );
    }
}