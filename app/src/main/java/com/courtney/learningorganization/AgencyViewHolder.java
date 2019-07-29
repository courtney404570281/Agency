package com.courtney.learningorganization;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AgencyViewHolder extends RecyclerView.ViewHolder {

    private final TextView agencyText;
    private final TextView categoryText;

    public AgencyViewHolder(@NonNull View itemView) {
        super(itemView);
        agencyText = itemView.findViewById(R.id.txt_agency);
        categoryText = itemView.findViewById(R.id.txt_category);
    }

    public void bindTo(Agency agency) {
        agencyText.setText(agency.agencyName);
        categoryText.setText(agency.category);
    }
}
