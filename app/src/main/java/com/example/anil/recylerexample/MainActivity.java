package com.example.anil.recylerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.view);
        String[] names=new String[]{"a","b","c","d","e","f","g","h","i"};
        int[] images=new int[]{R.drawable.index,R.drawable.index1,R.drawable.index2,
        R.drawable.index3,R.drawable.index4,R.drawable.index5,R.drawable.index,
                R.drawable.index3,R.drawable.index2};
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Myadpter(this,names,images));
    }
}
