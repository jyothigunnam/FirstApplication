package com.example.sasi.firstapplication;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;

import android.widget.ListView;

public class Main2Activity extends Activity {

    ListView lv;
    Context context;

    ArrayList prgmName;
    public static int [] prgmImages={R.drawable.ebay,R.drawable.ebay,R.drawable.ebay,R.drawable.ebay,R.drawable.ebay,R.drawable.ebay,R.drawable.ebay,R.drawable.ebay,R.drawable.ebay};
    public static String [] prgmNameList={"Let Us C","c++","JAVA","Jsp","Microsoft .Net","Android","PHP","Jquery","JavaScript"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;

        lv=(ListView) findViewById(R.id.listView);
        lv.setAdapter(new CustomlistView(this,prgmNameList,prgmImages));

    }



}