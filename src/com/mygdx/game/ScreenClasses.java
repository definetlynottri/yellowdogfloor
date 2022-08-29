package com.mygdx.game;
import java.util.ArrayList;
import java.util.HashSet;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class ScreenClasses extends CoreGameClass implements Screen {
	private Music ScreenSound;
	
	protected HashSet<Actor> GameSceneActorList;
	protected Stage GameSceneStage;
	protected HashSet<InputEvent> ScreenInputEventList;
	protected ArrayList<Event> ScreenEventList;
	
	
	// getters and setters for elements and audio

	public void setScreenSound(Music screenSound) {
		ScreenSound = screenSound;
	}
	public HashSet<Actor> getGameSceneActorList() {
		return GameSceneActorList;
	}
	public Stage getGameSceneStage() {
		return GameSceneStage;
	}
	public ArrayList<Event> getScreenEventList() {
		return ScreenEventList;
	}
	public HashSet<InputEvent> getScreenInputEventList() {
		return ScreenInputEventList;
	}
	public Music getScreenSound() {
		return ScreenSound;
	}
	public void setGameSceneActorList(HashSet<Actor> gameSceneActorList) {
		GameSceneActorList = gameSceneActorList;
	}
	public void setGameSceneStage(Stage gameSceneStage) {
		GameSceneStage = gameSceneStage;
	}
	public void setScreenEventList(ArrayList<Event> screenEventList) {
		ScreenEventList = screenEventList;
	}
	public void setScreenInputEventList(HashSet<InputEvent> screenInputEventList) {
		ScreenInputEventList = screenInputEventList;
	}
	
	//add methods for collections 
	public void addActor(Actor e) {
		this.GameSceneActorList.add(e);
	}
	public void addElementsToStage() {
		for (Actor x : GameSceneActorList) {
			GameSceneStage.addActor(x);
		}
	}
	
	public void addEvent(Event e) {
		this.ScreenEventList.add(e);
	}
	
	public void addInputEvent(Event e) {
		this.ScreenEventList.add(e);
	}
	
	// interface classes
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		addElementsToStage();
		FrameworkHelpers.GameScreenRender(this);
		FrameworkHelpers.AudioRender(ScreenSound);
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}
	
	public ScreenClasses() {
		GameSceneActorList= new HashSet<>();
		ScreenEventList= new ArrayList<>();
		ScreenInputEventList= new HashSet<>();
		GameSceneStage= new Stage();
		addElementsToStage();
		
	}

	
		
	}
	

