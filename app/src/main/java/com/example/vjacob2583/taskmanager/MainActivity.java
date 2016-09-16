package com.example.vjacob2583.taskmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //List of Member Variables
    ArrayList items = new ArrayList<String>();
    ArrayAdapter<String> myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialisation

       myAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);

       ListView myList = (ListView)findViewById(R.id.listView);
       myList.setAdapter(myAdapter);
    }

    void AddTask(View v)
    {
        EditText mEdit   = (EditText)findViewById(R.id.editText);
        items.add(mEdit.getText().toString());
        myAdapter.notifyDataSetChanged();
    }
}
