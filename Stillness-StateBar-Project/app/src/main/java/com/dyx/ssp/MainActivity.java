package com.dyx.ssp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dyx.ssp.adapter.MainActAdapter;
import com.dyx.ssp.view.DividerItemDecoration;
import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends Activity {

    @Bind(R.id.rv_main)
    RecyclerView rvMain;
    private MainActAdapter mMainActAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        SystemBarTintManager tintManager = new SystemBarTintManager(this);
        tintManager.setStatusBarTintEnabled(true);
        tintManager.setNavigationBarTintEnabled(true);


        mMainActAdapter = new MainActAdapter(getDatas());
        rvMain.setLayoutManager(new LinearLayoutManager(this));
        rvMain.setHasFixedSize(true);
        rvMain.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));
        rvMain.setAdapter(mMainActAdapter);
    }

    private List<String> getDatas() {
        List<String> datas = new ArrayList<>();
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        datas.add("A");
        return datas;
    }
}
