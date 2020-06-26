package com.example.edunomicsprobationtask1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ExampleItem> mExampleList;
    private Button sortbuttontitle;
    private Button sortbuttondescription;
    private RecyclerView mRecyclerView;
    private RecyclerAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sortbuttontitle = findViewById(R.id.button_sort_title);
        sortbuttondescription = findViewById(R.id.button_sort_description);

        createExampleList();
        buildRecyclerView();

        sortbuttontitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Title button: " , "pressed");
                sortByTitle();
            }
        });

        sortbuttondescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Description button: " , "pressed");
                sortByDetails();
            }
        });

    }

    public void sortByTitle() {
        Collections.sort(mExampleList, new Comparator<ExampleItem>() {
            @Override
            public int compare(ExampleItem o1, ExampleItem o2) {
                return o1.getmText1().compareTo(o2.getmText1());
            }
        });
        mAdapter.notifyDataSetChanged();
    }

    public void sortByDetails() {
        Collections.sort(mExampleList, new Comparator<ExampleItem>() {
            @Override
            public int compare(ExampleItem o1, ExampleItem o2) {
                return o1.getmText2().compareTo(o2.getmText2());
            }
        });
        mAdapter.notifyDataSetChanged();
    }

    public void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new RecyclerAdapter(mExampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }

    public void createExampleList() {
        mExampleList = new ArrayList<>();
        mExampleList.add(new ExampleItem(R.drawable.sundar_pichai, "Sundar Pichai", "CEO Of Google"));
        mExampleList.add(new ExampleItem(R.drawable.warren_buffett, "Warren Buffett", "American investor, business tycoon"));
        mExampleList.add(new ExampleItem(R.drawable.elon_musk, "Elon Musk", "CEO Of Tesla , SpaceX , etc..."));
        mExampleList.add(new ExampleItem(R.drawable.mark_zuckerberg, "Mark Zuckerberg", "CEO Of Facebook"));
        mExampleList.add(new ExampleItem(R.drawable.satya_nadella, "Satya Nadella", "CEO Of Microsoft"));
        mExampleList.add(new ExampleItem(R.drawable.sundar_pichai, "Sundar Pichai", "CEO Of Google"));
        mExampleList.add(new ExampleItem(R.drawable.warren_buffett, "Warren Buffett", "American investor, business tycoon"));
        mExampleList.add(new ExampleItem(R.drawable.elon_musk, "Elon Musk", "CEO Of Tesla , SpaceX , etc..."));
        mExampleList.add(new ExampleItem(R.drawable.mark_zuckerberg, "Mark Zuckerberg", "CEO Of Facebook"));
        mExampleList.add(new ExampleItem(R.drawable.satya_nadella, "Satya Nadella", "CEO Of Microsoft"));
        mExampleList.add(new ExampleItem(R.drawable.sundar_pichai, "Sundar Pichai", "CEO Of Google"));
        mExampleList.add(new ExampleItem(R.drawable.warren_buffett, "Warren Buffett", "American investor, business tycoon"));
        mExampleList.add(new ExampleItem(R.drawable.elon_musk, "Elon Musk", "CEO Of Tesla , SpaceX , etc..."));
        mExampleList.add(new ExampleItem(R.drawable.mark_zuckerberg, "Mark Zuckerberg", "CEO Of Facebook"));
        mExampleList.add(new ExampleItem(R.drawable.satya_nadella, "Satya Nadella", "CEO Of Microsoft"));
        mExampleList.add(new ExampleItem(R.drawable.sundar_pichai, "Sundar Pichai", "CEO Of Google"));
        mExampleList.add(new ExampleItem(R.drawable.warren_buffett, "Warren Buffett", "American investor, business tycoon"));
        mExampleList.add(new ExampleItem(R.drawable.elon_musk, "Elon Musk", "CEO Of Tesla , SpaceX , etc..."));
        mExampleList.add(new ExampleItem(R.drawable.mark_zuckerberg, "Mark Zuckerberg", "CEO Of Facebook"));
        mExampleList.add(new ExampleItem(R.drawable.satya_nadella, "Satya Nadella", "CEO Of Microsoft"));
        mExampleList.add(new ExampleItem(R.drawable.sundar_pichai, "Sundar Pichai", "CEO Of Google"));
        mExampleList.add(new ExampleItem(R.drawable.warren_buffett, "Warren Buffett", "American investor, business tycoon"));
        mExampleList.add(new ExampleItem(R.drawable.elon_musk, "Elon Musk", "CEO Of Tesla , SpaceX , etc..."));
        mExampleList.add(new ExampleItem(R.drawable.mark_zuckerberg, "Mark Zuckerberg", "CEO Of Facebook"));
        mExampleList.add(new ExampleItem(R.drawable.satya_nadella, "Satya Nadella", "CEO Of Microsoft"));
    }

}