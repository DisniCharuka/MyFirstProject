package com.example.myfirstproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle PrettyGirl) {
		// TODO Auto-generated method stub
		super.onCreate(PrettyGirl);
		setContentView(R.layout.splash);
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(2000);
					
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}finally{
					Intent openStartingPoint = new Intent("com.example.myfirstproject.MENU");
					startActivity(openStartingPoint);
				}
			}
		};
		timer.start();
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}
