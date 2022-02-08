package com.example.chatter.Adapters;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatter.databinding.RowConversationBinding;

public class UsersViewHolder extends RecyclerView.ViewHolder {

    RowConversationBinding binding;

    public UsersViewHolder(@NonNull View itemView) {
        super(itemView);
        binding = RowConversationBinding.bind(itemView);


    }
}
