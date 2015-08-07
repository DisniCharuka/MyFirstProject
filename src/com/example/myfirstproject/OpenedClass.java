package com.example.myfirstproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class OpenedClass extends Activity implements OnClickListener, OnCheckedChangeListener{

	TextView question, test;
	Button returnData;
	RadioGroup selectionList;
	String gotBread;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.send);
		initialize();
		Bundle gotBasket = getIntent().getExtras();
		gotBread = gotBasket.getString("key");
		question.setText(gotBread);
		
	}
	private void initialize() {
		// TODO Auto-generated method stub
		question = (TextView) findViewById(R.id.tvQuestion);
		test = (TextView) findViewById(R.id.tvText);
		returnData = (Button) findViewById(R.id.bReturn);
		returnData.setOnClickListener(this);
		selectionList = (RadioGroup) findViewById(R.id.rgAnswers);
		selectionList.setOnCheckedChangeListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		switch(arg1){
		case R.id.rGood:
			break;
		case R.id.rBad:
			break;
		case R.id.rBoth:
			break;
		
		}
	}
	
	
	
	
}
