import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.graphics.Texture;

public class Balloon extends BaseActor {
    public float speed;
    public float amplitude;
    public float oscillation;
    public float initialY;
    public float time;
    public int offsetX;

    public Balloon()    {
        speed       = 80    * MathUtils.random(0.5f, 2.0f);
        amplitude   = 50    * MathUtils.random(0.5f, 2.0f);
        oscillation = 0.01f * MathUtils.random(0.5f, 2.0f);
        initialY    = 120   * MathUtils.random(0.5f, 2.0f);
        time = 0;
        offsetX = -100;
        int random = MathUtils.random(0,2);
        if(random==0)
            setTexture( new Texture( Gdx.files.internal("assets/red-balloon.png")) );
        else if(random==1)
            setTexture( new Texture( Gdx.files.internal("assets/green-balloon.png")) );
        else {
            setTexture( new Texture( Gdx.files.internal("assets/gray-balloon.png")) );
        }
        //setSize(75.0F, 75.0F);
        // initial spawn location off-screen
         setX(offsetX);
    }

    public void act(float dt)    {
        super.act(dt);
        time += dt;
        // set starting location to left of window
        float xPos = speed * time + offsetX;
        float yPos = amplitude * MathUtils.sin(oscillation * xPos) + initialY;
        setPosition( xPos, yPos );
    }
}
