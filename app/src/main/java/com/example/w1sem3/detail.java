package com.example.w1sem3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class detail extends AppCompatActivity {

    private TextView label_nama, label_alamat, label_umur;
    private TextView isi_nama, isi_alamat, isi_umur;
    private CardView cardView;

    protected void onCreate(Bundle saveInstanceStates) {

        super.onCreate(saveInstanceStates);
        setContentView(R.layout.card_user);



    }
}
