package com.example.semoc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.semoc_app.model.Item;
import com.example.semoc_app.view.ItemAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<Item> list = new ArrayList<>();

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.main_list_lista);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            Item item = (Item) adapterView.getItemAtPosition(i);
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("ITEM", item);
            startActivity(intent);
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        list = Item.criarLista();
        ListAdapter adapter = new ItemAdapter(this,list);
        listView.setAdapter(adapter);
    }

}