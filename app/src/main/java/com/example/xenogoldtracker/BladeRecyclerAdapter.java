package com.example.xenogoldtracker;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class BladeRecyclerAdapter extends RecyclerView.Adapter<BladeRecyclerAdapter.bladeHolder> {

    @NonNull
    @Override
    public bladeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull bladeHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class bladeHolder extends RecyclerView.ViewHolder {
        public bladeHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
