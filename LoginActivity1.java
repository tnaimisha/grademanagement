package com.exaple.myfirstapp;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;
import android.database.Cursor;
public class LoginActivity1 extends Activity{
	Button Login;
	EditText USERNAME,USERPASS;
	String username,userpass;
	Context ctx=this;
protected void onCreate(Bundle savedInstanceState){
	
super.onCreate(savedInstanceState);
setContentView(R.layout.main8);
Login=(Button)findViewById(R.id.b_login);
USERNAME=(EditText)findViewById(R.id.user_name);
USERPASS=(EditText)findViewById(R.id.name);
Login.setOnClickListener(new OnClickListener(){
	public void onClick(View v){
		
	Bundle b=getIntent().getExtras();
	int status=b.getInt("status");
	if(status==1)
	{
		Toast.makeText(getBaseContext(), "please wait",Toast.LENGTH_LONG).show();
		username = USERNAME.getText().toString();
		userpass = USERPASS.getText().toString();
		databaseoperations dob=new databaseoperations(ctx);
		Cursor CR=dob.getInformation(dob);
		CR.moveToFirst();
		boolean loginstatus=false;
		String NAME="";
		do
		{
			if(username.equals(CR.getString(0)) && (userpass.equals(CR.getString(1))))
			{
				loginstatus=true;
				NAME = CR.getString(0);
			}
		
			
		}while(CR.moveToNext());
		if(loginstatus)
		{
			Toast.makeText(getBaseContext(), "login sucess "+NAME,Toast.LENGTH_LONG).show();
			Intent intent=new Intent(v.getContext(),Activity3.class);	
        	startActivityForResult(intent,0);
			finish();
			
			
		}
		else
		{
		
		Toast.makeText(getBaseContext(), "login failed ",Toast.LENGTH_LONG).show();
		finish();
		}
	}	
	
	}
});	

}
}
