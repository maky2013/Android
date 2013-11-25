package com.signup.grace;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Home extends Activity {
	
	private static final CharSequence previousschool = null;
	Button register;
	TextView tvpwd, tvphone,tvgender, tvage,tvcourse,tvschool,tvname;
	
	String phone,pwd,gender,school,Course, name, Age ;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		tvphone = (TextView)findViewById(R.id.tvphonenumber);
		tvpwd = (TextView)findViewById(R.id.tvpassword);
		tvgender = (TextView)findViewById(R.id.tvgender);
		tvage= (TextView)findViewById(R.id.tvage);
		tvcourse=(TextView)findViewById(R.id.tvcourse);
		tvname=(TextView)findViewById(R.id.tvname);
		tvschool=(TextView)findViewById(R.id.tvschool);
		
		
		Intent string = getIntent();
		
		pwd = string.getStringExtra("password");
		phone = string.getStringExtra("phonenumber");
		gender = string.getStringExtra("gender");
		school = string.getStringExtra("previous school");
		Course = string.getStringExtra("Course");
		name = string.getStringExtra("name");
		Age = string.getStringExtra("Date of Birth");
		
		
		
		tvgender.setText(gender);
		tvphone.setText(phone);
		tvpwd.setText(pwd);
		tvname.setText(name);
		tvage.setText(Age);
		tvcourse.setText(Course);
		tvschool.setText(school);
		
		

		
		
		
		
		
		
		register = (Button)findViewById(R.id.btnregister);
		register.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent register = new Intent(getApplicationContext(),Register.class);
				startActivity(register);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

}
