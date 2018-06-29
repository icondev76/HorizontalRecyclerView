package com.icontech.horizontalrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>{

    private Context context;
    private ArrayList<String>mimages=new ArrayList<>();
    private ArrayList<String>mnames=new ArrayList<>();

    public RecycleViewAdapter(Context context, ArrayList<String> mimages, ArrayList<String> mnames) {
        this.context = context;
        this.mimages = mimages;
        this.mnames = mnames;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide .with(context)
                .asBitmap()
                .load(mimages.get(position))
                .into(holder.imageview);

        holder.textview.setText(mnames.get(position));

    }

    @Override
    public int getItemCount() {
        return mimages.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageview;
        TextView textview;

        public ViewHolder(View itemView) {
            super(itemView);
            imageview=itemView.findViewById(R.id.imageview);
            textview=itemView.findViewById(R.id.textview);
        }
    }
}
