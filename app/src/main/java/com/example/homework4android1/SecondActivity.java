package com.example.homework4android1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.homework4android1.AdapterTeamList.AdapterTeamList;
import com.example.homework4android1.data.TeamClient;
import com.example.homework4android1.model.TeamModel;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class SecondActivity extends AppCompatActivity {
    TextView tvTextName;
    TextView tvTextNameCommand;
    TextView tvDescraption;
    TextView getTvDescraptionCommand;
    ArrayList<TeamModel> list = new ArrayList<>();

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initialization();
    }

    private void initialization() {
        tvTextName = findViewById(R.id.tv_textname);
        tvTextNameCommand = findViewById(R.id.tv_name_command);
        tvDescraption = findViewById(R.id.tv_description);
        getTvDescraptionCommand = findViewById(R.id.tv_description_command);
        String name = getIntent().getStringExtra("Player's name");
        String description = getIntent().getStringExtra("Player's desc");
        tvTextNameCommand.setText(name);
        getTvDescraptionCommand.setText(description);
    }

}