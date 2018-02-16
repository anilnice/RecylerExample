package com.example.anil.recylerexample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Anil on 2/15/2018.
 */

class Myadpter extends RecyclerView.Adapter<Myadpter.Viewholder> {
    String[] mydata;
    Context ct;
    int[] myimg;
    public Myadpter(MainActivity mainActivity, String[] names, int[] images) {
        this.mydata=names;
        this.ct=mainActivity;
        this.myimg=images;
    }

    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(Viewholder holder, int position) {
        holder.tv.setText(mydata[position]);
        Picasso.with(ct).load(myimg[position]).into(holder.iv);
    }

    @Override
    public int getItemCount() {
        return mydata.length;
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        TextView tv;
        ImageView iv;
        public Viewholder(View itemView) {
            super(itemView);
            tv=(TextView)itemView.findViewById(R.id.textview);
            iv=(ImageView)itemView.findViewById(R.id.image);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position=getAdapterPosition();
                    Intent i=new Intent(ct,DetailActivity.class);
                    i.putExtra("name",mydata[position]);
                    i.putExtra("image",myimg[position]);
                    ct.startActivity(i);
                }
            });

        }

    }
}
