package com.example.xenogoldtracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class BladePage extends AppCompatActivity {
    private ArrayList<bladeList> bladeListArrayList;
    private RecyclerView recyclerView_Blade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blade_page);
        recyclerView_Blade = findViewById(R.id.recyclerView_Blade);
        bladeListArrayList = new ArrayList<>();

        setBladeInfo();
        setAdapter();
    }

    private void setAdapter() {
        BladeRecyclerAdapter adapter = new BladeRecyclerAdapter(bladeListArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView_Blade.setLayoutManager(layoutManager);
        recyclerView_Blade.setItemAnimator(new DefaultItemAnimator());
        recyclerView_Blade.setAdapter(adapter);
    }

    private void setBladeInfo() {
        bladeListArrayList.add(new bladeList("Bridget","Tank"));
        bladeListArrayList.add(new bladeList("Mythra","DPS"));
        bladeListArrayList.add(new bladeList("2Blade","ROLE"));
        bladeListArrayList.add(new bladeList("2Blade","ROLE"));
        bladeListArrayList.add(new bladeList("Bridget","Tank"));
        bladeListArrayList.add(new bladeList("Mythra","DPS"));
        bladeListArrayList.add(new bladeList("2Blade","ROLE"));
        bladeListArrayList.add(new bladeList("2Blade","ROLE"));
        bladeListArrayList.add(new bladeList("Bridget","Tank"));
        bladeListArrayList.add(new bladeList("Mythra","DPS"));
        bladeListArrayList.add(new bladeList("2Blade","ROLE"));
        bladeListArrayList.add(new bladeList("2Blade","ROLE"));
        bladeListArrayList.add(new bladeList("Bridget","Tank"));
        bladeListArrayList.add(new bladeList("Mythra","DPS"));
        bladeListArrayList.add(new bladeList("2Blade","ROLE"));
        bladeListArrayList.add(new bladeList("2Blade","ROLE"));  bladeListArrayList.add(new bladeList("Bridget","Tank"));
        bladeListArrayList.add(new bladeList("Mythra","DPS"));
        bladeListArrayList.add(new bladeList("2Blade","ROLE"));
        bladeListArrayList.add(new bladeList("2Blade","ROLE"));


    }
}