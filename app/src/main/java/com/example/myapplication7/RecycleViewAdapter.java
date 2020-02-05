package com.example.myapplication7;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.RecycleViewHolder> {

    String[] testStringArray = new String[]{
            "Test1", "Test2", "Test3", "Test4"
    };

    @NonNull
    @Override
    public RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layautIdForItem = R.layout.recycle_view_element;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layautIdForItem, parent, false);
        RecycleViewHolder recycleViewHolder = new RecycleViewHolder(view);
        return recycleViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder holder, int position) {

        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class RecycleViewHolder extends RecyclerView.ViewHolder {
        TextView recycleViewElementText;

        public RecycleViewHolder(@NonNull View itemView) {
            super(itemView);
            recycleViewElementText = itemView.findViewById(R.id.rv_text_element);
        }

        void bind(int position) {
            recycleViewElementText.setText(String.valueOf(testStringArray[position]));

        }

    }


}
