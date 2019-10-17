package com.example.uts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SiswaActivity extends AppCompatActivity {
    private Button btAlert;
    private EditText nisInput;
    private EditText namaInput;
    private EditText alamatInput;
    private EditText hpInput;
    private EditText ketInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siswa);

        btAlert = (Button) findViewById(R.id.okButton);
        btAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupHandler(view);
            }
        });
        nisInput = findViewById(R.id.input_nis);
        namaInput = findViewById(R.id.input_nama);
        alamatInput = findViewById(R.id.input_alamat);
        hpInput = findViewById(R.id.input_hp);
        ketInput = findViewById(R.id.input_ket);
    }

    public void popupHandler(View view) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title dialog
        alertDialogBuilder.setTitle("Data Siswa");

        // set pesan dari dialog
        alertDialogBuilder
                .setMessage("NIS : " + nisInput.getText().toString() + "\n"
                            + "Nama : " + namaInput.getText().toString() + "\n"
                            + "Alamat : " + alamatInput.getText().toString() + "\n"
                            + "Handphone : " + hpInput.getText().toString() + "\n"
                            + "Keterangan : " + ketInput.getText().toString())
                .setCancelable(false)
                .setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // do something
                    }
                });

        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }
}
