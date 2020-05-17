package com.example.tokokopi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etJumlahpesanan, etJumlahpesanan1;
    TextView tvtotalharga;
    int counter =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etJumlahpesanan = findViewById(R.id.harga);
        etJumlahpesanan1 = findViewById(R.id.harga1);
        tvtotalharga = findViewById(R.id.total);

    }

    public void hitungtotal(View view) {
        String jumlahpesanan = etJumlahpesanan.getText().toString();
        String jumlahpesanan1 = etJumlahpesanan1.getText().toString();

        int jumlah = Integer.parseInt(jumlahpesanan);
        int jumlah1 = Integer.parseInt(jumlahpesanan1);
        int hasil = jumlah * 20000;
        int hasil1 = jumlah1 * 20000;
        int total = hasil + hasil1;

        tvtotalharga.setText("Rp." + total);
        etJumlahpesanan.setText("0");
        etJumlahpesanan1.setText("0");
    }

    public void kurang1(View view) {
        counter--;
        etJumlahpesanan.setText(Integer.toString(counter));

    }

    public void tambah1(View view) {
        counter++;
        etJumlahpesanan.setText(Integer.toString(counter));
    }

    public void kurang2(View view) {
        counter--;
        etJumlahpesanan1.setText(Integer.toString(counter));
    }

    public void tambah2(View view) {
        counter++;
        etJumlahpesanan1.setText(Integer.toString(counter));
    }
}
