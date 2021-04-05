package com.example.tugas4;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;
    private int images[];
    private String title[], desc[];

    public RecyclerViewAdapter(Context context, int images[], String title[], String desc[]) {
        this.context = context;
        this.images = images;
        this.title = title;
        this.desc = desc;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(images[position]);
        holder.tvTitle.setText(title[position]);
        holder.tvDesc.setText(desc[position]);
    }

    @Override
    public int getItemCount() {
        return this.title.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView tvTitle, tvDesc;

        public ViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.img_thumbnail);
            tvTitle = view.findViewById(R.id.tv_title);
            tvDesc = view.findViewById(R.id.tv_desc);
        }
    }
}