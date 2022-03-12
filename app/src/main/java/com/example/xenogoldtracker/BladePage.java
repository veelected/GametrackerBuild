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
        bladeListArrayList.add(new bladeList("Finch", "Tank"));
        bladeListArrayList.add(new bladeList("Perceval", "Tank"));
        bladeListArrayList.add(new bladeList("Poppibuster", "Tank"));
        bladeListArrayList.add(new bladeList("Floren", "Healer"));
        bladeListArrayList.add(new bladeList("Dagas", "Attacker"));
        bladeListArrayList.add(new bladeList("Azami", "Attacker"));
        bladeListArrayList.add(new bladeList("Nim", "Healer"));
        bladeListArrayList.add(new bladeList("Electra", "Shield Hammer"));
        bladeListArrayList.add(new bladeList("Perun", "Attacker"));
        bladeListArrayList.add(new bladeList("Adenine", "Healer"));
        bladeListArrayList.add(new bladeList("Newt", "Tank"));
        bladeListArrayList.add(new bladeList("Gorg", "Attacker"));
        bladeListArrayList.add(new bladeList("Kora", "Healer"));
        bladeListArrayList.add(new bladeList("Vess", "Bitball"));
        bladeListArrayList.add(new bladeList("Boreas", "Bitball"));
        bladeListArrayList.add(new bladeList("Vale", "Attacker"));
        bladeListArrayList.add(new bladeList("Wulfric", "Attacker"));
        bladeListArrayList.add(new bladeList("Herald", "Attacker"));
        bladeListArrayList.add(new bladeList("Godfrey", "Tank"));
        bladeListArrayList.add(new bladeList("Zenobia", "Attacker"));
        bladeListArrayList.add(new bladeList("Praxis", "Attacker"));

    }
}