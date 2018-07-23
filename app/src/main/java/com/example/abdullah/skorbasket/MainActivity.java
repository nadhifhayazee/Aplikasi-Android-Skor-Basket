package com.example.abdullah.skorbasket;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void panggilNama(View v){
        EditText EnamA = (EditText) findViewById(R.id.inputA);
        EditText EnamB = (EditText) findViewById(R.id.inputB);

        String SnamaA = EnamA.getText().toString();
        String SnamaB = EnamB.getText().toString();

        Intent kirim = new Intent(this, MainUtama.class);
        kirim.putExtra("namaA", SnamaA);
        kirim.putExtra("namaB", SnamaB);
        startActivity(kirim);

    }
}
