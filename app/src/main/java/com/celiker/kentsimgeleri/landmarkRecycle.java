package com.celiker.kentsimgeleri;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;//alttaki adapter'ün içinde view holder sınıfı olacak.

import com.celiker.kentsimgeleri.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class landmarkRecycle extends RecyclerView.Adapter<landmarkRecycle.landmarkHolder> {
ArrayList<landmark> landmarklist;

    public landmarkRecycle(ArrayList<landmark> landmarkArrayList) {
        this.landmarklist = landmarkArrayList;
    }

    @NonNull
    @Override
    public landmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from( parent.getContext() ),parent, false);
        return new landmarkHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull landmarkRecycle.landmarkHolder holder,  int position) {
         holder.binding.recyclerviewtextView.setText(landmarklist.get(holder.getAdapterPosition()).isim);
         holder.itemView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(holder.itemView.getContext(),DetailsActivity.class);
                secililandmark = landmarklist.get(holder.getAdapterPosition();
                 intent.putExtra("Landmark", landmarklist.get(holder.getAdapterPosition()));
                 holder.itemView.getContext().startActivity(intent);
             }
         });//her bir elemana tıklandığında ne olacak
    }

    @Override
    public int getItemCount() {//XML'in laç kez oluşturulacağını döndürür.

        return landmarklist.size();
    }

    public static class landmarkHolder extends RecyclerView.ViewHolder{

        private final RecyclerRowBinding binding;
            public landmarkHolder(RecyclerRowBinding binding) {
                super(binding.getRoot());
                this.binding=binding;
            }
        }

}
