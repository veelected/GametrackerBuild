package com.example.xenogoldtracker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class BladeRecyclerAdapter extends RecyclerView.Adapter<BladeRecyclerAdapter.bladeHolder> {
    ArrayList<bladeList> bladeListArrayList;

    public BladeRecyclerAdapter(ArrayList<bladeList> bladeListArrayList) {
        this.bladeListArrayList = bladeListArrayList;
    }


    public static class bladeHolder extends RecyclerView.ViewHolder {
        private final TextView textView2,tv_bladeRole;

        public bladeHolder(@NonNull View itemView) {
            super(itemView);
            textView2 = itemView.findViewById(R.id.textView2);
            tv_bladeRole= itemView.findViewById(R.id.tv_role);
        }
    }

    @NonNull
    @Override
    public bladeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.bladeitems, parent, false);
        return new bladeHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull bladeHolder holder, int position) {
        String bladeName = bladeListArrayList.get(position).getBladeName();
        String bladeRole = bladeListArrayList.get(position).getBladeRole();
        holder.textView2.setText(bladeName);
        holder.tv_bladeRole.setText(bladeRole);
    }

    @Override
    public int getItemCount() {
        return bladeListArrayList.size();
    }

}
