// CannonGame.java
// MainActivity displays the CannonGameFragment
package com.deitel.cannongame;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends Activity
{
   // called when the app first launches
	protected static SharedPreferences highScore_saved;
	protected static final String HIGHSCORE = "highScore";
	protected int highScore = 0;
   @Override
   public void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState); // call super's onCreate method
      highScore_saved = getSharedPreferences(HIGHSCORE, MODE_PRIVATE);
      setContentView(R.layout.activity_main); // inflate the layout
   } 
   
   protected void addHighestScore(int score){
	   SharedPreferences.Editor preferencesEditor = highScore_saved.edit();
	   preferencesEditor.putInt("HighestScore", score);
	   preferencesEditor.apply();
	   
   }
     
   protected void getHighestScore(){
	   
	   highScore_saved = getSharedPreferences(HIGHSCORE, MODE_PRIVATE);
	   highScore = highScore_saved.getInt("HighestScore", 0);
	   
   }

	public int getHighScore() {
		return highScore;
	}

	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}
   
   
} // end class MainActivity


