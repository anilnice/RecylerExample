package com.example.anil.recylerexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Anil on 2/15/2018.
 */

class Myadpter extends RecyclerView.Adapter<Myadpter.Viewholder> {
    public Myadpter(MainActivity mainActivity, String[] names) {
    }

    @Override
    public Viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(Viewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        public Viewholder(View itemView) {
            super(itemView);
        }
    }
}
