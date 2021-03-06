package com.takwolf.android.hfrecyclerviewdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.takwolf.android.hfrecyclerview.HeaderAndFooterRecyclerView;
import com.takwolf.android.hfrecyclerviewdemo.R;
import com.takwolf.android.hfrecyclerviewdemo.adapter.LinearVerticalAdapter;
import com.takwolf.android.hfrecyclerviewdemo.listener.NavigationFinishClickListener;
import com.takwolf.android.hfrecyclerviewdemo.model.ApiClient;
import com.takwolf.android.hfrecyclerviewdemo.viewholder.OptionViewHolder;
import com.takwolf.android.hfrecyclerviewdemo.viewholder.VerticalHeader;

public class LinearVerticalActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.recycler_view)
    HeaderAndFooterRecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        ButterKnife.bind(this);

        toolbar.setTitle("Linear Vertical");
        toolbar.setNavigationOnClickListener(new NavigationFinishClickListener(this));

        new OptionViewHolder(this, recyclerView, OptionViewHolder.ORIENTATION_VERTICAL);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        new VerticalHeader(this, recyclerView);
        new VerticalHeader(this, recyclerView);
        new VerticalHeader(this, recyclerView);
        new VerticalHeader(this, recyclerView);
        new VerticalHeader(this, recyclerView);
        new VerticalHeader(this, recyclerView);
        new VerticalHeader(this, recyclerView);
        new VerticalHeader(this, recyclerView);
        new VerticalHeader(this, recyclerView);
        new VerticalHeader(this, recyclerView);
        new VerticalHeader(this, recyclerView);
        new VerticalHeader(this, recyclerView);
        new VerticalHeader(this, recyclerView);
        new VerticalHeader(this, recyclerView);
        new VerticalHeader(this, recyclerView);
        new VerticalHeader(this, recyclerView);

        LinearVerticalAdapter adapter = new LinearVerticalAdapter(this);
        adapter.getIllustList().addAll(ApiClient.buildIllustList());
        recyclerView.setAdapter(adapter);
    }

}
