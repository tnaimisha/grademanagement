package com.exaple.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;


public class Activity51 extends ActionBarActivity {
int status=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main5);
        Button button1=(Button)findViewById(R.id.click);
        button1.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){	
        	Intent intent=new Intent(v.getContext(),reg1.class);	
        	startActivityForResult(intent,0);
        	}
        });
        Button buttonx=(Button)findViewById(R.id.view);
        buttonx.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        		status=1;
        		Bundle c=new Bundle();
        		c.putInt("status", status);
        		Intent intent=new Intent(v.getContext(),finaldbs1.class);
        		intent.putExtras(c);
        		startActivityForResult(intent,0);
        	
        	}
        });
    
        	}
        	
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
