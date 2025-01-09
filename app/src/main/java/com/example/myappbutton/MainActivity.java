package com.example.myappbutton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txt;
    private Button bt_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Associa o layout ao código

        // Referenciando elementos do layout
        txt = findViewById(R.id.txt);
        bt_ok = findViewById(R.id.bt_ok);

        // Configurando evento de clique
        bt_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText("Consegui voltar!");
            }
        });
    }
}
