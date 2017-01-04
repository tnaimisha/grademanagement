package com.exaple.myfirstapp;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;
import android.database.Cursor;
public class finaldbs1 extends Activity{
	Button Login;
	EditText USERNAME,USERPASS;
	String username,userpass;
	Context ctx=this;
protected void onCreate(Bundle savedInstanceState){
	
super.onCreate(savedInstanceState);
setContentView(R.layout.main222);
Login=(Button)findViewById(R.id.b_login);
USERNAME=(EditText)findViewById(R.id.user_name);
Login.setOnClickListener(new OnClickListener(){
	public void onClick(View v){
		
	Bundle b=getIntent().getExtras();
	int status=b.getInt("status");
	if(status==1)
	{
		Toast.makeText(getBaseContext(), "please wait",Toast.LENGTH_LONG).show();
		username = USERNAME.getText().toString();
		dataoperations1 dob=new dataoperations1(ctx);
		Cursor CR=dob.getInformation(dob);
		CR.moveToFirst();
		boolean loginstatus=false;
		String NAME="";
		String PASS="";
		do
		{
			if(username.equals(CR.getString(0)))
			{
				loginstatus=true;
				NAME = CR.getString(0);
				PASS = CR.getString(1);
				
			}
		
			
		}while(CR.moveToNext());
		if(loginstatus)
		{
			Toast.makeText(getBaseContext(), "hi "+NAME+" "+PASS,Toast.LENGTH_LONG).show();
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
