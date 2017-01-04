package com.exaple.myfirstapp;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;
public class reg extends Activity{
	EditText USER_NAME,USER_PASS,CON_PASS;
	String user_name,user_pass,con_pass;
	Button REG;
	Context ctx = this;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main21);
		USER_NAME=(EditText) findViewById(R.id.user_name);
		USER_PASS=(EditText) findViewById(R.id.user_pass);
		CON_PASS=(EditText) findViewById(R.id.con_pass);
		REG=(Button) findViewById(R.id.b_login);
		REG.setOnClickListener(new OnClickListener(){
		public void onClick(View v){
			user_name = USER_NAME.getText().toString();
			user_pass = USER_PASS.getText().toString();
			con_pass = CON_PASS.getText().toString();
			
			
			
				dataoperations DB = new dataoperations(ctx);
				DB.putInformation(DB, user_name, user_pass);
				Toast.makeText(getBaseContext(), "registration success",Toast.LENGTH_SHORT).show();
				finish();
			
	}
		});
	}
}
