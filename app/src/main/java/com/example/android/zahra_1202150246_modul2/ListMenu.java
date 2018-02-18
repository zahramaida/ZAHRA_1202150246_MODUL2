package com.example.android.zahra_1202150246_modul2;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

import java.util.ArrayList;

public class ListMenu extends AppCompatActivity {

    private RecyclerView listView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> dataGambar;

    //Daftar Judul
    private String[] Judul = {"Fish n Chips ", "Fish n Chips with Spaghetti", "Fish n Chips with Briyani Rice",
    "Mac n Cheese with French Fries", "Combo Platter"};
    //Daftar Judul2
    private String[] test = {"Rp. 28.500", "Rp. 38.500", "Rp. 35.000", "Rp. 32.500", "Rp. 40.000"};
    //Daftar Gambar
    private int[] Gambar = {R.drawable.menu1, R.drawable.menu3, R.drawable.menu5, R.drawable.menu9, R.drawable.menu10};


    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);

        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        dataGambar = new ArrayList<>();
        DaftarItem();

//        iniDataMenu();
//        iniDataHarga();
//        initgambar();

        listView = findViewById(R.id.list_menu);
        listView.setHasFixedSize(true);

        /**
         * Kita menggunakan LinearLayoutManager untuk list standar
         * yang hanya berisi daftar item
         * disusun dari atas ke bawah
         */
        layoutManager = new LinearLayoutManager(this);
        listView.setLayoutManager(layoutManager);

        adapter = new ViewMenu(dataMenu, dataHarga, dataGambar);
        listView.setAdapter(adapter);
    }

    private void DaftarItem() {
    for (int a=0; a<Judul.length; a++){
        dataMenu.add(Judul[a]);
        dataHarga.add(test[a]);
        dataGambar.add(Gambar[a]);
    }
}
}