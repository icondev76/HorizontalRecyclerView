package com.icontech.horizontalrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String>images=new ArrayList<>();
    private ArrayList<String>names=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBitmaps();
    }

    private void initBitmaps(){
        images.add("https://i.redd.it/5mlgxo1qoj611.jpg");
        names.add("Washington State");

        images.add("https://i.redd.it/5mlgxo1qoj611.jpg");
        names.add("Chilean Patagonia");

        images.add("https://i.redd.it/b09ga89nrj611.jpg");
        names.add("Yosemite");

        images.add("https://i.redd.it/we5ivqry4n611.jpg");
        names.add("Washington State");

        images.add("https://i.redd.it/5mlgxo1qoj611.jpg");
        names.add("Chilean Patagonia");

        images.add("https://i.redd.it/b09ga89nrj611.jpg");
        names.add("Yosemite");

        images.add("https://i.redd.it/we5ivqry4n611.jpg");
        names.add("Washington State");

        images.add("https://i.redd.it/5mlgxo1qoj611.jpg");
        names.add("Chilean Patagonia");

        images.add("https://i.redd.it/b09ga89nrj611.jpg");
        names.add("Yosemite");

        initRecyclerView();

    }

    private void initRecyclerView(){
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayout.HORIZONTAL,false);
        RecyclerView recyclerView=findViewById(R.id.recyclerview);
        RecycleViewAdapter adapter= new RecycleViewAdapter(this,images,names);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
