package com.example.mvvmrecyclerviewcrud.Adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvmrecyclerviewcrud.Model.People;
import com.example.mvvmrecyclerviewcrud.R;

import java.util.ArrayList;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.ViewHolder> implements PersonClickListener{
    ArrayList<People> items = new ArrayList<>();
    PersonClickListener listener;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recylcerview_item, viewGroup, false);
        ViewHolder vh = new ViewHolder(view, this);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        People item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setOnItemClicklistener(PersonClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onItemClick(ViewHolder holder, View view, int position) {
        if(listener != null){
            listener.onItemClick(holder,view,position);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView mName;
        private TextView mAge;

        public ViewHolder(@NonNull View itemView, final PersonClickListener listener) {
            super(itemView);
            mName = itemView.findViewById(R.id.nameText);
            mAge = itemView.findViewById(R.id.ageText);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if(listener != null){
                        listener.onItemClick(ViewHolder.this, v, position);
                    }
                }
            });
        }

        public void setItem(People item){
            mName.setText(item.getName());
            mAge.setText(item.getAge());
        }
    }

}
