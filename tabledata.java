package com.exaple.myfirstapp;

import android.provider.BaseColumns;

public class tabledata {
	public tabledata()
	{
		
	}
	public static abstract class tableinfo implements BaseColumns 
	{
	public static final String USER_NAME="user_name";
	public static final String USER_PASS="user_pass";
	public static final String DATABASE_NAME="user_info";
	public static final String TABLE_NAME="reg_info";
	}
}
