package com.example.konversisuhuapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class KonversiActivity extends AppCompatActivity {

    TextView tvHasil;
    EditText etNilai;
    RadioButton rbReamur, rbKelvin, rbFahrenheit;
    Button btnKonversi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHasil = findViewById(R.id.tvHasil);
        etNilai = findViewById(R.id.etNilai);
        rbReamur = findViewById(R.id.rbReamur);
        rbKelvin = findViewById(R.id.rbKelvin);
        rbFahrenheit = findViewById(R.id.rbFahrenheit);
        btnKonversi = findViewById(R.id.btnKonversi);
    }

    public void konversikan(View view){
        if(etNilai.getText().length() == 0){
            Toast.makeText(this, "Anda Harus mengisi nilai Celcius", Toast.LENGTH_SHORT).show();
        } else {
            double nilai = Double.parseDouble(etNilai.getText().toString());
            double hasil = 0;

            if(rbReamur.isChecked()) {
                hasil = KonversiFunction.toReamur(nilai);
            }
            else if(rbKelvin.isChecked()) {
                hasil = KonversiFunction.toKelvin(nilai);
            }
            else if(rbFahrenheit.isChecked()) {
                hasil = KonversiFunction.toFahrenheit(nilai);
            }

            tvHasil.setText("Hasil : " + hasil);
        }
    }
}