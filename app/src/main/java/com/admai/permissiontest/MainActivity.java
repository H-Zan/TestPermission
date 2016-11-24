package com.admai.permissiontest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.admai.permissiontest.Json.JsonResolver;
import com.admai.permissiontest.bean.MaiAd;

public class MainActivity extends AppCompatActivity {
	
	private static final String TAG = MainActivity.class.getSimpleName();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		MaiManager maiManager=new MaiManager(this);
//		String string = maiManager.getString();
//		Log.e(TAG, string );

		String jsonS2 ="{\n" +
		               "\"pid\" : \"990100100\",\n" +
		               " \"uuid\" : \"hhhhhhhhhhhhhhhhhhhhhhhhhhhh\",\n" +
		               " \"bc\" : \"51A576B071374BA1A4998718C8F827D2\",\n" +
		               "  \"etype\" : \"1\",\n" +
		               " \"type\" : 1,\n" +
		               "  \"src\" : \"http://d.hiphotos.baidu.com/zhidao/pic/item/ca1349540923dd54e5c27f09d309b3de9c82481a.jpg\",\n" +
		               "  \"adw\" : 320,\n" +
		               " \"adh\" : 50,\n" +
		               "\"ldp\" : \"http://pic48.nipic.com/file/20140919/19404114_112216356000_2.jpg\",\n" +
		               " \"cm\" : [ ],\n" +
		               "\"pm\" : [ ],\n" +
		               "\"adct\" : 1\n" +
		               " }";
		
//		MaiAd maiAd = null;
//		try {
//			maiAd = JsonResolver.fromJson(jsonS2,MaiAd.class);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		String s = maiAd.toString();
//		Log.e(TAG, s );
		
		MaiAd maiad= new MaiAd();
		maiad.pid = "a";
		maiad.uuid = "b";
		maiad.type = 1;
		maiad.ldp = "wwwwwwwwwwww";
		String s = null;
		try {
			s = JsonResolver.toJson(maiad, MaiAd.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Log.e(TAG, s);
//		
		
	}
}
