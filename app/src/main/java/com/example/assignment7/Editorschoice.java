package com.example.assignment7;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class Editorschoice extends RecyclerView.Adapter<Editorschoice.ViewHolder>{

    private ArrayList<String> mImages;
    private Context mcontext;
    private ArrayList<String> mImagenames;

    public Editorschoice(Context mcontext,ArrayList<String> mImagenames,ArrayList<String> mImages) {
        this.mImages=mImages;
        this.mcontext=mcontext;
        this.mImagenames = mImagenames;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_editorschoice,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(mcontext)
                .asBitmap()
                .load(mImages.get(position))
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return mImagenames.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView imagename;


        public ViewHolder(View itemview)
        {
            super(itemview);
            imagename=itemview.findViewById(R.id.name_widget);
            image=itemview.findViewById(R.id.imageview_widget);


        }

    }
}