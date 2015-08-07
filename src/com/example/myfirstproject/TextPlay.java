package com.example.myfirstproject;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlay extends Activity implements View.OnClickListener{
	Button chkCmd;
	ToggleButton passTog;
	EditText input;
	TextView display ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text);
		baconAndEggs();
		
		passTog.setOnClickListener(this); 
		chkCmd.setOnClickListener(this);
		
		
	}

	private void baconAndEggs() {
		// TODO Auto-generated method stub
		chkCmd = (Button) findViewById(R.id.bResults);
		passTog = (ToggleButton) findViewById(R.id.tbPassword);
		input = (EditText) findViewById(R.id.etCommands);
		display =(TextView) findViewById(R.id.tvResults);
	}

	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		switch(view.getId()){
		case R.id.bResults:
			String check = input.getText().toString();
			if(check.contentEquals("asdf")){
				display.setGravity(Gravity.RIGHT);
			}
			else
			{
				display.setText("Error!!!");
				display.setTextColor(Color.RED);
				display.setGravity(Gravity.CENTER);
			}
			break;
			
		case R.id.tbPassword:
			if(passTog.isChecked())
			{
				input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
			}
			else{
				input.setInputType(InputType.TYPE_CLASS_TEXT);
			}
			break;
		
		}
	}
	

}
