package com.example.homework4android1.AdapterTeamList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework4android1.model.TeamModel;
import com.example.homework4android1.R;

import java.util.ArrayList;

public class AdapterTeamList extends RecyclerView.Adapter<AdapterTeamList.HolderTeam>{
    ArrayList<TeamModel> list;
    OnNoteListiner mOnNoteListiner;

    public AdapterTeamList(ArrayList<TeamModel> list , OnNoteListiner onNoteListiner){
        this.list = list;
        this.mOnNoteListiner = onNoteListiner;
    }

    @NonNull
    @Override
    public AdapterTeamList.HolderTeam onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_holder_team,parent,false);
        return new HolderTeam(view , mOnNoteListiner);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterTeamList.HolderTeam holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HolderTeam extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvNameTeam;
        OnNoteListiner onNoteListiner;
        public HolderTeam(@NonNull View itemView, OnNoteListiner onNoteListiner) {
            super(itemView);
            tvNameTeam = itemView.findViewById(R.id.tv_name_team);
            this.onNoteListiner = onNoteListiner;
            itemView.setOnClickListener(this);

        }
        public void onBind(TeamModel teamModel){
            tvNameTeam.setText(teamModel.getName());
        }

        public void onClick(View view){
            onNoteListiner.onNoteClick(getAdapterPosition());
        }

    }
    public interface OnNoteListiner{
        void onNoteClick(int position);
    }

}
