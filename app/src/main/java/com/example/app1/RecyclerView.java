package com.example.app1;

import android.support.annotation.NonNull;
import android.view.View;

public class RecyclerView {
    public RecyclerView findViewById() {
    }

    public class ViewHolder {
        public ViewHolder(View itemView) {

        }
    }

    public static abstract class Adapter<T> {
        // responsible for binding data to a particular view holder
        public abstract void onBindViewHolder(@NonNull ItemsAdapter.ViewHolder holder, int position);
    }
}
