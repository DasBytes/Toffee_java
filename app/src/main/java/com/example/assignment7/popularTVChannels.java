package com.example.assignment7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class popularTVChannels extends RecyclerView.Adapter<popularTVChannels.ViewHolder>{
    private ArrayList<String> mImagenames;
    private ArrayList<String> mImages;
    private Context mcontext;
    public popularTVChannels(Context mcontext, ArrayList<String> mImagenames, ArrayList<String> mImages) {
        this.mImagenames = mImagenames;
        this.mImages=mImages;
        this.mcontext=mcontext;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.populartvchannels,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,final int position) {
        holder.imagenames.setText(mImagenames.get(position));

        Glide.with(mcontext)
                .asBitmap()
                .load(mImages.get(position)).placeholder(R.drawable.ic_launcher_background)
                .into(holder.image1);
    }



    @Override
    public int getItemCount() {

        return mImagenames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView image1;
        TextView imagenames;

        public ViewHolder(View itemview) {
            super(itemview);
            image1 = itemview.findViewById(R.id.image);
            imagenames=itemview.findViewById(R.id.image_name);

        }
    }

}
