package com.example.mvvmrecyclerviewcrud.Adapters;

import android.view.View;

public interface PersonClickListener {
    public void onItemClick(PeopleAdapter.ViewHolder holder, View view, int position);
}
