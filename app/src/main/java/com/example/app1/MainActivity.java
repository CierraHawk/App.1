package com.codepath.rkpandey.simpletodo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app1.ItemsAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> items;

    Button button1;
    EditText eItem;
    RecyclerView Items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = button1.findViewById();
        eItem = eItem.findViewById();
        Items = Items.findViewById();


        items = new ArrayList<>();
        items.add("Buy Milk");
        items.add("Go to the gym");
        items.add("Have fun!");

        ItemsAdapter itemsAdapter = new ItemsAdapter();
        Items.setAdapter(itemsAdapter);
        Items.setLayoutManager(new LinearLayoutManager(context: this));

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String todoItem = eItem.getText().toString();
            }
        }
    };

    private void setContentView(int activity_main) {
    }
}