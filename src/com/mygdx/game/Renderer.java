package com.mygdx.game;

import java.util.Collection;

public class Renderer extends GameScreen  {
	// renders a single screen type (usually a world
	private void renderSingle(GameScreen e) {
		e.render();
	}
	
	// renders multiple
	private void renderMulti(Collection<GameScreen> e) {
		for(GameScreen x: e) {
			renderSingle(x);
		}
	}
	
}
