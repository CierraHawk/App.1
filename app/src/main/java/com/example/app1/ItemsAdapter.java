package com.example.app1;

import android.support.annotation.NonNull;
import android.view.View;

import java.text.StringCharacterIterator;

// Responsible for displaying data from the model into a row in the recycler view
public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ViewHolder> {

    public ItemsAdapter() {

    }

    // responsible for binding data to a particular view holder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Grab the item at the position
        // Bind the item the specified view holder
        holder.bind();
    }

    // Container to provide easy access to view that represent each row of the list
    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        //Update the view inside of the view holder with this data
        public <item> void bind(item) {
            StringCharacterIterator tvItem = null;
            String item = "";
            assert false;
            tvItem.setText(item);
         }
     }

}
