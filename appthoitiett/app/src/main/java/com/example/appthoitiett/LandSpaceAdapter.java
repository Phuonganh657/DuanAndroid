package com.example.appthoitiett;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class LandSpaceAdapter extends RecyclerView.Adapter<LandSpaceAdapter.ItemLandHolder> {
    Context context;
    ArrayList<LandSpace> lstData;

    public LandSpaceAdapter(Context context, ArrayList<LandSpace> lstData) {
        this.context = context;
        this.lstData = lstData;
    }



    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_land, parent, false);
        ItemLandHolder viewholderCreated = new ItemLandHolder(vItem);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        //Lấy đối tượng hiển thị
        LandSpace landScapeHienThi = lstData.get(position);
        //Trích thông tin
        String caption1 = landScapeHienThi.getLandCation1();
        String caption2 = landScapeHienThi.getLandCation2();
        String tenFileAnh = landScapeHienThi.getLandImageFileName();
        //đặt vào các trường thông tin của holder
        holder.tvCaption1.setText(caption1);
        holder.tvCaption2.setText(caption2);
        //đăt ảnh
        String packageName = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(tenFileAnh, "mipmap", packageName);
        holder.ivLandscape.setImageResource(imageID);

    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tvCaption1, tvCaption2;
        ImageView ivLandscape;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption1 = itemView.findViewById(R.id.textViewCation1);
            tvCaption2 = itemView.findViewById(R.id.textViewCation2);
            ivLandscape = itemView.findViewById(R.id.imageViewLand);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            //code ở đây
            int viTriDuocClick = getAdapterPosition();
            LandSpace phanTuDuocClick = lstData.get(viTriDuocClick);
            //bóc thông tin
            String ten = phanTuDuocClick.getLandCation1();
            String nhietdo = phanTuDuocClick.getLandCation2();
            String tenFile = phanTuDuocClick.getLandImageFileName();
            //Toast tên
            String chuoiThongBao = "Ngày mai trời nắng :"  + ten;
            Toast.makeText(v.getContext(), chuoiThongBao, Toast.LENGTH_SHORT).show();

        }
    }
}





