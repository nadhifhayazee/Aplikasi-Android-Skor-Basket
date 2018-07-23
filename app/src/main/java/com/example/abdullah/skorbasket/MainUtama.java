package com.example.abdullah.skorbasket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainUtama extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        Intent i = this.getIntent();
        String namaA = i.getStringExtra("namaA");
        String namaB = i.getStringExtra("namaB");

        TextView TnamaA = (TextView) findViewById(R.id.namaA);
        TextView TnamaB = (TextView) findViewById(R.id.namaB);

        TnamaA.setText(namaA);
        TnamaB.setText(namaB);
    }

    public void pointA (View v){
        TextView TnilaiA = (TextView) findViewById(R.id.nilaiA);
        String SnilaiA = TnilaiA.getText().toString();

        int point = Integer.parseInt((String) v.getTag());

        Integer InilaiA = Integer.parseInt(SnilaiA);
        int jumlah = InilaiA + point;

        TnilaiA.setText(String.valueOf(jumlah));
    }

    public void pointB (View v){
        TextView TnilaiB = (TextView) findViewById(R.id.nilaiB);
        String SnilaiB = TnilaiB.getText().toString();

        int point = Integer.parseInt((String) v.getTag());

        Integer InilaiB = Integer.parseInt(SnilaiB);
        int jumlah = InilaiB + point;

        TnilaiB.setText(String.valueOf(jumlah));
    }

    public void ulangi (View v) {
        finish();
    }
}
