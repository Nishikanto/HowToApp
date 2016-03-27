package com.nishikanto.howtoapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private ArrayList<String> ItemList;
    private ArrayAdapter adapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        listView = (ListView) findViewById(R.id.list_item);

        ItemList = new ArrayList<>();
        ItemList.add("How To Make Pizza");
        ItemList.add("How To Keep Body Fit");
        ItemList.add("How To Control Anger");
        ItemList.add("How To Speak English Fluently");
        ItemList.add("How To Be a Better Student");


        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ItemList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent PizzaMaking = new Intent(MainActivity.this, Pizza.class);
                    startActivity(PizzaMaking);
                }
                else if(position==1){
                    Intent PizzaMaking = new Intent(MainActivity.this, HowToKeepBodyFit.class);
                    startActivity(PizzaMaking);
                }
                else if(position==2){
                    Intent PizzaMaking = new Intent(MainActivity.this, HowToControllAgner.class);
                    startActivity(PizzaMaking);
                }
                else if(position==3){
                    Intent PizzaMaking = new Intent(MainActivity.this, HowToSpeakEnglish.class);
                    startActivity(PizzaMaking);
                }
                else if(position==4){
                    Intent PizzaMaking = new Intent(MainActivity.this, HowToBeBetterStudent.class);
                    startActivity(PizzaMaking);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
