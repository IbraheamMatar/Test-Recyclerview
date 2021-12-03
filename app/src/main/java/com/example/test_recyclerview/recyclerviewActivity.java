package com.example.test_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.Listitem;

public class recyclerviewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Listitem> listitems;
    private RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_row);


        recyclerView = findViewById(R.id.recyclerviewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listitems = new ArrayList<>();
        Listitem  item1 = new Listitem("Muhammed Matar" , "Java Developer", "36");
        Listitem  item2 = new Listitem("Ahmed Matar" , "Android Developer", "26");
        Listitem  item3 = new Listitem("Hassan Matar" , "Python Developer", "46");
        Listitem  item4 = new Listitem("Osama Matar" , "Ruby Developer", "44");
        Listitem  item5 = new Listitem("Omer Matar" , "Rail Developer", "22");
        Listitem  item6 = new Listitem("Khalid Matar" , "Flutter Developer", "55");
        Listitem  item7 = new Listitem("Ali Matar" , "Angular Developer", "25");
        Listitem  item8 = new Listitem("Wisam Matar" , "Kotlin Developer", "37");
        Listitem  item9 = new Listitem("Islam Matar" , "PHP Developer", "66");

        listitems.add(item1);
        listitems.add(item2);
        listitems.add(item3);
        listitems.add(item4);
        listitems.add(item5);
        listitems.add(item6);
        listitems.add(item7);
        listitems.add(item8);
        listitems.add(item9);

        adapter = new MyAdapter(this,listitems);
        recyclerView.setAdapter(adapter);
    }
}
