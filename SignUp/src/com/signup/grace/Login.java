package com.signup.grace;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Activity {
	
	Button login;
	Button btnlogin;
	EditText txtpwd, txtphone;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		login = (Button)findViewById(R.id.btnlogin);
		txtphone = (EditText)findViewById(R.id.txtphone);
		txtpwd = (EditText)findViewById(R.id.txtpwd);
		
		
		login.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent home = new Intent(getApplicationContext(),Home.class);
				home.putExtra("phonenumber", txtphone.getText().toString());
				home.putExtra("password", txtpwd.getText().toString());
				startActivity(home);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
