package com.courtney.learningorganization;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AgencyAdapter extends RecyclerView.Adapter<AgencyViewHolder> {

    List<Agency> agency;

    public AgencyAdapter(List<Agency> agency) {
        this.agency = agency;
    }

    public void setAgency(List<Agency> agency) {
        this.agency = agency;
    }

    @NonNull
    @Override
    public AgencyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AgencyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_edu, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AgencyViewHolder holder, int position) {
        Agency a = agency.get(position);
        if (a != null) {
            holder.bindTo(a);
        }
    }

    @Override
    public int getItemCount() {
        return (agency == null) ? 0 : agency.size() ;
    }
}
