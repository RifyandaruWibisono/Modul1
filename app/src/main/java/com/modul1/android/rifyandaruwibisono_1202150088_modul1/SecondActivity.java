package com.modul1.android.rifyandaruwibisono_1202150088_modul1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Context context = getApplicationContext();

        Toast mahal = Toast.makeText(context, "Makanan Terlalu Mahal", Toast.LENGTH_LONG);
        Toast murah = Toast.makeText(context,"Makan Murah Meriah", Toast.LENGTH_LONG);

        TextView lihatMenu = (TextView) findViewById(R.id.menupilih);
        TextView lihatHarga = (TextView) findViewById(R.id.hargato);
        TextView lihatjumlah = (TextView) findViewById(R.id.jumlah2);
        TextView lihatTempat = (TextView) findViewById(R.id.tempat);

        Intent intent = getIntent();
        int total = intent.getIntExtra("totalharga", 0);
        String totall = Integer.toString(total);

        int jumlah = intent.getIntExtra("jumlahporsi", 0);
        String porsi = Integer.toString(jumlah);

        String menuu = intent.getStringExtra("menumakanann");
        int modal = intent.getIntExtra("modal",0);

        String tempatt = intent.getStringExtra("tempat");

        lihatMenu.setText(menuu);
        lihatHarga.setText(totall);
        lihatjumlah.setText(porsi);

        if (modal >= total){
            murah.show();
            lihatTempat.setText(tempatt);
        }else{
            mahal.show();
            lihatTempat.setText(tempatt);
        }
    }
}

