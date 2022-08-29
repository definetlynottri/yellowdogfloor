package testcases;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.mygdx.game.ScreenClasses;

public class ScreenClassesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ScreenClasses testscreen=new ScreenClasses();
	}

	@Test 
	//tests add function and hashset
	public void ScreenClassesAddArray() {
		ScreenClasses testscreen=new ScreenClasses();
		Actor Actor1=new Actor();
		testscreen.addActor(Actor1);
		Assert.assertTrue(testscreen.getGameSceneActorList().contains(Actor1));
	}
	@Test
	public void ScreenClassesEvent() {
		ScreenClasses testscreen=new ScreenClasses();
		Event Event1=new Event();
		testscreen.addEvent(Event1);
		Assert.assertTrue(testscreen.getScreenEventList().contains(Event1));
	}
	
	@Test
	public void ScreenClassesRender() {
		ScreenClasses testscreen=new ScreenClasses();
		Actor Actor1=new Actor();
		testscreen.addActor(Actor1);
		testscreen.render();
	}
	
	@Test
	public void ScreenClassesMusic() {
		ScreenClasses testscreen=new ScreenClasses();
		testscreen.setScreenSound(null);
		Assert.assertTrue(testscreen.getScreenSound()==null);
	}
		

}
