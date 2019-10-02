package com.proj_207b.travelexperts.datamanagement.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.proj_207b.travelexperts.datamanagement.R;

public class MasterActivity extends AppCompatActivity {

    private ArrayAdapter<String> adapter;

    private ListView listView_Tables;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);

        // Initialize controls
        listView_Tables = findViewById(R.id.listView_Tables);

        String[] tables = {
                "Agents",
                "Customers"
        };

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tables);

        listView_Tables.setAdapter(adapter);
    }
}
