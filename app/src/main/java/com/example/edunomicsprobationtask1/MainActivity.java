package com.example.edunomicsprobationtask1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ExampleItem> mExampleList;
    private RecyclerView mRecyclerView;
    private RecyclerAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button sortbuttontitle = findViewById(R.id.button_sort_title);
        Button sortbuttondescription = findViewById(R.id.button_sort_description);
        Button addbutton = findViewById(R.id.button_add_item);

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

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem(0);
            }
        });

        EditText editText = findViewById(R.id.search_edit_text);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filterByTitle(s.toString());
            }
        });

    }

    private void  addItem(int position){
        mExampleList.add(position , new ExampleItem(R.drawable.ic_baseline_account_circle_24 , "Title" , "Description Comes Here"));
        mAdapter.notifyDataSetChanged();
    }

    private void deleteItem(int position){
        mExampleList.remove(position);
        mAdapter.notifyItemRemoved(position);
    }

    private void filterByTitle(String text){
        ArrayList<ExampleItem> filteredList = new ArrayList<>();
        for(ExampleItem item : mExampleList){
            if(item.getmText1().toLowerCase().contains(text.toLowerCase())){
                filteredList.add(item);
            }
        }

        mAdapter.filterlist(filteredList);
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

        mAdapter.setOnItemClickListener(new RecyclerAdapter.OnItemClickListener() {

            @Override
            public void onDeleteClick(int position) {
                deleteItem(position);
            }
        });

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