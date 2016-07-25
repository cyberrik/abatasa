package com.abatasa.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class Abatasa extends ApplicationAdapter {
	Stage stage;
	TextButton textButton;
	TextButton.TextButtonStyle textButtonStyle;
	BitmapFont bitmapFont;
	Skin skin;
	TextureAtlas textureAtlas;

	@Override
	public void create () {
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);
		bitmapFont = new BitmapFont();
		skin = new Skin();
		textureAtlas = new TextureAtlas(Gdx.files.internal("img/button.atlas"));
		skin.addRegions(textureAtlas);
		textButtonStyle = new TextButton.TextButtonStyle();
		textButtonStyle.up = skin.getDrawable("orange-button-hi");
		textButtonStyle.down = skin.getDrawable("red-button-hi");
		textButton = new TextButton("button 1", textButtonStyle);
	}

	@Override
	public void render () {
		super.render();
		stage.draw();
	}
}
