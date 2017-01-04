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

public class Activity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        Button button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new OnClickListener(){
        public void onClick(View v){	
        Intent intent=new Intent(v.getContext(),loginform1.class);
        startActivityForResult(intent,0);
        }
        });
        Button button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new OnClickListener(){
        public void onClick(View v){
        	
        Intent intent=new Intent(v.getContext(),loginform2.class);
        startActivityForResult(intent,0);
        }
        });
        Button button5=(Button)findViewById(R.id.button5);
        button5.setOnClickListener(new OnClickListener(){
        	public void onClick(View v){
        	Intent intent=new Intent(v.getContext(),loginform.class);
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
