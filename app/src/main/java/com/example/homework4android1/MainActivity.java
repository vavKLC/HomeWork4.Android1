package com.example.homework4android1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.homework4android1.AdapterTeamList.AdapterTeamList;
import com.example.homework4android1.data.TeamClient;
import com.example.homework4android1.model.TeamModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterTeamList.OnNoteListiner {
    RecyclerView recyclerView;
    AdapterTeamList adapterTeamList;
    ArrayList<TeamModel> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
    }

    private void initialization(){
        recyclerView = findViewById(R.id.recycler_view);
        list = TeamClient.getTeam();
        adapterTeamList = new AdapterTeamList(list , this);
        recyclerView.setAdapter(adapterTeamList);
    }

    @Override
    public void onNoteClick(int position) {
        list.get(position);
        Intent intent = new Intent( MainActivity.this,SecondActivity.class);
        intent.putExtra("Player's name" ,  list.get(position).getName());
        intent.putExtra("Player's desc" , list.get(position).getDescription());
        startActivity(intent);

    }
}