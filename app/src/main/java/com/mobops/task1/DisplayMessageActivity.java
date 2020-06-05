package com.mobops.task1;
import android.os.Bundle;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        final ListView listView=findViewById(R.id.list_view);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Eggs");
        arrayList.add("Meat");
        arrayList.add("Bread");
        arrayList.add("Rice");
        arrayList.add("Milk");
        arrayList.add("Soda");
        arrayList.add("Cheese");
        arrayList.add("Sauce");
        arrayList.add("Oil");
        arrayList.add("Biscuits");
        arrayList.add("Fruits");
        arrayList.add("Vegetables");
        arrayList.add("Butter");
        arrayList.add("Sugar");
        arrayList.add("Salt");
        arrayList.add("Coffee Powder");
        arrayList.add("Wheat");
        arrayList.add("Jaggery");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String clickedItem=(String) listView.getItemAtPosition(position);
                Toast.makeText(DisplayMessageActivity.this,clickedItem,Toast.LENGTH_LONG).show();
            }
        });
    }
}
