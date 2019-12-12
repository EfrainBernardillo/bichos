package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.Adapters.ProudctAdapter;
import com.example.myapplication.mobil.Products;

public class ListaProductosActivity extends AppCompatActivity {
    ListView productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_productos);
        productList = findViewById(R.id.listaProductos);

        ProudctAdapter adapter = new ProudctAdapter(
            this, Products.getData());

        productList.setAdapter(adapter);
    }
}
