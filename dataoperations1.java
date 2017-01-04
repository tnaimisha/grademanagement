package com.exaple.myfirstapp;

import com.exaple.myfirstapp.table1.tableinfo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class dataoperations1 extends SQLiteOpenHelper {

	public static final int database_version=1;
	public String CREATE_QUERY="CREATE TABLE "+tableinfo.TABLE_NAME+"("+tableinfo.USER_NAME+" TEXT,"+tableinfo.USER_PASS+" TEXT);";
	
	public dataoperations1(Context context) {
		super(context, tableinfo.DATABASE_NAME, null, database_version);
		Log.d("database operations", "database created");
	}

	@Override
	public void onCreate(SQLiteDatabase sdb) {
		
		sdb.execSQL(CREATE_QUERY);
		Log.d("database operations", "table created");

	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		

	}
	
	public void putInformation(dataoperations1 dB,String name,String pass)
	{
		SQLiteDatabase SQ=dB.getWritableDatabase();
		ContentValues cv=new ContentValues();
		cv.put(tableinfo.USER_NAME,name);
		cv.put(tableinfo.USER_PASS,pass);
		long k=SQ.insert(tableinfo.TABLE_NAME, null,cv);
	}
	public Cursor getInformation(dataoperations1 dob)

	{
		SQLiteDatabase SQ=dob.getReadableDatabase();
		String[] columns = {tableinfo.USER_NAME,tableinfo.USER_PASS};
		Cursor CR=SQ.query(tableinfo.TABLE_NAME,columns,null,null,null,null,null);
		return CR;
	}
		
	}

