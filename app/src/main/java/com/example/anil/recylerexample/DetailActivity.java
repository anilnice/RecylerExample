package com.example.anil.recylerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    ImageView iv;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        iv=(ImageView)findViewById(R.id.myimage);
        tv=(TextView)findViewById(R.id.mytext);

        int img=getIntent().getIntExtra("image",0);
        String name=getIntent().getStringExtra("name");
        Picasso.with(this).load(img).into(iv);
        tv.setText(name);
    }
}
