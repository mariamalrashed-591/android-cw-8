package com.example.day7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.example.day7.R.layout.pokemon_list_item;

public class PokemonAdapter extends RecyclerView.Adapter {

    ArrayList<pokemon> pArray;

    public PokemonAdapter(ArrayList<pokemon> pArray) {
        this.pArray = pArray;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_list_item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).pokemonName.setText(pArray.get(position).getName());
        ((ViewHolder)holder).pokemonTotal.setText(pArray.get(position).getTotal()+"");
        ((ViewHolder)holder).img.setImageResource(pArray.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return pArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public TextView pokemonName;
        public TextView pokemonTotal;
        public ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            pokemonName = (TextView) itemView.findViewById(R.id.titleTextView);
            pokemonTotal = (TextView) itemView.findViewById(R.id.textView3);
            img = (ImageView) itemView.findViewById(R.id.picture);



        }
    }





}
