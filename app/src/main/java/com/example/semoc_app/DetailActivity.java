package com.example.semoc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.semoc_app.model.Item;
import com.google.android.material.textfield.TextInputEditText;

public class DetailActivity extends AppCompatActivity {

    private TextView nome;
    private TextView descricao;
    private TextView dataHora;
    private TextView local;
    private TextView convidados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nome = (TextView) findViewById(R.id.detail_titulo);
        descricao = (TextView) findViewById(R.id.detail_descricao);
        dataHora = (TextView) findViewById(R.id.detail_data_hora);
        local = (TextView) findViewById(R.id.detail_local);
        convidados = (TextView) findViewById(R.id.detail_convidados);

        Item item = getIntent().getExtras().getParcelable("ITEM");

        nome.setText(item.getNome());
        descricao.setText(item.getDescricao());
        dataHora.setText(item.getDataHora());
        local.setText(item.getLocal());
        convidados.setText(item.getConvidados());

    }
}