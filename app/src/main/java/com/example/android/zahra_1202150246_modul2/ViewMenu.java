package com.example.android.zahra_1202150246_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class ViewMenu extends RecyclerView.Adapter<ViewMenu.ViewHolder> {
    private ArrayList<String> menuData;
    private ArrayList<String> menuHarga;
    private ArrayList<Integer> menuGambar;
    private RelativeLayout ItemList;
    private Context context;

    public ViewMenu(ArrayList<String> inputData, ArrayList<String> dataHarga, ArrayList<Integer> gambar) {
        menuData = inputData;
        menuHarga = dataHarga;
        menuGambar = gambar;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        //hanya menggunakan data String untuk tiap item
        public TextView textTitle;
        public TextView textSubtitle;
        public ImageView image_menu;

        public ViewHolder(View v) {
            super(v);
            context = itemView.getContext();
            textTitle = (TextView) v.findViewById(R.id.text_title);
            textSubtitle = (TextView) v.findViewById(R.id.text_subtitle);
            image_menu = (ImageView) v.findViewById(R.id.icon);
            ItemList = v.findViewById(R.id.list);

            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent();
                    switch (getAdapterPosition()){
                        case 0 :
                            intent = new Intent(context, Menu1.class);
                            break;
                        case 1 :
                            intent = new Intent(context, Menu2.class);
                            break;
                        case 2 :
                            intent = new Intent(context, Menu3.class);
                            break;
                        case 3 :
                            intent = new Intent(context, Menu4.class);
                            break;
                        case 4 :
                            intent = new Intent(context, Menu5.class);
                            break;
                    }
                    context.startActivity(intent);
                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_view_menu, parent, false);
        // set ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - mengambil elemen dari dataset (ArrayList) pada posisi tertentu
        // - mengeset isi view dengan elemen dari dataset tersebut
        final String name = menuData.get(position);
        final String harga = menuHarga.get(position);
        final Integer gambar = menuGambar.get(position);
        holder.textTitle.setText(name);
        holder.textSubtitle.setText("Harga " + harga);
        holder.image_menu.setImageResource(gambar);
    }

    @Override
    public int getItemCount() {
        // menghitung ukuran dataset / jumlah data yang ditampilkan di RecyclerView
        return menuData.size();
    }
}
