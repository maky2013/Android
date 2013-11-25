package com.signup.grace;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Register extends Activity {
	
	protected static final Intent spinnerpschool1 = null;
	Button backhome;
	RadioGroup radiogroupgender;
	Spinner  spinnerdob,spinnercourse,spinnerpschool;
	EditText txtname;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
		spinnerdob= (Spinner)findViewById(R.id.spdob);
		
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
		        R.array.Age_arrays, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		spinnerdob.setAdapter(adapter);
		
        spinnercourse= (Spinner)findViewById(R.id.spcourse);
		
		ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
		        R.array.course_arrays, android.R.layout.simple_spinner_item);
		adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		spinnercourse.setAdapter(adapter1);
		
       spinnerpschool= (Spinner)findViewById(R.id.spprevschool);
		
		ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
		        R.array.pschool_arrays, android.R.layout.simple_spinner_item);
		adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		spinnerpschool.setAdapter(adapter2);
		
		
		
		backhome = (Button)findViewById(R.id.btnbackhome);
		radiogroupgender = (RadioGroup)findViewById(R.id.radioGroup1);
		txtname= (EditText)findViewById(R.id.edittextname);
		
		
		
		
		backhome.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int gender = radiogroupgender.getCheckedRadioButtonId();
				
				RadioButton rbutton = (RadioButton)findViewById(gender);
				
				String gen = rbutton.getText().toString();
				String school= (String) spinnerpschool.getSelectedItem();
				String course =(String) spinnercourse.getSelectedItem();
				String age =(String) spinnerdob.getSelectedItem();
				String name =(String) txtname.getText().toString();
		
				
				
				
				
				
				Intent back2home = new Intent(getApplicationContext(),Home.class);
				back2home.putExtra("gender", gen);
				back2home.putExtra(" prev school",school);
				back2home.putExtra("Date of Birth", age);
				back2home.putExtra("Course", course);
				back2home.putExtra("name", name);
				
				startActivity(back2home);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
		return true;
	}

}
