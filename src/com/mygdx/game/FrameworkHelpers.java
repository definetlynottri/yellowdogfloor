package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class FrameworkHelpers extends CoreGameClass {
	
	// to render audio
	public static void AudioRender(Music RenderMusic) {
		Gdx.audio.newMusic((FileHandle) RenderMusic);
	}
	// to render screen
	public static void GameScreenRender(ScreenClasses screen){
	
			screen.getGameSceneStage().draw();
		
	}
	
}
