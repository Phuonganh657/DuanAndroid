package com.example.appthoitiett;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class FutureAdapter extends RecyclerView.Adapter<FutureAdapter.viewHolder> {
    ArrayList<Future> list;
    Context context;

    public FutureAdapter(Context context, ArrayList<Future> list) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public FutureAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater thoitiet = LayoutInflater.from(context);
        View vItem = thoitiet.inflate(R.layout.viewholder_future, parent, false);
        viewHolder viewHolderCreated = new viewHolder(vItem);
        return viewHolderCreated;

    }

    @Override
    public void onBindViewHolder(@NonNull FutureAdapter.viewHolder holder, int position) {
        holder.dayTxt.setText(list.get(position).getDay());
        holder.statusTxt.setText(list.get(position).getStatus());
        //holder.lowTxt.setText(list.get(position).getLowTemp()+"°");
        //holder.highTxt.setText(list.get(position).getHighTemp()+"°");


        int drawableResourceId = holder.itemView.getResources().getIdentifier(list.get(position).getPicPath(),"drawable", holder.itemView.getContext().getPackageName());
        Glide.with(context).load(drawableResourceId).into(holder.pic);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        TextView dayTxt, statusTxt,lowTxt, highTxt;
        ImageView pic;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            dayTxt = itemView.findViewById(R.id.dayTxt);
            statusTxt = itemView.findViewById(R.id.statusTxt);
            lowTxt = itemView.findViewById(R.id.lowTxt);
            lowTxt = itemView.findViewById(R.id.lowTxt);
            pic = itemView.findViewById(R.id.pic);
        }
    }
}
