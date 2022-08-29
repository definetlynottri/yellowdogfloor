package testcases;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.badlogic.gdx.Gdx;
import com.mygdx.game.FrameworkHelpers;
import com.mygdx.game.ScreenClasses;

public class FrameworkHelpersTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void ScreenClassesEvent(){
		Gdx.app.log("game", "created");
		ScreenClasses testscreen=new ScreenClasses();
		FrameworkHelpers.GameScreenRender(testscreen);
	}

}
