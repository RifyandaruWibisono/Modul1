package com.modul1.android.rifyandaruwibisono_1202150088_modul1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    public int modal = 65500;
    private int abnormal = 50000;
    private int eatbus =30000;
    private int totalharga;
    private EditText mMenu;
    private EditText mJumlah;
    private Button mPilihan1;
    private Button mPilihan2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMenu = (EditText) findViewById(R.id.menu);
        mJumlah = (EditText) findViewById(R.id.jumlah);
        mPilihan1 = (Button) findViewById(R.id.pilihan1);
        mPilihan2 = (Button) findViewById(R.id.pilihan2);
    }

    public void eatbus(View view) {
        Log.d(LOG_TAG,"Button Clicked");

        int jumlah = Integer.parseInt(mJumlah.getText().toString());
        String menu = mMenu.getText().toString();

        totalharga = jumlah *eatbus;
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("jumlah",jumlah);
        intent.putExtra("menu",menu);
        intent.putExtra("totalharga", totalharga);
        intent.putExtra("modal", modal);
        intent.putExtra("tempat","Eatbus");
        startActivity(intent);
    }

    public void abnormal(View view) {
        Log.d(LOG_TAG,"Terpencet");

        int jumlah = Integer.parseInt(mJumlah.getText().toString());
        String menu = mMenu.getText().toString();

        totalharga = jumlah *abnormal;
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("menu",menu);
        intent.putExtra("jumlah", jumlah);
        intent.putExtra("totalharga",totalharga);
        intent.putExtra("modal", modal);
        intent.putExtra("tempat", "Abnormal");

        startActivity(intent);
    }
}
