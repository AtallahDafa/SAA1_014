package com.example.w1sem3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class UserRVAdapter extends RecyclerView.Adapter<UserRVAdapter.UserViewHolder> {

    private ArrayList<User> userList;

    public UserRVAdapter(ArrayList<User> userList) { this.userList = userList; }
    @NonNull
    @Override
    public UserRVAdapter.UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from((parent.getContext()));
        View view = layoutInflater.inflate(R.layout.card_user, parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserRVAdapter.UserViewHolder holder, int position) {
        holder.card_user_id.setText(String.valueOf(position));
        holder.card_user_name.setText(userList.get(position).getName());
        holder.card_user_age.setText(userList.get(position).getAge());
        holder.card_user_address.setText(userList.get(position).getAddress());

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        private TextView card_user_id, card_user_name, card_user_age, card_user_address;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            card_user_id = itemView.findViewById(R.id.cardView);
            card_user_name = itemView.findViewById(R.id.label_Nama);
            card_user_address = itemView.findViewById(R.id.label_alamat);
            card_user_age = itemView.findViewById(R.id.label_umur);
        }
    }
}
