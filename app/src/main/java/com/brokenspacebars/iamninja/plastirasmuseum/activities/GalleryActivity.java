package com.brokenspacebars.iamninja.plastirasmuseum.activities;

/**
 * Created by iamninja on 6/10/15.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.brokenspacebars.iamninja.plastirasmuseum.R;
import com.brokenspacebars.iamninja.plastirasmuseum.extras.RecyclerViewAdapter;
import com.brokenspacebars.iamninja.plastirasmuseum.extras.ViewModel;

import java.util.ArrayList;
import java.util.List;


public class GalleryActivity extends AppCompatActivity implements RecyclerViewAdapter.OnItemClickListener {

    private static List<ViewModel> items = new ArrayList<>();

    static {
        for (int i = 1; i <= 10; i++) {
            items.add(new ViewModel("Item " + i, "http://lorempixel.com/500/500/animals/" + i));
        }
    }

    private View content;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_gallery);

//        initRecyclerView();
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(items);
        adapter.setOnItemClickListener(this);
        recyclerView.setAdapter(adapter);

        content = findViewById(R.id.content);

    }

    private void initRecyclerView() {
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(items);
        adapter.setOnItemClickListener(this);
        recyclerView.setAdapter(adapter);
    }


    @Override public void onItemClick(View view, ViewModel viewModel) {
        PhotoActivity.navigate(this, view.findViewById(R.id.image), viewModel);
    }
}
