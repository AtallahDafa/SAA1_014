package com.example.w1sem3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class modified extends AppCompatActivity {

    private EditText nameText, ageText, alamatText;
    private Button save;
    private ArrayList<User> dataUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modified);
        initview();
        buttonClick();
    }

    private void buttonClick() {
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama =  nameText.getText().toString().trim();
                String umur =  ageText.getText().toString().trim();
                String alamat =  alamatText.getText().toString().trim();

                User user = new User(nama,umur,alamat);
                Intent intent = new Intent(modified.this,detail.class);

            }
        });



    }

    private void initview() {
    }
}