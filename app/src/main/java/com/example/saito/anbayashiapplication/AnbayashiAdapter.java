package com.example.saito.anbayashiapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by saito on 2016/02/14.
 */
public class AnbayashiAdapter extends RecyclerView.Adapter<AnbayashiViewHolder>{
    private ArrayList<AnbayashiData> anbayashiDatas;

    public AnbayashiAdapter(ArrayList<AnbayashiData> anbayashiDatas) {
        this.anbayashiDatas = anbayashiDatas;
    }


    @Override
    public AnbayashiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_layout, parent, false);

        return new AnbayashiViewHolder(view);

    }

    @Override
    public void onBindViewHolder(AnbayashiViewHolder holder, final int position) {

        holder.textViewNumber.setText(anbayashiDatas.get(position).getNumber()+ "本");
        holder.textViewComment.setText(anbayashiDatas.get(position).getComment());
        holder.base.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "おまけ" +
                        anbayashiDatas.get(position).getAddition()+ "本", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return anbayashiDatas.size();
    }
}
