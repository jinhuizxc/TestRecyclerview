package com.example.jh.testrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<ItemVO> mList = new ArrayList<ItemVO>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定id
        bindID();
        //添加数据
        addData();
        //创建LinearLayoutManager
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        //设置
        recyclerView.setLayoutManager(manager);
        //实例化适配器
        MyAdapter myAdapter = new MyAdapter(mList);
        //设置适配器
        recyclerView.setAdapter(myAdapter);
    }

    private void addData() {
        for (int i = 0; i < 50; i++) {
            ItemVO itemVO = new ItemVO(R.mipmap.ic_launcher, i + ":Hello World!");
            //添加到数组
            mList.add(itemVO);
            itemVO = null;
        }
    }

    private void bindID() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    }
}