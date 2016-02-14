package com.example.saito.anbayashiapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by saito on 2016/02/14.
 */
public class AnbayashiViewHolder extends RecyclerView.ViewHolder {

    View base;
    TextView textViewNumber;
    TextView textViewComment;

    public AnbayashiViewHolder(View v) {
        super(v);
        this.base = v;
        this.textViewNumber = (TextView) base.findViewById(R.id.number);
        this.textViewComment = (TextView) base.findViewById(R.id.comment);
    }
}
