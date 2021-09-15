package com.example.w1sem3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView label_nama, label_alamat, label_umur;
    private TextView isi_nama, isi_alamat, isi_umur;
    private CardView cardView;
    private Intent intent;
    private FloatingActionButton floatingActionButton;
    private RecyclerView recyclerView;

    private EditText nameText, ageText, alamatText;
    UserRVAdapter adapter;
    static ArrayList<User> dataUser = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label_alamat = findViewById(R.id.label_Nama);
        label_nama = findViewById(R.id.label_Nama);
        label_umur = findViewById(R.id.label_umur);
        floatingActionButton = findViewById(R.id.floatingActionButton);
        recyclerView = findViewById(R.id.RecyclerView);

        initView();
        setupRecycleView();
        User user =  new User ("test", "test","test");
        dataUser.add(user);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, modified.class);
                startActivity(intent);
            }
        });
    }

    private void setupRecycleView() {
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getBaseContext());
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

    private void initView() {
        recyclerView = findViewById(R.id.RecyclerView);
        adapter = new UserRVAdapter(dataUser);
    }
}