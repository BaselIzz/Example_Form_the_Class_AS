package com.batata.myapplication.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtName;
    private EditText edtFav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName=findViewById(R.id.txt_name);
        edtFav=findViewById(R.id.txt_fav);

    }

    public void Submit(View view) {
     String name=   edtName.getText().toString();
     String Fav= edtFav.getText().toString();
        Toast.makeText(this, "Welcome "+ name+"\n" + Fav, Toast.LENGTH_SHORT).show();
    }
}