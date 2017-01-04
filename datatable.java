package com.exaple.myfirstapp;

import android.provider.BaseColumns;

public class datatable {
	public datatable()
	{
		
	}
	public static abstract class tableinfo implements BaseColumns 
	{
	public static final String USER_ID="user_id";
	public static final String USER_NAME="user_name";
	public static final String USER_CLASS="user_class";
	public static final String USER_SEC="user_sec";
	public static final String USER_PHONE="user_phone";
	public static final String USER_ADD="user_add";
	public static final String DATABASE_NAME="user_inf";
	public static final String TABLE_NAME="reg_inf";
	}
}
