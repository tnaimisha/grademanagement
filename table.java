package com.exaple.myfirstapp;

import android.provider.BaseColumns;

public class table {
	public table()
	{
		
	}
	public static abstract class tableinfo implements BaseColumns 
	{
	public static final String USER_NAME="user_name";
	public static final String USER_PASS="user_pass";
	public static final String DATABASE_NAME="user_information";
	public static final String TABLE_NAME="reg_information";
	
	}

}
