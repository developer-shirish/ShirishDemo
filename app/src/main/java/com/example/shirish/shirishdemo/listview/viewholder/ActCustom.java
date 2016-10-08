package com.example.shirish.shirishdemo.listview.viewholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.shirish.shirishdemo.R;

import java.util.ArrayList;

public class ActCustom extends AppCompatActivity {

    ListView listView;
    DemoAdapter demoAdapter;
    ArrayList<PoJo> poJoArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_custom);

        listView = (ListView) findViewById(R.id.list_list);
        demoAdapter = new DemoAdapter(ActCustom.this, getItemData());
        listView.setAdapter(demoAdapter);
        demoAdapter.notifyDataSetChanged();

    }

    public ArrayList<PoJo> getItemData(){
        poJoArrayList.add(new PoJo("Shirish","25", "Tamrind park, Dhyari, Pune"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));
        poJoArrayList.add(new PoJo("Adam","20","California, USA"));


        return poJoArrayList;
    }
}
