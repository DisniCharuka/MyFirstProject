package com.example.myfirstproject;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Spinners2 extends Activity {

	Spinner spinner1, spinner2;
	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spinners2);

		addItemsOnSpinner2();
		addListenerOnButton();
		addListenerOnSpinnerItemSelection();

	}

	private void addListenerOnSpinnerItemSelection() {
		// TODO Auto-generated method stub
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner1.setOnItemSelectedListener(new MyOnItemSelectedListener());

	}

	private void addListenerOnButton() {
		// TODO Auto-generated method stub
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		button = (Button) findViewById(R.id.button1);
		/*button.setOnClickListener(new OnClickListener() {
			@Override

			public void onClick(View v) {

				Toast.makeText(Spinners2.this,
						"Result : " + "\nSpinner 1 : " + String.valueOf(spinner1.getSelectedItem()) + "\nSpinner 2 : "
								+ String.valueOf(spinner2.getSelectedItem()),
						Toast.LENGTH_SHORT).show();
			}
		});*/

	}

	private void addItemsOnSpinner2() {
		// TODO Auto-generated method stub
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		List list = new ArrayList();
		list.add("Item 1");
		list.add("Item 2");
		list.add("Item 3");
		list.add("Item 4");
		ArrayAdapter dataAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter);
	}

}
