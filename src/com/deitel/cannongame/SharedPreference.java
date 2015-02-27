package com.deitel.cannongame;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

public class SharedPreference {

	protected static SharedPreferences highScore_saved;
	protected static final String HIGHSCORE = "highScore";
	protected int highScore = 0;

	public SharedPreference() {
		super();
	}

	public void addHighestScore(Context context, int score) {
		highScore_saved = context.getSharedPreferences(HIGHSCORE, context.MODE_PRIVATE);
		SharedPreferences.Editor preferencesEditor = highScore_saved.edit();
		preferencesEditor.putInt("HighestScore", score);
		preferencesEditor.apply();

	}
	
	public int getHighestScore(Context context){
		   
		   highScore_saved = context.getSharedPreferences(HIGHSCORE, Context.MODE_PRIVATE);
		   highScore = highScore_saved.getInt("HighestScore", 0);
		   return highScore;
		   
	   }

}
